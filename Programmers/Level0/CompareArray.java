package Programmers.Level0;

public class CompareArray {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 100, 17, 84, 1 };
        int[] arr2 = new int[] { 55, 12, 65, 36 };

        if (arr1.length > arr2.length) {
            System.out.println(1);
        } else if (arr1.length < arr2.length) {
            System.out.println(-1);
        } else if (arr1.length == arr2.length) {
            int arr1s = 0;
            int arr2s = 0;
            for (int i = 0; i < arr1.length; i++) {
                arr1s += arr1[i];
                arr2s += arr2[i];
            }
            if (arr1s == arr2s) {
                System.out.println(0);
            } else if (arr1s > arr2s) {
                System.out.println(1);
            } else
                System.out.println(-1);
        }
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/181856
