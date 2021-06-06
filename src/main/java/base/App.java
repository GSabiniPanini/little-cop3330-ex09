package base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Glenroy Little
 */
import java.util.Scanner;
/**
 Exercise 9 - Paint Calculator
 Sometimes you have to round up to the next number rather than follow standard rounding rules.

 Calculate gallons of paint needed to paint the ceiling of a room.
 Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.

 Example Output
 You will need to purchase 2 gallons of paint to cover 360 square feet.
 Remember, you can’t buy a partial gallon of paint. You must
 round up to the next whole gallon.

 Constraints
 Use a constant to hold the conversion rate.
 Ensure that you round up to the next whole number.

 Challenges
 Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 Implement support for a round room.
 Implement support for an L-shaped room.
 Implement a mobile version of this app so it can be used at the hardware store.
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    static final int FEET_PER_GALLON = 350;

    public static void main( String[] args )
    {
        App myApp = new App();

        Integer length = myApp.getlength();
        Integer width = myApp.getwidth();
        Integer sqfeet = myApp.calc(length, width);
        Integer gallons = myApp.getgallons(sqfeet);

        myApp.output(gallons, sqfeet);
    }

    public void output(Integer gallons, Integer sqfeet)
    {
        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + sqfeet + " square feet.");
    }

    public Integer getgallons(Integer sqfeet)
    {
        Integer result1 = sqfeet / FEET_PER_GALLON;
        Integer gallons;
        if(sqfeet % FEET_PER_GALLON == 0)
        {
            gallons = result1;
        }
        else
        {
            gallons = result1 + 1;
        }
        
        return gallons;
    }

    public Integer calc(Integer length, Integer width)
    {
        Integer sqfeet = length * width;
        return sqfeet;
    }

    public Integer getwidth()
    {
        System.out.print("What is the width? ");
        Integer width = in.nextInt();
        return width;
    }

    public Integer getlength()
    {
        System.out.print("What is the length? ");
        Integer length = in.nextInt();
        return length;
    }
}
