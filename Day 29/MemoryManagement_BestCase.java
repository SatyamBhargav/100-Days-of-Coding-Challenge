import java.util.Scanner;

public class MemoryManagement_BestCase {
    public static void main(String[] args) {
        int[] a = new int[20];
        int[] p = new int[20];
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Blocks");
        n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " +i+" Block Size");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number of Process");
        m = sc.nextInt();

        for (int j = 0; j < m ; j++) {
            System.out.println("Enter the " +j+" Block Size");
            p[j] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (p[j]<=a[i]) {
                    System.out.println("The process " +j+ " allocated to " +a[i]);
                    p[j]=10000;
                    break;
                }
            }
        }
        for (int j = 0; j < m; j++) {
            if (p[j]!=10000) {
                System.out.println("The process " +j+ " is not allocated");
            }
        }
        sc.close();
    }
}