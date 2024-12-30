public class UpcaseLo {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120893