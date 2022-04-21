
package solution1000;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class A131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
        String s = sc.next();
        String onlyUpper = s.toUpperCase();
        String allUpperExceptOne = "";
        
        boolean point1 = false;
        if(onlyUpper.equals(s)) point1 = true;
        allUpperExceptOne += s.substring(0, 1).toLowerCase();
        allUpperExceptOne += s.substring(1, s.length()).toUpperCase();
        
        boolean point2 = false;
        if(allUpperExceptOne.equals(s)) point2 = true;
        
        String result = "";
        if(point1 || point2){
            for(int i = 0; i < s.length()-1; i++){
                String temp = s.substring(i, i+1);
                if(temp.toUpperCase().equals(s.substring(i, i+1)))
                    result += temp.toLowerCase();
                if(temp.toLowerCase().equals(s.substring(i, i+1)))
                    result += temp.toUpperCase();
            }
            String temp = s.substring(s.length() -1, s.length());
            if(temp.toUpperCase().equals(s.substring(s.length()-1, s.length())))
                    result += temp.toLowerCase();
                if(temp.toLowerCase().equals(s.substring(s.length() -1, s.length())))
                    result += temp.toUpperCase();
        }
        else
            result = s;
        
        System.out.println(result);
    }
}