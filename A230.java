
package solution1000;


import java.util.Arrays;
import java.util.Scanner;

public class A230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        while(n > 0){
            int min = Arrays.stream(x).min().orElse(0);
            int index = findIndex(min, x);
            if(s <= min){
                System.out.println("NO");
                return;
            }
            else{
                s += y[index];
                x[index] = 999999;
                n--;
            }
        }
        System.out.println("YES");
    }
    
    public static int findIndex(int min, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(min == arr[i]) return i;
        }
        return 0;
    }
}