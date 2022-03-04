import java.util.Scanner;

public class Q2 {
    public void solution(String str){

        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) 
                answer += Character.toUpperCase(x);
            else
                answer +=Character.toLowerCase(x);
        }

        System.out.print(answer);
    }
    public static void main(String[] args){
        Q2 T = new Q2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        T.solution(str);
        
    }
}
