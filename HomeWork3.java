/**
 * Java 1. Homework 3
 * @author Viktoriia Saveleva
 * @version 24.2.2022
 */

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        intMassive0and1();
        emptyMassive100();
        multiMassive();
        doubleMassive();
        intLenMassive(5, 7);
    }

    static void intMassive0and1() {
        int[] intM = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(intM));
        for (int i = 0; i < intM.length; i++) {
            if (intM[i] == 0) {
                intM[i] = 1;
            } else {
                intM[i] = 0;
            }
        }
        System.out.println(Arrays.toString(intM));
    }

    static void emptyMassive100() {
        int[] emptyM = new int[100];
        for (int i = 0; i < emptyM.length; i++) {
            if (i == 0) {
                emptyM[i] = 1;
            } else {
                emptyM[i] = emptyM[i - 1] + 1;
            }
        }
        System.out.println(Arrays.toString(emptyM));

    }

    static void multiMassive() {
        int[] multiM = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multiM.length; i++) {
            if (multiM[i] < 6) {
                multiM[i] = multiM[i] * 2;
            }
        }
        System.out.println(Arrays.toString(multiM));
    }

    static void doubleMassive() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || ((i % 2) == 0 && (j % 2) == 0)) {
                    matrix[i][j] = 1;
                } 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void intLenMassive(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));

    }

}
