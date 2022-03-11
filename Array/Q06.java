package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q06 {
    public ArrayList<Integer> solution(String[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(String x : arr){
            String tmp = new StringBuilder(x).reverse().toString(); //숫자로 된 문자열을 뒤집음
            int num = Integer.parseInt(tmp); //뒤집은 문자열을 정수로 변환
            boolean isPrime = true;

            if(num == 1){
                continue;
            }

            for(int i=2; i<num; i++){ //소수인지 판별  
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                answer.add(num);
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Q06 T = new Q06();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }

        for(int x : T.solution(arr)){
            System.out.print(x + " ");
        }
    }
}
