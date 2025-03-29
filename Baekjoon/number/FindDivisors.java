package Baekjoon.number;

import java.util.Scanner;

public class FindDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();
        int count = 0;
        int result = 0;

        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                count++;
            }
            if (count == q) {
                result = i;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
// https://www.acmicpc.net/problem/2501