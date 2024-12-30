public class AddDigit {
    public static void main(String[] args) {
        int n = 1234;
        String str = String.valueOf(n);// "1234"
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120906