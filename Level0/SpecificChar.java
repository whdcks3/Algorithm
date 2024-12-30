public class SpecificChar {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";

        String answer = my_string.replaceAll(alp, alp.toUpperCase());
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181873