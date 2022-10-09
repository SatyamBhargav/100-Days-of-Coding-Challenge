/* Leetcode
 *
 * Question of the day
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * 
 * we need to print total num of numbera in the array whose number count is even.
 * ex :-
 * int[] arr = {12,53,669,5556,4269,123}
 * output :- 4 (b/c 12,53,5556 & 4269 have even number count i.e 2 & 4)
 */


public class EvenDigits {
   
    static int search(int[] arr){
        int supercount = 0;
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            while (arr[i]>0) {
                arr[i] = arr[i]/10;
                count++;
            }
            if (count%2 == 0 ) {
                supercount++;
            }
        }
        return supercount;
    }

    public static void main(String[] args) {
        int[] arr = {12,53,669,5556,4269,123};
        System.out.println(search(arr));
    }

}
