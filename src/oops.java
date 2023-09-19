import java.util.*;
class pen{
    String color;
    String type;
    String brand;
//    public void write(){
//        System.out.println("bla bla bla");
//    }
    public void pricl(){
        System.out.println(this.color);
    }
    //polymorphism
    public void prinfo(String color){
        System.out.println(color);
    }
    public void prinfo(String type,String brand){
        System.out.println(type);
    }
}
public class oops {
    public static void main(String[] args) {
        pen pen1= new pen();
        pen1.color="blue";
        pen1.type="gel";


        //polymorphism
        pen1.prinfo(pen1.color);
        pen1.prinfo(pen1.type);
    }
}

//public class oops {
//
//    // Method with two int parameters
//    public int add(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    // Method with three int parameters
//    public int add(int num1, int num2, int num3) {
//        return num1 + num2 + num3;
//    }
//
//    // Method with double parameters
//    public double add(double num1, double num2) {
//        return num1 + num2;
//    }
//
//    public static void main(String[] args) {
//        oops calculator = new oops();
//
//        // Method calls based on parameter lists
//        int sum1 = calculator.add(5, 10);
//        int sum2 = calculator.add(5, 10, 15);
//        double sum3 = calculator.add(2.5, 3.7);
//
//        System.out.println("Sum 1: " + sum1);
//        System.out.println("Sum 2: " + sum2);
//        System.out.println("Sum 3: " + sum3);
//    }
//}
