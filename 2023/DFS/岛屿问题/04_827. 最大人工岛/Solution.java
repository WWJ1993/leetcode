import java.util.Map;

class Solution {
    public int largestIsland(int[][] grid) {
        Map<Integer, Integer> map = new HashMap<>();
        this.maxAreaOfIsland(grid, map); // 计算每个岛屿的面积存入map里面
        for (int r = 0; i < grid.length; r++) {
            for (int c = 0; c < grid[i].length; c++) {
                if (grid[r][c] == 0) {

                }
            }
        }
    }

    // 最大岛屿
    public void maxAreaOfIsland(int[][] grid, Map<Integer, Integer> map) {
        int index = 2;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == 1) {
                    int res = Math.max(res, this.dfs(grid, r, c));
                    map.put(index, res);
                    index++;
                }
            }
        }

    }

    int dfs(int[][] grid, int r, int c, int index) {
        if (this.inArea(grid, r, c) == false)
            return 0;
        if (grid[r][c] != 1)
            return 0;
        grid[r][c] = index;
        return 1 + this.dfs(grid, r - 1, c)
                + this.dfs(grid, r + 1, c)
                + this.dfs(grid, r, c - 1)
                + this.dfs(grid, r, c + 1);
    }

    boolean inArea(int[][] grid, int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }
}
