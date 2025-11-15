/* 
// bubble Sort time complex O(n^2)

public class BasicSort {
    static void buubleSort(int num[]) {
        for (int turn = 0; turn < num.length - 1; turn++) {
            for (int j = 0; j < num.length - 1 - turn; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }

    public static void main(String[] args) {
        int num[] = { 7, 3, 9, 4, 7, 5, 8, 4, 5, 2 };
        buubleSort(num);
    }
}
*/

/* 
// selection sort time complex O(n^2)
public class BasicSort {
    static void selectionSort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[min] > num[j]) {
                    min = j;
                }
            }
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 4, 6, 2, 6, 4, 8, 5, 6 };
        selectionSort(num);
    }
}
*/

/* 
// insertionSort time complex O(n^2)
public class BasicSort {
    static void insertionSort(int num[]) {
        for (int i = 1; i < num.length; i++) {
            int curr = num[i];
            int prev = i - 1;
            while (prev >= 0 && num[prev] > curr) {
                num[prev + 1] = num[prev];
                prev--;
            }
            num[prev + 1] = curr;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 6, 3, 7, 5, 3, 7, 6, 2, 9 };
        insertionSort(num);
    }
}
*/



/* 
//inbuilt Sort time complex O(logn)
import java.util.Arrays;

public class BasicSort {

    public static void main(String[] args) {
        int num[] = { 4, 6, 3, 8, 2, 8, 4 };
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
*/


/* 
import java.util.Arrays;
import java.util.Collections;

public class BasicSort {

    public static void main(String[] args) {
        Integer num[] = { 4, 6, 3, 8, 2, 8, 4 };
        Arrays.sort(num,Collections.reverseOrder());
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}

*/

public class BasicSort {

    public static void main(String[] args) {
        System.out.println("Hello, World!");

    }
}