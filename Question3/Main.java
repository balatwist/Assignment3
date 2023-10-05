package Question3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter C for Circle\n" +
                "Enter R for Rectangle\n" +
                "Enter T for Triangle");
        String figure ;
        figure=sc.next();

        switch (figure){
            case "C":
                System.out.println("Enter the radius of the circle");
                Circle c1= new Circle(sc.nextDouble());
                System.out.println("The area of your circle is :"+c1.computeArea());
               break;
            case "R":
                System.out.println("Enter the length AND width of the Rectangle");
             Rectangle r1= new Rectangle(sc.nextDouble(),sc.nextDouble());
                System.out.println("The area of you Rectangle is :"+r1.computeArea());
                break;

        }

    }
}
