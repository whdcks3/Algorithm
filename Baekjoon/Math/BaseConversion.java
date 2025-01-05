package Baekjoon.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int ex = Integer.parseInt(st.nextToken());
        br.close();

        int tmp = 1;
        int sum = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            char C = str.charAt(i);

            if ('A' <= C && C <= 'Z') {
                sum += (C - 'A' + 10) * tmp;
            } else {
                sum += (C - '0') * tmp;
            }
            tmp *= ex;
        }
        System.out.println(sum);
    }
}
// https://www.acmicpc.net/problem/2745