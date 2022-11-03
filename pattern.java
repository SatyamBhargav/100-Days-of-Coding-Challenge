package pattern;

public class pattern {
    
    public static void all(int n, int m) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void dec(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void revdes2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void revdes(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numdes(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(i);
                }
                //System.out.println();
            }
            System.out.println();
        }
    }

    public static void rightpointdim(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = n-1; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void rightdec(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print("--");
            }
            for(int col=1;col <= row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void revrightdec(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for (int col = row; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pri(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print("  ");
            }
            for(int col=1;col < row;col++){
                System.out.print("* ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void revpri(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for(int col=row;col <= n;col++){
                System.out.print("* ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void dim(int n) {
        for (int row = 1; row < n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print("  ");
            }
            for(int col=1;col < row;col++){
                System.out.print("* ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for(int col=row;col <= n;col++){
                System.out.print("* ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int col = 5; col > row; col--) {
                System.out.print("  ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int col = 5; col > row; col--) {
                System.out.print("  ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        butterfly(5);

        // all(3,4);
        // System.out.println();
        // dec(5);
        // System.out.println();

        // revdes(5);
        // System.out.println();

        // revdes2(5);
        // System.out.println();

        // numdes(5);
        // System.out.println();

        // rightpointdim(5);
        // System.out.println();

        // rightdec(5);
        // System.out.println();

        // revrightdec(5);
        // System.out.println();

         pri(5);
        // System.out.println();

        // revpri(5);
        // System.out.println();

        // dim(5);
    }
}
