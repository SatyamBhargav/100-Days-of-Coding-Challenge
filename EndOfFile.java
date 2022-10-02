/*
 * Question of the day
 * https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
 */

 /*
  * Scanner.hasNext()
  *The hasNext() is a method of Java Scanner class which returns true if this scanner has another token in its input
  */
import java.util.*;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while(sc.hasNext()==true)
        {
            i++;
            System.out.printf(i+" "+sc.nextLine()+"\n");
        }
        sc.close();
        
    }
}
