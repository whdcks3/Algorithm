import java.util.ArrayList;
import java.util.List;

public class VerticalRead {
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i += m) {
            String sub = my_string.substring(i, i + m);
            result.add(sub);
        }

        String answer = "";
        for (String str : result) {
            answer += str.substring(c - 1, c);
        }
        System.out.println(answer);
    }
}
