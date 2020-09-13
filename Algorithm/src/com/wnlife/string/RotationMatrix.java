package com.wnlife.string;

/**
 * @author Wnlife
 * @create 2020-09-11 23:38
 */
public class RotationMatrix {
    public static void main(String[] args) {


    }

    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int[][] newmatrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                newmatrix[j][length-i-1]=matrix[i][j];
            }
        }
        for (int i = 0; i < length; i++) {
            System.arraycopy(newmatrix[i],0,matrix[i],0,length);
        }
    }
}
