import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        String[] strArr = new String[] { "AAA", "BBB", "CCC", "DDD" };
        String[] answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
