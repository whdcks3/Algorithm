public class RPS {
    public static void main(String[] args) {
        String rsp = "2";
        String[] arr = rsp.split("");
        String answer = "";

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("2")){
                answer+="0";
            }else if(arr[i].equals("0")){
                answer+="5";
            }else{
                answer+="2";
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120839