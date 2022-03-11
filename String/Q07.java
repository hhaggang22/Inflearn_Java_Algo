import java.util.*;

public class Q07 {

    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();

        /*
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                answer = "NO";
            }
        }
        */
        
        String temp = new StringBuilder(str).reverse().toString();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)!= temp.charAt(i)){
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q07 T = new Q07();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(T.solution(str));
    }
    
}
