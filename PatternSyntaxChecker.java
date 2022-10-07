/*
 * Question of the day
 * https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
 */


import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String exampleOfPattern = "";
        int numberOfCases = Integer.parseInt(scan.nextLine());
				
        for (int i = 0; i < numberOfCases; i++) {
            try {
                exampleOfPattern = scan.nextLine();
                Pattern.compile(exampleOfPattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
