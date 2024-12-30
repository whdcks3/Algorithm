package Programmers.Level_0;

public class Game369 {
    public static void main(String[] args) {
        int order = 3;
        int answer = 0;

        String orderStr = Integer.toString(order);
        String[] arr = orderStr.split(orderStr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120891