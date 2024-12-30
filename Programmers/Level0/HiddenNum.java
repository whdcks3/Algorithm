package Programmers.Level0;

public class HiddenNum {
    public static void main(String[] args) {
        int answer = 0;
        String my_string = "aAb1B2cC34oOp";
        String str = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = str.split("");

        for (String i : arr) {
            answer += Integer.parseInt(i);
        }
        System.out.println(answer);
    }
}