/* 
// String input
import java.util.*;

public class string {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    System.out.println(st);
    String name = "sumeet";
    System.out.println(name);
  }
}
*/

/* 
// String length
public class string {

    public static void main(String[] args) {
        String name = "Sumeet";
        System.out.println(name.length());

    }
}
*/

/* 
//String concatination 
public class string {

  public static void main(String[] args) {
    String firstName = "sumeet";
    String lastName = "Nilange";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
  }
}
*/

/* 
//String charAt() method 
public class string {
static void printChar(String fullName){
  for(int i=0; i<fullName.length();i++){
    System.out.print(fullName.charAt(i));
  }
}
  public static void main(String[] args) {
    String firstName = "sumeet";
    String lastName = "Nilange";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName.charAt(3));
    printChar(fullName);
  }
}
*/

/* 
//palindrome check
public class string {
  static boolean palindrome(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "racecar";
    System.out.println(palindrome(str));

  }
}
*/

/* 
public class string {
  static float getShortestpath(String path) {
    int x = 0, y = 0;
    for (int i = 0; i < path.length(); i++) {
      char dir = path.charAt(i);
      if (dir == 'E') {
        x++;
      } else if (dir == 'W') {
        x--;
      } else if (dir == 'N') {
        y++;
      } else {
        y--;
      }
    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
  }

  public static void main(String[] args) {
    String path = "WNEENESENNN";
    System.out.println(getShortestpath(path));
  }
}
*/

/* 
//String campare
public class string {

  public static void main(String[] args) {
    String s1 = "sumeet";
    String s2 = "sumeet";
    String s3 = new String("sumeet");
    if ((s1 == s2)) {
      System.out.println("strings are same");
    } else {
      System.out.println("strings are not same");

    }
    if ((s1 == s3)) {
      System.out.println("strings are same");
    } else {
      System.out.println("strings are not same");
    }
    if (s1.equals(s3)) {
      System.out.println("strings are same");
    } else {
      System.out.println("strings are not same");
    }
  }
}
*/

/* 
// print substring
public class string {
static String substring(String str, int si,int ei){
  String subString="";
  for(int i=si; i<ei;i++){
    subString += str.charAt(i);
  }return subString;
}
  public static void main(String[] args) {
    String str ="HelloWorld";
    // System.out.println(substring(str, 1, 5));
    System.out.println(str.substring(1,5));
  }
}
*/

/* 
public class string {

  public static void main(String[] args) {
    String fruits[] = { "apple", "banana", "mango" };
    String largest = fruits[0];
    for (int i = 0; i < fruits.length; i++) {
      if (largest.compareTo(fruits[i]) < 0) {
        largest = fruits[i];
      }
    }
    System.out.println(largest);
  }
}
*/

/* 
// stringBuilder
public class string {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    for (char ch = 'A'; ch <= 'Z'; ch++) {
      sb.append(ch);
      System.out.println(sb);
      System.out.println(sb.length());
    }
  }
}
*/


/* 
public class string {
  static String toUppercase(String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }

    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String str = "hi i am summet";
    System.out.println(toUppercase(str));
  }
}
*/