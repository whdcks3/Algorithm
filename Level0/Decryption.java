public class Decryption {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String answer = "";
        for (int i = code - 1; i < cipher.length(); i += code) {
            if (i % code == 0) {
                answer += cipher.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
