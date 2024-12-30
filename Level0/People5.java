import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class People5 {
    public static void main(String[] args) {
        String[] names = { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" };
        List<String> list = new ArrayList<>();
        for (int i = 0; i < names.length; i += 5) {
            list.add(names[i]);
        }
        System.out.println(Arrays.toString(list.toArray(new String[list.size()])));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181886
