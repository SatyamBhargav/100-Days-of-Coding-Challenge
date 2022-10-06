/*
 * Question of the day
 * https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
 */

import java.util.*;;
public class Palendrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len = A.length();
        String s1 = "";
        for (int i = len-1; i >= 0; i--) {
            String a = String.valueOf(A.charAt(i));
            s1 += a;
        }
        if (A.equals(s1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}