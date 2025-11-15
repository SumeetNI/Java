/*
// 2d array input 
import java.util.*;

public class twoDarray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
*/

/* 
// 2d array search 
import java.util.*;

public class twoDarray {
    static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found :  " + i + "," + j + " ");
                    return true;

                }
            }
        }
        System.out.println("key is not found :");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        search(matrix, 5);
    }
}
*/

/* 
public class twoDarray {
static void spiral(int matrix[][]){
   
    int strow=0;
    int edrow=matrix.length-1;
    int stcol=0;
    int edcol=matrix[0].length-1;

    while (strow<=edrow&&stcol<=edcol) {
        
        //top
        for(int j=stcol;j<=edcol;j++){
            System.out.print(matrix[stcol][j]+ " ");
        }
        //right
        for(int i=strow+1;i<=edrow;i++){
            System.out.print(matrix[i][edcol]+ " ");
        }
        //bottom
        for(int j=edcol-1;j>=stcol;j--){
            if (strow==edrow) {
                break;
            }
            System.out.print(matrix[edrow][j]+ " ");
        }
        //top
        for(int i=edrow-1;i>=strow+1;i--){
            if (stcol==edcol) {
                break;
            }
            System.out.print(matrix[i][stcol]+ " ");
        }
        stcol++;
        strow++;
        edcol--;
        edrow--;

    }
}
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {2,4,5,3}};
        spiral(matrix);                
    }
    
}

    
*/


/* 
// Diognal sum of 2d array
public class twoDarray {
    static int diognalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];

                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diognalSum(matrix));

    }
}
*/
