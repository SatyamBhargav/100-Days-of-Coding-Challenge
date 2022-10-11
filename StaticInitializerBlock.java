/*
 * Question of the day
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */


import java.util.Scanner;

public class StaticInitializerBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        if (b>0 && h>0) {
            System.out.println(b*h);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }
}
