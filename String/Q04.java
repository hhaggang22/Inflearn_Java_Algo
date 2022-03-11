import java.util.*;

public class Q04 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        /*for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }*/

        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;

            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); //x로 하면 안됨
            answer.add(tmp);

        }


        return answer;
    }

    public static void main(String[] args){
        Q04 T = new Q04();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }

        for(String t : T.solution(n, str)){
            System.out.println(t);
        }
    }
    
}
