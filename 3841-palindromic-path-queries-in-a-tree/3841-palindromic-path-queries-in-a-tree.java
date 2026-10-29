import java.util.*;

class Solution {
    int[] tin, tout, depth, bit;
    int[][] up;
    int timer = 0;
    int LOG;
    char[] chars;

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
        chars = s.toCharArray();

        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        LOG = 1;
        while ((1 << LOG) <= n) {
            LOG++;
        }

        tin = new int[n];
        tout = new int[n];
        depth = new int[n];
        up = new int[n][LOG];
        bit = new int[n + 2];

        // Iterative DFS to avoid stack overflow
        int[] stackNode = new int[2 * n + 5];
        int[] stackParent = new int[2 * n + 5];
        boolean[] exiting = new boolean[2 * n + 5];

        int top = 0;
        stackNode[top] = 0;
        stackParent[top] = 0;
        exiting[top++] = false;

        while (top > 0) {
            top--;

            int u = stackNode[top];
            int p = stackParent[top];

            if (exiting[top]) {
                tout[u] = timer;
                continue;
            }

            tin[u] = ++timer;
            up[u][0] = p;
            depth[u] = (u == p) ? 0 : depth[p] + 1;

            for (int j = 1; j < LOG; j++) {
                up[u][j] = up[up[u][j - 1]][j - 1];
            }

            // Schedule exit after processing descendants
            stackNode[top] = u;
            stackParent[top] = p;
            exiting[top++] = true;

            for (int i = graph[u].size() - 1; i >= 0; i--) {
                int v = graph[u].get(i);

                if (v != p) {
                    stackNode[top] = v;
                    stackParent[top] = u;
                    exiting[top++] = false;
                }
            }
        }

        // Initialize root-to-node parity masks
        for (int u = 0; u < n; u++) {
            int mask = 1 << (chars[u] - 'a');

            rangeUpdate(tin[u], tout[u], mask);
        }

        List<Boolean> ans = new ArrayList<>();

        for (String q : queries) {
            String[] parts = q.split(" ");

            if (parts[0].equals("update")) {
                int u = Integer.parseInt(parts[1]);
                char c = parts[2].charAt(0);

                int oldMask = 1 << (chars[u] - 'a');
                int newMask = 1 << (c - 'a');

                int change = oldMask ^ newMask;

                if (change != 0) {
                    rangeUpdate(tin[u], tout[u], change);
                    chars[u] = c;
                }
            } else {
                int u = Integer.parseInt(parts[1]);
                int v = Integer.parseInt(parts[2]);

                int lca = findLCA(u, v);

                int mask = getMask(u) ^ getMask(v)
                         ^ (1 << (chars[lca] - 'a'));

                ans.add((mask & (mask - 1)) == 0);
            }
        }

        return ans;
    }

    // XOR update over an Euler Tour interval
    void rangeUpdate(int left, int right, int val) {
        updateBIT(left, val);
        updateBIT(right + 1, val);
    }

    void updateBIT(int index, int val) {
        while (index < bit.length) {
            bit[index] ^= val;
            index += index & -index;
        }
    }

    // XOR of all changes affecting this node
    int getMask(int u) {
        int index = tin[u];
        int res = 0;

        while (index > 0) {
            res ^= bit[index];
            index -= index & -index;
        }

        return res;
    }

    int findLCA(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int j = 0; j < LOG; j++) {
            if ((diff & (1 << j)) != 0) {
                u = up[u][j];
            }
        }

        if (u == v) {
            return u;
        }

        for (int j = LOG - 1; j >= 0; j--) {
            if (up[u][j] != up[v][j]) {
                u = up[u][j];
                v = up[v][j];
            }
        }

        return up[u][0];
    }
}