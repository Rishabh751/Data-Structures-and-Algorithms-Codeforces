import java.util.*;
public class Prob_281A {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        char c = sb.charAt(0);
        c = Character.toUpperCase(c); 
        sb.setCharAt(0, c);
        System.out.println(sb);
        sc.close();
    }
}