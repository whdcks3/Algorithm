package Programmers.Level0;

public class Divede9 {
    public static void main(String[] args) {
        String number = "123";
        int answer = 0;
        int sum = 0;
        String[] number_list = number.split("");
        for (int i = 0; i < number_list.length; i++) {
            sum += Integer.parseInt(number_list[i]);
        }
        answer = sum % 9;
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181914