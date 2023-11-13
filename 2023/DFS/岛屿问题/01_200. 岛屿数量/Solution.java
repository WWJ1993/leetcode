public class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    res++;
                    this.dfs(grid, r, c);
                }
            }
        }
        return res;
    }

    void dfs(char[][] grid, int r, int c) {
        if (this.inArea(grid, r, c) == true) {
            return;
        }

        if (grid[r][c] != '1') {
            return;
        }
        // 是陆地，继续往下钻
        grid[r][c] = '2';

        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);

    }

    boolean inArea(char[][] grid, int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }
}
