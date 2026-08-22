import java.util.*;
 
public class Prob_231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[3];
        int count = 0;
        int s = 0;
        while (n != 0) {
            for (int i = 0; i < 3; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                s++;
            }
            count = 0;
            n--;
        }
        System.out.println(s);
        sc.close();
    }
}