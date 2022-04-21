
package solution1000;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class A43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
//        int = char - 'a'
        int n, c=1, d=0;
        n = sc.nextInt();
        String s1 = sc.next();
        String s2;
        String s3 = "";
        for(int i = 0; i < n-1; i++){
            s2 = sc.next();
            if(s1.equals(s2)) c++;
            else{
                s3 = s2;
                d++;
            }
        }
        if(c > d) System.out.println(s1);
        else System.out.println(s3);
    }
}