import java.util.*;
public class MatrixOperations {

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static int[][] transposeMatrix(int[][] mat) {
        int[][] res = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++)
                res[j][i] = mat[i][j];
        return res;
    }

    public static int determinant2x2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }

    public static int determinant3x3(int[][] mat) {
        return mat[0][0]*(mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1])
                - mat[0][1]*(mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0])
                + mat[0][2]*(mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0]);
    }

    public static double[][] inverse2x2(int[][] mat) {
        double det = determinant2x2(mat);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / det;
        inv[0][1] = -mat[0][1] / det;
        inv[1][0] = -mat[1][0] / det;
        inv[1][1] = mat[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] mat) {
        double det = determinant3x3(mat);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] = (mat[1][1]*mat[2][2] - mat[1][2]*mat[2][1]) / det;
        inv[0][1] = -(mat[0][1]*mat[2][2] - mat[0][2]*mat[2][1]) / det;
        inv[0][2] = (mat[0][1]*mat[1][2] - mat[0][2]*mat[1][1]) / det;
        inv[1][0] = -(mat[1][0]*mat[2][2] - mat[1][2]*mat[2][0]) / det;
        inv[1][1] = (mat[0][0]*mat[2][2] - mat[0][2]*mat[2][0]) / det;
        inv[1][2] = -(mat[0][0]*mat[1][2] - mat[0][2]*mat[1][0]) / det;
        inv[2][0] = (mat[1][0]*mat[2][1] - mat[1][1]*mat[2][0]) / det;
        inv[2][1] = -(mat[0][0]*mat[2][1] - mat[0][1]*mat[2][0]) / det;
        inv[2][2] = (mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0]) / det;
        return inv;
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = generateMatrix(3, 3);
        int[][] b = generateMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(a);

        System.out.println("Matrix B:");
        displayMatrix(b);

        System.out.println("Addition:");
        displayMatrix(addMatrices(a, b));

        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(a, b));

        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrices(a, b));

        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(a));

        System.out.println("Determinant of A:");
        System.out.println(determinant3x3(a));

        System.out.println("Inverse of A:");
        double[][] inv = inverse3x3(a);
        if (inv == null) System.out.println("Matrix is singular, no inverse.");
        else displayMatrix(inv);
    }
}
