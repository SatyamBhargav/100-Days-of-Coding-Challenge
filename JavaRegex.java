/*
 * Question of the day
 * https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
 */

import java.util.*;

public class JavaRegex {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String valid = "([0-9]{1,2}|[2][0-5]{1,2}|[0][0-9]{1,2}|[1][0-9]{1,2}|[2][0-4][0-9])";

    while (input.hasNextLine()){
        String ip = input.nextLine();
    if (ip.matches(valid + "\\." + valid + "\\." + valid + "\\." + valid)){
        System.out.println("true");
    } else{
        System.out.println("false");
    }
}
}
}