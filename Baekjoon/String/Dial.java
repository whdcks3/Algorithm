package Baekjoon.String;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int minute = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    minute += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    minute += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    minute += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    minute += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    minute += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    minute += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    minute += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    minute += 10;
                    break;
            }
        }
        sc.close();
        System.out.println(minute);
    }
}
// https://www.acmicpc.net/problem/5622