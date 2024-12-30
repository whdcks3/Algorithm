public class oddEven {
    public static void main(String[] args) {
        int[] num_list = { 4, 2, 6, 1, 7, 6 };
        int cnt_o = 0;
        int cnt_e = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                cnt_o += num_list[i];
            } else {
                cnt_e += num_list[i];
            }
        }
        if (cnt_o > cnt_e) {
            System.out.println(cnt_o);
        } else {
            System.out.println(cnt_e);
        }
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181887