package me.rainking;

/**
 * @author Rain
 * @description 807.求每行每列的最大值，然后确定每个位置行列最大值中的最小值。
 * 如：grid[0][0]，
 * @date 2018/5/5
 */
public class MaxIncreaseToKeepCitySkyline {
    public static void main(String[] args) {

        int[][] grid = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {

        int height = grid.length;
        int width = grid[0].length;

        int[] rowMax = new int[height];
        int[] colMax = new int[width];

        int oldSum = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                //获取数组总和
                oldSum += grid[i][j];
                //获取行最大值
                if (rowMax[i] < grid[i][j]) {
                    rowMax[i] = grid[i][j];
                }
                //获取列最大值
                if (colMax[j] < grid[i][j]) {
                    colMax[j] = grid[i][j];
                }
            }
        }

        int newSum = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                newSum += (rowMax[i] < colMax[j] ? rowMax[i] : colMax[j]);
            }
        }

        return newSum - oldSum;
    }

}
