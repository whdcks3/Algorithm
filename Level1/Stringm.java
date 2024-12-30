public class Stringm {
    public static void main(String[] args) {
        String s="a234";
        boolean answer=false;

        if (s.length()==4|s.length()==6){
            try{
                int a = Integer.parseInt(s);
                answer=true;
                System.out.println(answer);
            }catch(NumberFormatException e){
                answer=false;
                System.out.println(answer);
            }
        }else{
            System.out.println(answer);
        }
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12918