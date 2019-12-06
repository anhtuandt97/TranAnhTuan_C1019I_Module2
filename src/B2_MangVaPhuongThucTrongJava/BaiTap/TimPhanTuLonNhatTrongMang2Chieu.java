package B2_MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix;
        System.out.print("Enter a row:");
        int row = scanner.nextInt();
        System.out.print("Enter a collum:");
        int collum = scanner.nextInt();

        matrix = new int[row][collum];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element" + (i + 1) + " : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Property list: ");
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int indexRow = 1;
        int indexCollum = 1;
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            indexRow = i;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indexCollum = j + 1;
                }
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at row " + indexRow + ", at collum " + indexCollum);
    }
}
