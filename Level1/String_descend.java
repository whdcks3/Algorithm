import java.util.Arrays;
import java.util.Collections;

public class String_descend {
    public static void main(String[] args) {
        String s="Zbcdefg";
        String answer="";
        String[] s1=s.split("");
        Arrays.sort(s1,Collections.reverseOrder());
        
        for(String a : s1){
            answer+=a;
        }
        System.out.println(answer);
    }
}
