
// Max subarray 
/* 
import java.util.*;

public class Array2 {
    static void maxSub(int num[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {

                    sum = sum + num[k];
                }
                System.out.println("sum : " + sum);
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maxsum : " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        maxSub(num);
    }
}
*/

/* 
//max sum another method
import java.util.*;

public class Array2 {
    static void maxSub(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int num[] ={-2,-3,4,-1,-2,1,5,-3};
        maxSub(num);
    }
}
*/

// Trapping rainwater
/* 
import java.util.*;

public class Array2 {
static int trappRainwater(int height[]){
    int n =height.length;
    int leftMax[]= new int[n];
    leftMax[0]=height[0];
    for(int i=1;i<n;i++){
        leftMax[i]=Math.max(height[i], leftMax[i-1]);
    }

    int rightMax[]=new int [n];
    rightMax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        rightMax[i]=Math.max(height[i], rightMax[i+1]);
    }
    int trapwater=0;
    for(int i=0; i<n; i++){
        int waterLevel = Math.min(leftMax[i], rightMax[i]);
        trapwater+=waterLevel-height[i];
    }
return trapwater;
}

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappRainwater(height));
    }
}
*/