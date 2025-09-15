package Baekjoon.number;

import java.util.ArrayList;
import java.util.Scanner;

public class SumofDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            ArrayList<Integer> divisors = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.print(divisors.get(i));
                    if (i != divisors.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else if (n != sum) {
                System.out.println(n + " is NOT perfect.");
            }
        }
        sc.close();
    }
}
// https://www.acmicpc.net/problem/9506