package Baekjoon.String;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str);
        }
        sc.close();
    }
}
// https://www.acmicpc.net/problem/11718