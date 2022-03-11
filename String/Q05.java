import java.util.*;

public class Q05 {

    public String solution(String str){
        String answer = "";

        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
                    
        while(lt < rt){
            if(Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            else if (!Character.isAlphabetic(s[lt])){
                lt++;
            }
            else if (!Character.isAlphabetic(s[rt])){
                rt--;
            }
        }

        answer = String.valueOf(s);
        
        return answer;
    }

    public static void main(String[] args){
        Q05 T = new Q05();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.print(T.solution(s));
    }
    
}
