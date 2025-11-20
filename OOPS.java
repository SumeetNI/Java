// public class Oops {

//     static class Student {
//         String name;
//         int age;
//         float marks;

//         void st1() {
//             System.out.println("name : " + name + ", age :  " + age + ", marks " + marks);
//             System.out.println(age);
//             System.out.println(marks);
//         }

//     }

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "sumeet";
//         s1.age = 22;
//         s1.marks = 88.96f;
//         s1.st1();

//     }
// }

// public class Oops {

//     static class Bank{
//         public String userName;
//         private String password;

//         void details() {
//             System.out.println(userName);
//             System.out.println(password);
//         }
//     }

//     public static void main(String[] args) {
//         Bank bank1 = new Bank();
//         bank1.userName = "sumeet";
//         bank1.password = "12345"; // Error: password has private access in Bank
//         bank1.details();
//     }
// }

//construstor
// public class Oops {
//     static class Student {
//         String name;
//         int roll;

//       void st(){
//         System.out.println();
//       }
//     }

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "sam";
//         s1.st();
//         System.out.println(s1.name);
//     }
// }

// public class Oops{
//     static class Student{
//        public String name;
//        private int roll;
//     }

//         public static void main(String[] args) {
//             Student s1 = new Student();
//             s1.name = "sam";
//             s1.roll = 12; 
//             System.out.println(s1.name);
//             System.out.println(s1.roll);

//         }

// }

// class Pen {
//     String color;
//     int tip;

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip) {
//         tip = newTip;
//     }
// }

// class Student {
//     String name;
//     int age;
//     int roll;
//     float marks;

//     void s1(int phy, int che, int maths) {
//         int per = (phy + maths + che) / 3;

//     }
// }

// public class Oops {

//     public static void main(String[] args) {
//         Pen p1 = new Pen(); // constructor
//         p1.setColor("red");
//         p1.setTip(23);
//         System.out.println(p1.color);
//         System.out.println(p1.tip);

//         Student s1 = new Student();
//         s1.s1(80, 85, 90);

//         System.out.println();
//     }
// }

// class bank {
//     public String name;
//     private String password;

//     void setPassword(String pwd){
//         pwd=password;
//     }
// }

// public class Oops {

//     public static void main(String[] args) {
//         bank bank1 = new bank(); 
//         bank1.name = "sumeet";
//         // bank1.password = "amee";
//         bank1.setPassword("ameet");
//     }
// }

// Getter & setter Encapsulation
// class Pen {
//     private String color;
//     private int tip;

//     String getColor() {
//         return this.color;
//     }

//     int getTip() {
//         return this.tip;
//     }

//     void setColor(String Color) {
//         this.color = Color;
//     }

//     void setTip(int newTip) {
//         tip = newTip;
//     }
// }

// public class Oops {

//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setColor("Red");
//         p1.setTip(100);
//         System.out.println(p1.getColor());
//         System.out.println(p1.getTip());
//     }
// }

//constructor
// class Student {
//     String name;
//     int roll;
//     String pwd;

//     // NonParameterized constructor
//     Student() {
//         System.out.println("This is non parameter constructer");
//     }

//     // prameterized constrocter
//     Student(String name) {
//         this.name = name;
//     }

//     // copy constructer
//     Student(Student s2) {
//         this.name = s2.name;
//         this.roll = s2.roll;
//     }
// }

// public class Oops {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         System.out.println();
//         Student s2 = new Student("sumeet");// constrocter
//         System.out.println(s2.name);

//         Student s3 = new Student(s2);
//         s2.pwd = "sam";

//     }
// }

//Destructer
//java supprot which automatically detect useless memory allocated to the object will be delete/remove autometically without specifying it

//Inheritance
// single level inheritance
//Parent/super/Baseclass
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breath() {
//         System.out.println("breathe");
//     }
// }

// //Child/sub/Drived class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swim");
//     }
// }
// public class Oops {

//     public static void main(String[] args) {
//         Fish shark = new Fish();
//         shark.eat();
//     }
// }

//multilevel inheritance
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breath() {
//         System.out.println("breathe");
//     }
// }

// //Child/sub/Drived class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swim");
//     }
// }

// class Dog extends Animal{
// void sound(){
//     System.out.println("Dog is borking...");
// }
// }
// public class Oops {

//     public static void main(String[] args) {
//         Fish shark = new Fish();
//         shark.eat();
//         Dog d1=new Dog();
//         d1.sound();
//         d1.eat();
//     }
// }

// heirarchial inheritance
// class Animal {
//     String color;

//     void eat() {
//         System.out.println("eats");
//     }

//     void breath() {
//         System.out.println("breathe");
//     }
// }

// // Child/sub/Drived class
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("Swim");
//     }
// }

// class Bird extends Animal {
//     int wings;

//     void fly() {
//         System.out.println("Birds are flying..");
//     }
// }

// public class Oops {
//     public static void main(String[] args) {
//         Bird b1 = new Bird();
//         b1.fly();
//         b1.eat();
//         b1.breath();
//     }

// }

//polymorphism
// method overloading
// class Cal {
//     int sum(int a, int b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

// }

// public class Oops {

//     public static void main(String[] args) {
//         Cal cal1 = new Cal();
//         System.out.println(cal1.sum(10, 100));
//         System.out.println(cal1.sum(10,10,10));
//         System.out.println(cal1.sum(10.12f,20.34f ));
//     }
// }

//method overriding
// class Animal{
//     void eat(){
//         System.out.println("eating...");
//     }
// }
// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }
// public class Oops {

//     public static void main(String[] args) {
//         Deer deer1=new Deer();
//         deer1.eat();
//     }
// }

//inbuilt packages
// import java.util.*;
// public class Oops {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.println(a);
//     }
// }

//Abstraction
//Abstract class
// abstract class Animal{
//      abstract void walk();
//     void eat(){
//         System.out.println("eating...");
//     }
// }
// class Horse extends Animal{
//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }
// public class Oops {

//     public static void main(String[] args) {
//         Horse horse1=new Horse();
//         horse1.walk();
//         horse1.eat();

//         Chicken chicken1=new Chicken();
//         chicken1.walk();
//         chicken1.eat();
//     }
// }

//Interface
// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("moves up,down,right, left");
//     }
// }

// class King implements ChessPlayer {
//     public void moves() {
//         System.out.println("moves up,down,right, left & diagnal");
//     }
// }
// public class Oops {

//     public static void main(String[] args) {
//         Queen q1 = new Queen();
//         q1.moves();
//     }
// }

//Static Keyword
// class Student {
//     String name;
//     int roll;
//     static String schoolName;

//     void setName(String name) {
//         this.name = name;
//     } 

//     String getName(String name) {
//         return this.name;
//     }
// }

// public class Oops {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.schoolName = "GOvt School";
//         System.out.println(s1.schoolName);

//         Student S2 = new Student();
//         System.out.println(S2.schoolName);
//     }
// }

//  