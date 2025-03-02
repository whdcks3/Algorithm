package Baekjoon.Arrays;

import java.util.Scanner;

public class ChagedBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        int change;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            change = arr[I - 1];
            arr[I - 1] = arr[J - 1];
            arr[J - 1] = change;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}
// https://www.acmicpc.net/problem/10813