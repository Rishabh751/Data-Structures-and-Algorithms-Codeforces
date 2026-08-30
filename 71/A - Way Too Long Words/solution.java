import java.util.*;
public class Prob_71A {
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i]= sc.next();
        }
        for(int i = 0; i<n; i++){
            int l = s[i].length();
            if(l>10){
                int a = l-2;
                System.out.println("" + s[i].charAt(0)+ a + s[i].charAt(l-1));
            }
            else{
                System.out.println(s[i]);
            }
    }
    sc.close();
    }
}