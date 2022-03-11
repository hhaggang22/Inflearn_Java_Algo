import java.util.*;

public class Q10 {
    public int[] solution(String str, char c){
        int[] answer = new int[str.length()];
        int p = 1000;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                p = 0;
                answer[i] = p;
            }
            else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000; //다시 초기화 해줘야함
        for(int k = str.length()-1; k > -1; k--){
            if(str.charAt(k) == c){
                p = 0; 
            }
            else{
                p++;
                if(answer[k] > p) answer[k] = p;
                //answer[k] = Math.min(answer[k], p);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q10 T = new Q10();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);
        
        for(int x : T.solution(str, c)){
            System.out.print(x + " ");
        }
    }
    
}
