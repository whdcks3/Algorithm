import java.util.ArrayList;
import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {
        String myString = "axbxcxdx";

        String[] str = myString.split("x");
        ArrayList<String> arr = new ArrayList<>();

        for (String st : str) {
            if (!st.isEmpty()) {
                arr.add(st);
            }
        }

        String[] answer = arr.toArray(new String[arr.size()]);
        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181866