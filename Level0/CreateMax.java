import java.util.Arrays;

public class CreateMax {
    public static void main(String[] args) {
        int[] numbers = { 0, -31, 24, 10, 1, 9 };
        int num1 = 0;
        int num2 = 0;
        Arrays.sort(numbers);
        num1 = numbers[0] * numbers[1];
        num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        if (num1 < num2) {
            System.out.println(num2);
        } else {
            System.out.println(num1);
        }
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120862