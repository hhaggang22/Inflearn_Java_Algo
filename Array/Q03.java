package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q03 {

    public ArrayList<String> solution(int n, int[] a, int[] b){
        ArrayList<String> answer = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(a[i] == b[i]){
                answer.add("D");
            }
            else if(((a[i] == 1) && (b[i] == 3)) || ((a[i] == 3) && (b[i] == 2)) || ((a[i] == 2) && (b[i] == 1))){
                answer.add("A");
            }
            else {
                answer.add("B");
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Q03 T = new Q03();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        for(String x : T.solution(n, a, b)){
            System.out.println(x);
        }
    }
    
}
