public class ListString {
    public static void main(String[] args) {
        String[] arr = { "a", "b", "c" };
        String answer = "";

        for (String s : arr) {
            answer += s;
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181941