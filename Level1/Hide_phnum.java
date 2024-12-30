public class Hide_phnum {
    public static void main(String[] args) {
        String phone_number ="01033334444";
        String answer="";
        String[] num =phone_number.split("");

        for(int i=0;i<phone_number.length();i++){
            if(i<phone_number.length()-4){
                answer+="*";
            }else{
                answer+=num[i];
            }
        }
        System.out.println(answer);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12948