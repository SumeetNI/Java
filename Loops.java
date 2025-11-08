/* 
public class Loops {

     public static void main(String[] args) {
        int i = 0;
        while (i<=10) {
            System.out.println(i);
            i++;
        }
     }
}
*/

/* 
public class Loops {

     public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }
     }
}
*/

/* 
public class Loops {
    public static void main(String[] args) {
        char ch = 'A';
        while (ch <= 'Z') {
            System.out.print("  " + ch);
            ch++;
        }
    }
}
*/

/* 
public class Loops {

    public static void main(String[] args) {
        int count = 0;
        while (count<=10) {
            System.out.println("Hello World");
            count++;
        }
    }
}
*/

/* 
public class Loops {
    public static void main(String[] args) {
   for(char ch='A'; ch<='Z'; ch++) {
            System.out.print("  " + ch);
        }
    }
}
*/

/* 
public class Loops {

    public static void main(String[] args) {
        for(int count=0; count<=10; count++)
        System.out.println("hello World");
    }
}
*/

/* 
import java.util.*;
public class Loops {

     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++)
        System.out.println(i);
     }
}
*/

/* 
import java.util.*;
public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("Sum is : "+sum);
    }
}
*/

/* 
public class Loops {

    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<4; j++){
                System.out.print(" *");
            }
            System.out.println(" *");
        }
    }
}
*/

/* 
public class Loops {

    public static void main(String[] args) {
        int n = 12345;
        while (n>0) {
        int ld = n%10;
        System.out.print(ld);
        n=n/10;
         
        }
    }
}
*/

/* 
public class Loops {

    public static void main(String[] args) {
        int i =0;
        do {
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
*/

/* 
public class Loops {

    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            if(i==4){
                break;
            }
            System.out.println(i);
        }
    }
}
*/

/* 
public class Loops {

    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
*/


/* 
import java.util.*;

public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                prime =false;
            }
        }
        if (prime==true) {
            System.out.println(" is prime");

        }else{
            System.out.println("n is not a prime");
        }
    }
}
*/
