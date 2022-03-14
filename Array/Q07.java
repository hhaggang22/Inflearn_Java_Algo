package Array;

import java.util.Scanner;

public class Q07 {
    public int solution(int n, int[] arr){
        /* 첫번째 생각
        int sum = 0;
        int tmp = 0; 

        for(int i=1; i<n; i++){
            if(arr[i] == 1){
                tmp++;
            }
            else{
                tmp = 0; 
            }
            sum += tmp;
        }

        return sum;
        */

        // 두번째 생각
        int answer = 0, tmp = 0; 
        int[] narr = new int[n];

        for(int i=1; i<n; i++){
            if(arr[i] == 1){
                tmp++;
            }else{
                tmp = 0;
            }
            narr[i] = tmp; 
        }

        for(int x : narr){
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args){
        Q07 T = new Q07();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n, arr));
    }
    
}
