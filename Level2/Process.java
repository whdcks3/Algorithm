package Level2;

import java.util.Collections;
import java.util.PriorityQueue;


public class Process {
    public static void main(String[] args) {
        int[] Priorities = new int[] {2, 1, 3, 2};
        int location = 2;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        int ret = 0;
            // 우선순위 큐에 우선순위 요소 추가
            for (int i : Priorities){
                q.offer(i);    
            }

            // 큐가 빌 때까지 반복
            while (!q.isEmpty()) { // [3, 2, 2, 1]
                for (int i=0; i<Priorities.length;i++){
                    // 현재 위치에 작업에 대한 위치 확인
                    if (q.peek() == Priorities[i]){
                        q.poll();
                        ret++;
                        

                        // 현재 작업이 location과 같으면 ret 반환
                        if (location == i){
                            System.out.println(ret);
                        }
                    }
                }
            }
    }
}
