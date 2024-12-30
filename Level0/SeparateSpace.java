import java.util.Arrays;

public class SeparateSpace {
    public static void main(String[] args) {
        String my_string = " i    love  you";
        my_string = my_string.trim();
        String[] arr = my_string.split("\\s+");
        System.out.println(Arrays.toString(arr));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181868