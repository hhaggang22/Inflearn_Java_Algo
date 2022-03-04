import java.util.*;

public class Q3 {
    public String solution(String str){
        String answer = "";
        int max = 0;
        String[] s = str.split(" ");

        for(String x : s){
            int len = x.length();
            if(len > max){
                max = len;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q3 T = new Q3();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.print(T.solution(str));

    }
    
}
 