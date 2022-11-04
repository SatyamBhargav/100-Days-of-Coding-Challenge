import java.util.Arrays;

public class BinarySearch {

    static int BSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int start = 0;
        int end = arr.length-1;
        
        while (start <= end) {
            
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                return 1;
            } else if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {12,53,669,5556,4269,123};
        
        System.out.println(BSearch(arr, 9));
    }
}
