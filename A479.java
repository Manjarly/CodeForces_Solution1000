
package solution1000;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
     
public class A479 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] result = new int[6];
        result[0] = (a+b+c);
        result[1] = (a*b*c);
        result[2] = (a+(b*c));
        result[3] = ((a+b)*c);
        result[4] = ((a*b)+c);
        result[5] = (a*(b+c));
        System.out.println(Arrays.stream(result).max().orElse(Integer.MAX_VALUE));
    }
}