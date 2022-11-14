import java.util.Arrays;

public class Concept_Sorting {

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void BubbleSort(int[] arr){
        boolean swapp;
        for (int i = 0; i < arr.length; i++) {
            swapp = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]) {
                    swap(arr, j, j-1);
                    swapp = true;
                }
            }
            if (!swapp) {
                break;
            }
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]< arr[j-1]) {
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,6,3,7,90,87,3};
        //BubbleSort(arr);
        //selection(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
}
