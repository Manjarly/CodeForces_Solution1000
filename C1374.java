package solution1000;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class C1374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
//        int = char - 'a'
        int t = sc.nextInt();
        while(t-- > 0) {
        	int n = sc.nextInt();
        	String s = sc.next();
        	int ans = 0, count = 0;
        	for(int i = 0; i < n; i++) {
        		if(s.charAt(i) == '(') count++;
        		else {
        			count--;
        			if(count < 0) {
        				count = 0;
        				ans++;
        			}
        		}
        	}
        	System.out.println(ans);
        }
        sc.close();
    }
}