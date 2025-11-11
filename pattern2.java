
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

/* 
public class pattern2 {
static void pt(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i)+1;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        pt(5);
    }
}
*/

/* 
public class pattern2 {
    static void pt(int n) {
        int count=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pt(5);
    }
}
*/

/* 
public class pattern2 {
    static void pt(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pt(5);
    }
}
*/

/* 
public class pattern2 {
    static void pt(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pt(5);
    }
}
*/

/* 
public class pattern2 {
    static void pt(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pt(5);
    }
}
*/

/* 
public class pattern2 {
    static void pt(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int a = 1; a <= row - i; a++) {
                System.out.print(" ");
            }
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
        pt(5, 5);
    }
}
*/


/* 
public class pattern2 {
    static void pt(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.err.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.err.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pt(8);
    }
}
*/