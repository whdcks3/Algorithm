package Baekjoon.String;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        n = n.trim();
        String[] result = n.split(" ");
        if (n.equals("")) {
            System.out.println(0);
        } else {
            System.out.println(result.length);
        }
        sc.close();
    }
}
// https://www.acmicpc.net/problem/1152