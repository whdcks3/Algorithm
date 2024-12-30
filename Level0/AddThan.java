public class AddThan {
    public static void main(String[] args) {
        int[] numbers = new int[] { 34, 5, 71, 29, 100, 34 };
        int n = 123;
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181884