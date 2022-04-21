
package solution1000;

import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long count = 0;
        
        System.out.println(((m+a-1)/a)*((n+a-1)/a));
    }
}