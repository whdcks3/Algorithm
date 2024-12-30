public class Close1 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 0 };
        int idx = 3;
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 && i >= idx) {
                answer = i;
                break;
            } else
                answer = -1;
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181898