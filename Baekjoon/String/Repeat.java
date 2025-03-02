package Baekjoon.String;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int count = sc.nextInt();
            String str = sc.next();
            String P = "";

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < count; k++) {
                    P += str.charAt(j);
                }
            }
            System.out.println(P);
        }
        sc.close();
    }
}
// https://www.acmicpc.net/problem/2675