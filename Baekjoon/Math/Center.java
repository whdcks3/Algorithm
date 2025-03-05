package Baekjoon.Math;

import java.util.Scanner;

public class Center {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println((int) Math.pow(Math.pow(2, N) + 1, 2));
    }
}
// https://www.acmicpc.net/problem/2903