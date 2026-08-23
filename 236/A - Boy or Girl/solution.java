import java.util.*;
public class Prob_236A {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.chars().distinct().count() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        }
        else
            System.out.println("IGNORE HIM!");
 
        sc.close();
    }
}