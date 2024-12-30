public class FindNum {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        int answer = 0;

        String num1 = String.valueOf(num);
        String k1 = String.valueOf(k);
        String[] str = num1.split("");

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(k1)) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }

        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120904