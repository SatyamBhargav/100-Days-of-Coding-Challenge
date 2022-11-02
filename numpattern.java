package pattern;

public class numpattern {
    public static void main(String[] args) {

        int n = 5;
        for (int row = 1, num = 1; row < n; row++,num++) {
            for (int col = row; col <= n; col++) {
                System.out.print("  ");
            }
            for(int col=1;col < row;col++){
                System.out.print(num + " ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        for (int row = 1, num = 5; row <= n; row++,num--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for(int col=row;col <= n;col++){
                System.out.print(num + " ");
            }
            for (int col = row; col < n; col++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
