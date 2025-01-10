package Baekjoon.Math;

import java.io.IOException;
import java.util.Scanner;

public class BaseConversion2 {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Integer.toString(a, b).toUpperCase());
    }
}
// https://www.acmicpc.net/problem/11005
