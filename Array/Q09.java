package Array;

import java.util.Scanner;

public class Q09 {
    public int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;

        //행, 열의 합
        int sum1, sum2; //sum1은 행의 합, sum2는 열의 합
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        //대각선 두개의 합
        sum1 = sum2 = 0;
        for(int i = 0; i<n; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args){
        Q09 T = new Q09();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
    
}