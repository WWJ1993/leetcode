
class Solution {
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    res += this.dfs(grid, r, c);
                }

            }

        }
        return res;
    }

    int dfs(int[][] grid, int r, int c) {
        if (this.inArea(grid, r, c) == false || grid[r][c] == 0) {
            return 1;
        }
        if (grid[r][c] == 2) {
            return 0;
        }
        grid[r][c] = 2;
        return this.dfs(grid, r - 1, c)
                + this.dfs(grid, r + 1, c)
                + this.dfs(grid, r, c - 1)
                + this.dfs(grid, r, c + 1);

    }

    Boolean inArea(int[][] grid, int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }

}
