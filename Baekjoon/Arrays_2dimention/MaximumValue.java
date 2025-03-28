package Baekjoon.Arrays_2dimention;

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int x = 1, y = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i + 1;
                    y = y + 1;
                }
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
// https://www.acmicpc.net/problem/2566