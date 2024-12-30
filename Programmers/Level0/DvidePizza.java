package Programmers.Level0;

public class DvidePizza {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i < 6 * n; i++) {
            if ((6 * i) % n == 0) {
                System.out.println(i);
            }
        }
    }
}
