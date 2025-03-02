package Baekjoon.Arrays;

import java.util.Scanner;

public class TheBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        int line;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            int I = sc.nextInt() - 1;
            int J = sc.nextInt() - 1;

            while (I < J) {
                line = arr[I];
                arr[I++] = arr[J];
                arr[J--] = line;
            }

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        sc.close();
    }
}
// https://www.acmicpc.net/problem/10811