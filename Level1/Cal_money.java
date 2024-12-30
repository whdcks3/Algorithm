public class Cal_money {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        long answer = 0;
        long total = 0;

        for(int i =0; i<count+1;i++){
            total+=price*i;
        }

        if(money<total){
            answer=total-money;
        }
        else answer=0;

        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/82612