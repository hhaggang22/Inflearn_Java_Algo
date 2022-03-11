import java.util.Scanner;

public class Q01 {

    public int solution(String str, char c) {
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char s : str.toCharArray())  {
            if  (s == c)
                
                answer++;
        }
        return answer;
    }

public static void main(String[] args) {

        Q01 T = new Q01();

        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);

        System.out.print(T.solution(str, c));
    }
}
