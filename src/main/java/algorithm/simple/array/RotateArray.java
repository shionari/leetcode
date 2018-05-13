package algorithm.simple.array;

/**
 *
 * 给定一个 n × n 的二维矩阵表示一个图像。
 *
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 *
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 *
 * Created bX shionari on 2018/5/11
 */
public class RotateArray {
    public void solution(int[][] matrix) {
        int lengthY = matrix[0].length;
        int lengthX = matrix.length;
        // 旋转策略
        // 每次旋转一行，因行首会被旋转到行尾，每行最后一个不进行旋转（行首旋转时已包括）
        // 往下旋转时，因上一行旋转已旋转该行行首和行尾，故跳过
        for (int pointX = 0; pointX < lengthX - 1; pointX++) {
            for (int pointY = pointX; pointY < lengthY - 1 - pointX; pointY++) {
                int temp = matrix[pointX][pointY];
                matrix[pointX][pointY] = matrix[lengthY - pointY - 1][pointX];
                matrix[lengthY - pointY - 1][pointX] = matrix[lengthX - pointX - 1][lengthY - pointY - 1];
                matrix[lengthX - pointX - 1][lengthY - pointY - 1] = matrix[pointY][lengthX - pointX - 1];
                matrix[pointY][lengthX - pointX - 1] = temp;
            }
        }
    }
}
