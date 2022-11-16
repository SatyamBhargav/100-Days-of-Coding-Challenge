import java.util.Scanner;

public class MemoryManagement_WorstCase {
    public static void main(String[] args) {
        int p,n,t;
        int[] b = new int[50];

        System.out.println("Enter the number of unallocated space");
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the allocated memory space");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Memory space required for given process");
        p = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (b[i]<b[j]) {
                    t=b[j];
                    b[j]=b[i];
                    b[i]=t;
                }
            }
        }
        if (b[0]>=p) {
            System.out.println("Worst fit of the given process is " + b[0]);
        }else{
            System.out.println("The process does not fit it to any free memory");
        }
    }
}