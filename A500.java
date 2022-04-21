
package solution1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A500 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 1; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 1; i < n; i+=arr[i]){
            int ans = i + arr[i];
            if(ans == t){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}