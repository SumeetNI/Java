/* 
public class Functions {
    static void hello(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        hello();
    }
}
*/

/* 
//Swap
public class Functions {
static void swap(){
    int a=2;
    int b=4;
    System.out.println(a);
    System.out.println(b);

    int temp=a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
}
    public static void main(String[] args) {
        swap();
    }
}
*/

/* 
import java.util.*;
public class Functions {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);
    }
}
*/

/* 
import java.util.*;
public class Functions {
    static int product(int a, int b) {
        int prod = a * b;
        return prod;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(product(a, b));

    }
}
*/

/* 
//factorial
public class Functions {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
*/

/* 
//Binomial coeffecient
public class Functions {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    static int binomial(int n, int r) {
      
         int bino = fact(n)/(fact(r)*(fact(n-r)));
         return bino;
    }

    public static void main(String[] args) {
System.out.println(binomial(5, 2));  
System.out.println(fact(4));
  }
}
*/

/* 
//memory overloading
public class Functions {
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    static float sum(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sum(5, 5, 5));
        System.out.println(sum(5.7f, 5.8f));
    }
}
*/

/* 
// check prime num
public class Functions {
    static boolean prime(int n) {
        boolean prime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                prime = false;
                return prime;
            }
        }
        return prime;

    }

    public static void main(String[] args) {
        System.out.println(prime(6));
    }
}
*/

/* 
//print prime num
public class Functions {
    static boolean prime(int n) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return prime;
    }

    static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(prime(90));
        printPrime(90);
    }
}
*/

/* 
//binary to decimal
public class Functions {
    static void bintodec(int binNum) {
        int pow = 0;
        int dec = 0;

        while (binNum > 0) {
            int ld = binNum % 10;
            dec = dec + (ld * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(dec);
    }

    public static void main(String[] args) {
        bintodec(101);
    }
}
*/


/* 
//decimal to binary
public class Functions {
    static void dectoBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println(binNum);
    }

    public static void main(String[] args) {
        dectoBin(11);
    }
}
*/


