package Programmers.Level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenHate {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(IntStream.rangeClosed(0, n).filter(i -> i % 2 != 0).toArray()));

        //// for문
        // int n=15;
        // int[] answer=new int[(n+1)/2];
        // for(int i=0;i<=n;i++){
        // if (i%2!=0){
        // answer[i/2]=i;
        // }
        // }
        // System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120813