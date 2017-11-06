import javafx.scene.effect.Light;

import java.util.Scanner;
public class TripPlanner {
    public static void greetings()
    {
        System.out.print("Welcome to Vacation Planner!\nWhat is Your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Nice to meet you "+name+", where are you travelling to? ");
        String city = input.nextLine();
        System.out.println("Great! "+city+" sounds like a great trip\n*********\n");
    }
    public static void travelTime(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        float money = input.nextFloat();
        input.nextLine();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String csymb = input.nextLine();
        System.out.print("How many "+csymb+" are there in 1 USD? ");
        float money1 = input.nextFloat();
        int b=(int)((money/days)*100);
        double c = b/100.0;
        System.out.println("\nIf you are travelling for "+days+" days that is the same as "+24*days+" hours or "+24*60*days+" minutes"
        +"\nIf your are going to spend $"+money+" USD that means per day you can spend up to $"+c+" USD");
        System.out.println("Your total budget in "+csymb+" is "+money1*money+" "+csymb+", which per day is "+(money1*money)/days+" "
                +csymb+"\n***********\n");
    }
    public static void timeDiff() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is time difference, in hours, between your home and your destination? ");
        int time = input.nextInt();
        input.nextLine();
        int a;
        if(time > 0){

            a = (time + 24) % 24;
        }
        else {
            a = 24 + time;
        }
        System.out.print("That means that when it is midnight at home it will be " + a + ":00 in your travel destination"
                    + "\nand when it is noon at home it will be " + (12 + time) + ":00\n**************\n");

    }
    public static void area(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is Square area of your destination country in km2? ");
        float km=input.nextFloat();
        input.nextLine();
        System.out.print("In miles2 that is "+km*0.3861+"\n**********\n");
    }

public static void main(String args[])
{
    greetings();
    travelTime();
    timeDiff();
    area();
}
}
