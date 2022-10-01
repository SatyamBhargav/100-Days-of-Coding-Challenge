/*
 * Question of the day
 * https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
 */

 /*
  * String.valueof() :-
  The Integer class has a static method that returns a String object representing the specified int parameter. 
  The argument is converted and returned as a string instance. 
  If the number is negative, the sign will be preserved.

  *Integer.toString() :- it does the same convet integer to string

  */

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String convert = String.valueOf(num);
        //String convert1 = Integer.toString(num);
        System.out.println("Good job");
        //System.out.println(convert1);

    }
}
