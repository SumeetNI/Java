
/* 
//Hallow Rectangle
public class pattern2 {
    static void hallowRectane(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hallowRectane(8, 9);
    }
}
*/


/* 
public class pattern2 {
    static void hlfPy(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        hlfPy(8);
    }
*/

/*
public class pattern2 {
static void invertPy(int n){
     for (int i=1; i<=n; i++){
        for(int j=1; j<=n;j++){
            System.out.print(j);
        }
        System.out.println();
     }
}
    public static void main(String[] args) {
        invertPy(4);
    }

}
*/