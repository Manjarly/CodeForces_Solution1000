
package solution1000;

import java.util.Scanner;

public class A58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        int index = 0;
        String h = "hello";
        int n = ch.length;
        for(int i = 0; i < n; i++){
            if(ch[i] == h.charAt(index)){
                index++;
            }
            if(index == h.length()) break;
        }
        if(index == h.length()) System.out.println("YES");
        else System.out.println("NO");
    }
}