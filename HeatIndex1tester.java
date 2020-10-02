/*
    Alex Strachan
    1/29/2020
    CS 232 001
    This program is using two classes to make a current tempature calculator. That gets the input from the user to get the current tempature, and the current humidity
    then it uses this infomation to outputt the current temp plus what it feels like
    
 */
//import heatindexcalculatortester.HeatIndexCalculator;
import java.util.Scanner;

public class HeatIndexCalculatorTester
{
    public static void main(String[] args)
    {
        //this is making a new scanner
        Scanner input = new Scanner(System.in);
        //this is printing to the screen for the user to know what to enter
        System.out.println("What is the current temperature in the degree Fahrenheit");
        // this is the storgage for the current temp
        int tempNow = input.nextInt();
        System.out.println("Enter current humidity as a percentage");
        //this is storing user imput
        double humidityNow = input.nextDouble();
        HeatIndexCalculator heatIndexCalculatorObject = new HeatIndexCalculator(tempNow, humidityNow);
    }
}