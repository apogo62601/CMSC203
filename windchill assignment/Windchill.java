import java.util.Scanner;
public class Windchill
{
    public static void main(String []args)
    {
        double temp;
        double wind;
        
        Scanner scan = new Scanner (System.in);
    	System.out.println("Wind Chill Calculator\n");
    	System.out.println("Enter the temperature in Fahrenheit (must be >= -45" + " and <= 40):\t");
    	temp = scan.nextDouble();
    	System.out.println("Enter the wind speed (must be >= 5 and <= 60):\t");
    	wind = scan.nextDouble();
        double windChill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(wind, 0.16);
        System.out.println("\nWind chill temperature: " + windChill + " degrees Fahrenheit.");
        System.out.println("Programmer name: Aelina Pogosian :)");
	}
}
