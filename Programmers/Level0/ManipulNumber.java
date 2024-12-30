package Programmers.Level0;

public class ManipulNumber {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        String[] new_control = control.split("");

        for (int i = 0; i < control.length(); i++) {
            if (new_control[i].equals("w")) {
                n += 1;
            } else if (new_control[i].equals("s")) {
                n -= 1;
            } else if (new_control[i].equals("d")) {
                n += 10;
            } else if (new_control[i].equals("a")) {
                n -= 10;
            }
        }
        System.out.println(n);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181926