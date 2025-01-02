package Programmers.Level_1;

import java.util.Scanner;

public class Max_min {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = Math.max(n, m);
        int b = Math.min(n, m);

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        sc.close();
        // 최대 공배수 = 두 수의 곱 / 최대공약수
        System.out.println(new int[] { a, n * m / a });

    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12940