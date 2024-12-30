public class StringWants {
    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";

        String answer = pat.toLowerCase();

        if (myString.toLowerCase().contains(answer)) {
            System.out.println(1);
        } else
            System.out.println(0);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181878