import java.util.Scanner;

public class Q8 {
    public String solution(String str){
        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]","");
        /*for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                answer = "NO";
            }
        }*/
        //뒤집어진게 같으면 같은 것
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            answer = "YES";
        }

        return answer;
    }
    
    public static void main(String[] args){
        Q8 T = new Q8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
