import java.util.*;
public class Prob_791A {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            a = a * 3;
            b = b * 2;
            if (a > b) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}