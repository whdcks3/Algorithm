public class Harshad {
    public static void main(String[] args) {
        boolean answer=false;
        int x = 10;
        int sum=0;

        String[] arr = Integer.toString(x).split("");
        for(String s : arr){
            sum+=Integer.parseInt(s);
        }

        if(x%sum==0){
            answer=true;
        }
        System.out.println(answer);
    }
}
