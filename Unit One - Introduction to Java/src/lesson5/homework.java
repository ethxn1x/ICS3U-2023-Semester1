package lesson5;
import java.util.Scanner;

public class homework {
    public static void main(String[] args){
        //Homework1
        Scanner in = new Scanner(System.in);

        System.out.print("please enter a temperature in fairenheit:");
        int fairenheit = in.nextInt();

        double celcius = ((double) fairenheit - 32) * 5 / 9;

        System.out.println("the temperature in celcius is:" + celcius);


        //Homework2

        Scanner dollars = new Scanner(System.in);

        System.out.print("input an amount of money in US Dollars:");
        double usDollars = dollars.nextDouble();

        double canDollars = ((double) usDollars*1.25);

        System.out.println("the amount of US Dollars in canadian is" + canDollars);

        //Homework 3

        Scanner integer =  new Scanner(System.in);
        System.out.print("input a radius value:");
        int radius = integer.nextInt();

        double area  = (3.14 * (radius * radius));
        double circumfrence = (2*3.14*radius);

        System.out.println(" The area with radius of " + radius + " is " + area + "and the circumfrence is" + circumfrence );


        // Homework 4

        Scanner input1 =  new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("input a distance in kilometers");
        System.out.println("input a time in hours");

        int speed = input1.nextInt();
        int time = input2.nextInt();

        



    


    

    
    }

    
}
