public class Get_middle {
    public static void main(String[] args) {
        String s ="abcde";
        int leng = s.length();
        String answer="";

        if(leng%2==0){
            answer=s.substring(leng/2-1, leng/2+1);
        }else{
            answer=s.substring(leng/2,leng/2+1);
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12903