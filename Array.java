/* 
import java.util.*;
public class Array {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println(marks[0]);
        System.out.println("marks length is : "+marks.length);
    }
}
*/

// passing arrays as arguments by pass by refrence

//linerar search time complex : O(n)
/* 
public class Array {
    static int linearSearch(int marks[], int key) {
        for (int i = 0; i <= marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 8;
        int index = linearSearch(marks, key);
        if (index == -1) {
            System.out.println("key not fond");
        } else {
            System.out.println("key found at " + index);
        }
    }
}
*/

//largest number
/* 
import java.util.*;

public class Array {
    static int largest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(largest(num));
    }
}*/

//largest number
/* 
import java.util.*;

public class Array {
    static int smallest(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(smallest(num));
    }
}
*/

//binary search time complex O(logn)
/* 
  public class Array {
  static int binarySearch(int num[],int key){
    int start=0,end=num.length-1;
    while (start<=end) {
        int mid=(start+end)/2;
        if (num[mid]==key) {
            return mid;
        }else if (num[mid]<key) {
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return -1;
  }
     public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(num, 9));
     }
  }
*/

//revese array
/* 
public class Array {
static void reverse(int num[]){
    int start=0,end=num.length-1;
    while (start<end) {
        int temp=num[start];
        num[start]=num[end];
        num[end]=temp;

        start++;
        end--;
    }
}
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
    
}
*/

/* 
public class Array {
    static void printPairs(int num[]) {

        for (int i = 0; i < num.length; i++) {
            int crr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("[" + crr + "," + num[j] + "]");
            }
            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        printPairs(num);
    }
}
*/


/* 
public class Array {
    static void subarray(int num[]) {
        int ts=0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = 1; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k]+" ");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total : "+ts);
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7 };
        subarray(num);
    }
}
*/

