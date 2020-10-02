//package heatindexcalculatortester;

/*
    Alex Strachan
    1/29/2020
    CS 232 001
    This program is using two classes to make a current tempature calculator. That gets the input from the user to get the current tempature.
    
 */


public class HeatIndexCalculator
{
    private int temperature;
    private double humidity;
    private double heatIndex;
    
    public HeatIndexCalculator (int currentTemp, double currentHumidity)
    {

        this.temperature = currentTemp;
        this.humidity = currentHumidity;
        this.heatIndex = calculateHeatIndex(currentTemp, currentHumidity);
         
    }
    private double calculateHeatIndex(int currentTemp, double currentHumidity)
    {
        //this is the calculations for the heat index
        double calculatedHeatIndex = (-42.379)+(2.04901523*currentTemp)+
                (10.14333127*currentHumidity)+(-0.22475541*currentTemp*currentHumidity)+
                (-.00683783*currentTemp*currentTemp)+(-.05481717*currentHumidity*currentHumidity)+
                (.00122874*currentTemp*currentTemp*currentHumidity)+(.00085282*currentTemp*currentHumidity*currentHumidity)+
                (-.00000199*currentTemp*currentTemp*currentHumidity*currentHumidity);
        printHeatIndex(currentTemp, currentHumidity, calculatedHeatIndex);
        
       return calculatedHeatIndex;
      
    }
    private void printHeatIndex(int currentTemp, double currentHumidity, double calculatedHeatIndex)
    {
        //this is printing to the screen
        System.out.printf ("At the tempature of %dF and a humidity of: %5.2f percent\n", currentTemp, currentHumidity);
        System.out.printf("it feels like: %5.2fF", calculatedHeatIndex);
    }
}
