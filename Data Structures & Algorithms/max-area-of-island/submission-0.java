class Solution {
    int[][] directions = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    int m;
    int n;
    int[][] grid;
    boolean[][] visited;
    int count;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        this.visited = new boolean[m][n];
        this.count = 0;
        int maxArea = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(!visited[i][j] && grid[i][j] == 1) {
                    dfs(i, j);
                    maxArea = Math.max(maxArea, count);
                }
                this.count = 0;
            }
        }
        return maxArea;
    }

    private void dfs(int i, int j) {
        visited[i][j] = true;
        count++;
        for(int[] dir: directions) {
            int x = i + dir[0];
            int y = j + dir[1];

            if(check(x, y) && grid[x][y] == 1 && !visited[x][y]) {
                dfs(x, y);
            }
        }
    }

    private boolean check(int x, int y) {
        return (x >= 0) && (x < m) && (y >= 0) && (y < n);
    }


}
