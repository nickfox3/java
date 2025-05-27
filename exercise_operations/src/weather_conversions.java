public class weather_conversions {
    public static void main(String[] args) {
        double temperatureCelsius = 25.0; // example input
        boolean isRaining = false;
        int windSpeedKmh = 10;
        double temperatureFahrenheit;

        // Apply formula
        temperatureFahrenheit = (temperatureCelsius * 9 / 5) + 32;

        System.out.println("Temperature in Celsius: " + temperatureCelsius);
        System.out.println("Temperature in Fahrenheit: " + temperatureFahrenheit);

        // assignment operations
        temperatureFahrenheit += 5;
        windSpeedKmh += 5;

        System.out.println("Updated Temperature in Fahrenheit: " + temperatureFahrenheit);
        System.out.println("Updated Wind Speed in km/h: " + windSpeedKmh);

        // comparison operations
        boolean isHot = temperatureFahrenheit > 85;
        boolean isWindy = windSpeedKmh > 20;

        System.out.println("Is it hotter than 85°F? " + isHot);
        System.out.println("Is the wind speed greater than 20 km/h? " + isWindy);

        // logical operations
        boolean goodDayOutside =! isRaining && (temperatureFahrenheit >= 60 && temperatureFahrenheit <= 85 );
        boolean weatherWarning = windSpeedKmh > 30 || temperatureCelsius < 0;

        System.out.println("Is it a good day to go outside? " + goodDayOutside);
        System.out.println("Is there a weather warning? " + weatherWarning);
    }
}
