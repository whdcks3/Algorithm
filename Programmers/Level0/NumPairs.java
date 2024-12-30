package Programmers.Level0;

import java.util.stream.IntStream;

public class NumPairs {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count());
        //// for문
        // int answer=0;
        // for(int i=1;i<=n;i++){
        // if (n%i==0){
        // answer++;
        // }
        // }
        // System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120836
