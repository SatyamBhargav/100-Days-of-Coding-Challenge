/*
 * Question of the day
 * https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
 * 
 * RUN THE FOLLOWING CODE IN JAVA 7
 */

 /*
  * READ
  * Number Formate class & .getCurrencyInstance method
  */


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class NumberFormating {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double num = sc.nextDouble();
       NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
       NumberFormat i = NumberFormat.getCurrencyInstance (new Locale("en", "IN"));
       NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
       NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
       System.out.println("US: " + u.format(num));
       System.out.println("India: " + i.format(num));
       System.out.println("China: " + c.format(num));
       System.out.println("France: " + f.format(num));
    }
}