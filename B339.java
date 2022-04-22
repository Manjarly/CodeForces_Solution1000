
package solution1000;

import java.util.Scanner;

public class B339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int target;
        long time = 0;
        for(int i = 0; i < m; i++){
            target = arr[i]-1;
            if(start <= target){
                time += target - start;
            }
            else{
                time += n - start + target;
            }
            start = target;
        }
        System.out.println(time);
    }
}