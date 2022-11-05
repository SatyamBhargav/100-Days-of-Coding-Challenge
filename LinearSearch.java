import java.util.*;

public class LinearSearch {

    static  int searchelement(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return (i);
            }
        }
        return -1;
    }

    static boolean searchchar(String text, char target){
        if (text.length() == 0){
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            if (target == text.charAt(i)) {
                System.out.println(i);
                return true;
            }
        }
        return false;
    }

    static int searchin2Darray(int[][] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.println(i +""+ j);
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of array :- ");
        // int size = sc.nextInt();
        int[][] num = new int[3][3];
        // for (int i = 0; i < num.length; i++) {
        //     num[i] = sc.nextInt();
        // }
        // int a = searchelement(num,6);
        // System.out.println(a);

        // String text = "ello how are you";
        // char target = 'h';
        // System.out.println(searchchar(text, target));

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println(searchin2Darray(num, 9));
    }
}