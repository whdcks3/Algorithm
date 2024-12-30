package Programmers.Level_0;

public class ChangeIndex {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        String[] arr = my_string.split("");

        String num3 = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = num3;
        System.out.println(String.join("", arr));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120895