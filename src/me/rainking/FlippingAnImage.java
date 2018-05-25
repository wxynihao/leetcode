package me.rainking;

/**
 * @author Rain
 * @date 2018/5/25
 */
public class FlippingAnImage {
    public static void main(String[] args) {
        FlippingAnImage o = new FlippingAnImage();

        int[][][] int3D = {{{1, 1, 0}, {1, 0, 1}},
                {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}}};

        for (int[][] int2D : int3D) {
            int[][] result2D = o.flipAndInvertImage(int2D);

            System.out.print("[");
            for (int[] result1D : result2D) {
                System.out.print("[");
                for (int result : result1D) {
                    System.out.print(result + ",");
                }
                System.out.print("],");
            }
            System.out.println("]");
        }
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int length = A.length;
        int width = A[0].length;
        int[][] result = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = (A[i][width - 1 - j] ^ 1);
            }
        }
        return result;
    }
}
