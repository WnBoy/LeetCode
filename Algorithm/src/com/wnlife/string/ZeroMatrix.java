package com.wnlife.string;

import java.util.Arrays;

/**
 * @author Wnlife
 * @create 2020-09-12 0:10
 */
public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        Arrays.stream(matrix).forEach((arr)->{
            Arrays.stream(arr).forEach(System.out::println);
        });
    }

    public static void setZeroes(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i],0,newMatrix[i],0,matrix[0].length);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    setZeros(newMatrix, i, j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(newMatrix[i],0,matrix[i],0,newMatrix[0].length);
        }
    }

    public static void setZeros(int[][] newMatrix, int n, int m) {
        for (int i = 0; i < newMatrix.length; i++) {
            newMatrix[i][m] = 0;
        }
        for (int i = 0; i < newMatrix[0].length; i++) {
            newMatrix[n][i] = 0;
        }
    }
}
