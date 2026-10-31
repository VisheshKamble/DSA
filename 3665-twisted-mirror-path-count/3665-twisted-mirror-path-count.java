class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 1000000007;

        long[][] dp = new long[m][n];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) {
                    continue;
                }

                if (i == m - 1 && j == n - 1) {
                    continue;
                }

                if (j + 1 < n) {
                    int x = i;
                    int y = j + 1;
                    int dir = 0; 

                    while (x < m && y < n && grid[x][y] == 1) {
                        if (dir == 0) {
                            x++;
                            dir = 1;
                        } else {
                            y++;
                            dir = 0;
                        }
                    }

                    if (x < m && y < n) {
                        dp[x][y] = (dp[x][y] + dp[i][j]) % MOD;
                    }
                }

            
                if (i + 1 < m) {
                    int x = i + 1;
                    int y = j;
                    int dir = 1; 

                    while (x < m && y < n && grid[x][y] == 1) {
                        if (dir == 0) {
                            x++;
                            dir = 1;
                        } else {
                            y++;
                            dir = 0;
                        }
                    }

                    if (x < m && y < n) {
                        dp[x][y] = (dp[x][y] + dp[i][j]) % MOD;
                    }
                }
            }
        }

        return (int) dp[m - 1][n - 1];
    }
}