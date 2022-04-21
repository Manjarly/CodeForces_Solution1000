
package solution1000;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A379 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
        int a = sc.nextInt(), b = sc.nextInt();
        int curra = a;
        while(a >= b){
            curra += (a/b);
            a = (a/b) + (a%b);
        }
        System.out.println(curra);
    }
}