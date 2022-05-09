
package solution1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
//        int = char - 'a'
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = (n + 1) / 2 ;
        int ans = (min + m - 1) / m * m ;
        if(ans > n) ans = -1;
        System.out.println(ans);
        sc.close();
    }
}