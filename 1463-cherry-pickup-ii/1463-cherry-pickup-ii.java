class Solution {
    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][][] dp = new int[rows][cols][cols];

        for (int row = rows - 1; row >= 0; row--) {
            for (int col1 = 0; col1 < cols; col1++) {
                for (int col2 = 0; col2 < cols; col2++) {
                    int cherries = grid[row][col1];
                    if (col1 != col2) {
                        cherries += grid[row][col2];
                    }

                    if (row != rows - 1) {
                        int maxCherries = 0;
                        for (int newCol1 = col1 - 1; newCol1 <= col1 + 1; newCol1++) {
                            for (int newCol2 = col2 - 1; newCol2 <= col2 + 1; newCol2++) {
                                if (newCol1 >= 0 && newCol1 < cols && newCol2 >= 0 && newCol2 < cols) {
                                    maxCherries = Math.max(maxCherries, dp[row + 1][newCol1][newCol2]);
                                }
                            }
                        }
                        dp[row][col1][col2] = cherries + maxCherries;
                    } else {
                        dp[row][col1][col2] = cherries;
                    }
                }
            }
        }

        return dp[0][0][cols - 1];
    }
}
