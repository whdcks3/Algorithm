import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_num {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        List<Integer> list = new ArrayList<>();
        int[] answer={};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }

        if(list.size() == 0){
            answer = new int[]{-1};
        }else{
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        }
        System.out.println(Arrays.toString(answer));
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12910