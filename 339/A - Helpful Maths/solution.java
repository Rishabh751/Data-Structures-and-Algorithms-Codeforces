import java.util.*;
import java.util.Collections;
public class Prob_339A {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> num = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '+') {
                continue;
            } else {
                num.add(Character.getNumericValue(c));
            }
        }
        Collections.sort(num);
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + "");
            if (i == num.size()-1) {
                break;
            }
            System.out.print("+");
        }
        sc.close();
    }
}