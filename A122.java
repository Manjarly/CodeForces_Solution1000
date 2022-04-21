
package solution1000;

import java.util.ArrayList;
import java.util.Scanner;

public class A122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < n/2; i++){
            if(n%i == 0){
                list.add(i);
                list.add(n/i);
            }
        }
        int lucky = 0;
        int unlucky = 0;
        for(int i : list){
            lucky = 0;
            unlucky = 0;
            int temp = i;
            int digits = 0;
            
            while(temp > 0){
                digits++;
                temp /= 10;
            }
            temp = i;
            while(temp > 0){
                if(temp % 10 == 4 || temp % 10 == 7) lucky++;
                else unlucky++;
                temp /= 10;
            }
            if(unlucky == 0 && lucky > 0) break;
        }
        if(unlucky == 0 && lucky > 0) System.out.println("YES");
        else System.out.println("NO");
    }
}