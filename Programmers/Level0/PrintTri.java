package Programmers.Level0;

import java.util.Scanner;

public class PrintTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120823?language=java