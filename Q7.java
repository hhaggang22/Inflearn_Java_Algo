import java.util.*;

public class Q7 {

    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                answer = "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q7 T = new Q7();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(T.solution(str));
    }
    
}
