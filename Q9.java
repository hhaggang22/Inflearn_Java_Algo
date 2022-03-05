import java.util.Scanner;

public class Q9 {
    public int solution(String str) {
        String tmp = "";
        int answer = 0;

        /*  내 답
         * tmp = str.toUpperCase().replaceAll("[A-Z]","");
         */

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                tmp += x;
            }
        }

        answer = Integer.parseInt(tmp);
        return answer;
    }

    public static void main(String[] args) {
        Q9 T = new Q9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
