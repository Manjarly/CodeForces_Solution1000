
package solution1000;

import java.util.Scanner;

public class A118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'A' ||
               ch[i] == 'E' ||
               ch[i] == 'I' ||
               ch[i] == 'O' ||
               ch[i] == 'U' ||
               ch[i] == 'a' ||
               ch[i] == 'e' ||
               ch[i] == 'i' ||
               ch[i] == 'o' ||
               ch[i] == 'u' ||
               ch[i] == 'Y' ||
               ch[i] == 'y'){
            }
            else{
                sb.append(Character.toLowerCase(ch[i]));
            }
        }
        StringBuilder sb1 = new StringBuilder();
        sb1.append('.');
        for(int i = 0; i < sb.length(); i++){
            sb1.append(sb.charAt(i));
            sb1.append('.');
        }
        String result = sb1.substring(0, sb1.length()-1);
        System.out.println(result);
    }
}