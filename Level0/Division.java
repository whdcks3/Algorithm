import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
            sc.close();
        } else {
            System.out.println(n + " is odd");
            sc.close();
        }
    }
}
