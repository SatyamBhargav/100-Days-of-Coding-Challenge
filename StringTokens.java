/*
 * Question of the day
 * https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
 */

import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("[ !,?._'@]+", " ");
        StringTokenizer st = new StringTokenizer(s," ");  
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        scan.close();
        }
}

