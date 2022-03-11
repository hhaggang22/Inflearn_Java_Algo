package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01 {

    public ArrayList<Integer> solution(int[] narr){
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(narr[0]);
        
        for(int i=1; i<narr.length; i++){
            if(narr[i] > narr[i-1]){
                answer.add(narr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Q01 T = new Q01();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] narr = new int[n];

        for(int i=0; i<n; i++){
            narr[i] = sc.nextInt();
        }

        for(int x : T.solution(narr)){
            System.out.print(x + " ");
        }

    }
    
}
