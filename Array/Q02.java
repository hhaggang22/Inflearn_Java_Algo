package Array;

import java.util.Scanner;

public class Q02 {

    public int solution(int n, int[] arr){
        int answer = 0, max = 0; 

        for(int x : arr){
            if(x > max){
                max = x;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q02 T = new Q02();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }
    
}
