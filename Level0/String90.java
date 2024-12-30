import java.util.Scanner;

public class String90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i, i + 1));
        }
        sc.close();
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181945