class Solution {

    class Node {
        int product;
        long[] cnt;

        Node(int k) {
            cnt = new long[k];
        }
    }

    int n;
    int k;

    Node[] tree;
    int[] nums;

    void build(int node, int start, int end) {

        if (start == end) {

            tree[node] = new Node(k);

            int rem = nums[start] % k;

            tree[node].product = rem;
            tree[node].cnt[rem] = 1;

            return;
        }

        int mid = (start + end) / 2;

        build(2 * node, start, mid);
        build(2 * node + 1, mid + 1, end);

        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    Node merge(Node left, Node right) {

        Node result = new Node(k);

        result.product = (left.product * right.product) % k;

     
        for (int r = 0; r < k; r++) {
            result.cnt[r] += left.cnt[r];
        }

      
        for (int r = 0; r < k; r++) {

            int newRemainder = (left.product * r) % k;

            result.cnt[newRemainder] += right.cnt[r];
        }

        return result;
    }

    void update(int node, int start, int end, int index, int value) {

        if (start == end) {

            int rem = value % k;

            tree[node].product = rem;

            for (int r = 0; r < k; r++) {
                tree[node].cnt[r] = 0;
            }

            tree[node].cnt[rem] = 1;

            return;
        }

        int mid = (start + end) / 2;

        if (index <= mid) {
            update(2 * node, start, mid, index, value);
        } else {
            update(2 * node + 1, mid + 1, end, index, value);
        }

        tree[node] = merge(tree[2 * node], tree[2 * node + 1]);
    }

    Node query(int node, int start, int end, int left, int right) {

        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        if (right <= mid) {
            return query(2 * node, start, mid, left, right);
        }

        if (left > mid) {
            return query(2 * node + 1, mid + 1, end, left, right);
        }

        Node leftNode = query(2 * node, start, mid, left, right);
        Node rightNode = query(2 * node + 1, mid + 1, end, left, right);

        return merge(leftNode, rightNode);
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {

        this.nums = nums;
        this.n = nums.length;
        this.k = k;

        tree = new Node[4 * n];

        build(1, 0, n - 1);

        int[] result = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {

            int index = queries[q][0];
            int value = queries[q][1];
            int start = queries[q][2];
            int x = queries[q][3];

          
            nums[index] = value;

            update(1, 0, n - 1, index, value);

          
            Node ans = query(1, 0, n - 1, start, n - 1);

            result[q] = (int) ans.cnt[x];
        }

        return result;
    }
}