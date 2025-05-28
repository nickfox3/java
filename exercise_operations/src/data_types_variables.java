public class data_types_variables {
    public static void main(String[] args) {
        // Declare and assign variables
        String playerName = "Lionel Messi";
        int jerseyNumber = 10;
        String position = "Forward";
        boolean isStarter = true;
        String teamName = "Inter Miami CF";

        // update jersey number and isStarter
        jerseyNumber = 30;
        isStarter = false;

        // movie info
        String movieTitle = "Avengers";
        int releaseYear = 2012;
        String rating = "PG-13";
        boolean isSequel = true;
        String leadActor = "Robert_Jr";

        // update movie rating and isSequel
        rating = "R";
        isSequel = false;

        // weather report
        String cityName = "Austin";
        int temperature = 99;
        boolean isRaining = false;
        String humidity = "5%";
        String weatherCondition = "It is very hot";

        // update temp and weather
        temperature = 60;
        weatherCondition = "cloudy";

        // flight infomation
        String flightNumber = "AA256";
        String departureCity = "Austin";
        String arrivalCity = "Manhattan";
        int gateNumber = 1;
        int terminal = 10;
        boolean isDelayed = false;

        // update gate number and isDelayed
        gateNumber = 10;
        isDelayed = true;

        // working with boolean variables
        boolean hasHomework = false;
        boolean isWeekend = true;
        boolean attendClass = false;

        System.out.println("Do I have homework? " + hasHomework);
        System.out.println("Is it the weekend? " + isWeekend);
        System.out.println("Did I attend class today? " + attendClass);

        // explore the char data type
        char firstInitial = 'N';
        char lastInitial = 'F';
        char favoriteGrade = 'A';

        System.out.println("My initials are " + firstInitial + "." + lastInitial +
                " and my favorite grade is " + favoriteGrade + ".");

        // Output the player's details
        System.out.println("Player Name: " + playerName);
        System.out.println("Jersey Number: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Is Starter: " + isStarter);
        System.out.println("Team Name: " + teamName);

        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating );
        System.out.println("Sequel: " + isSequel);
        System.out.println("Lead Actor: " + leadActor);

        System.out.println("City Name: " + cityName);
        System.out.println("Temperature: " + temperature);
        System.out.println("Raining?: " + isRaining);
        System.out.println("Humidity: " + humidity);
        System.out.println("Weather Condition: " + weatherCondition);

        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Departure City: " + departureCity);
        System.out.println("Arrival City: " + arrivalCity);
        System.out.println("Gate Number: " + gateNumber);
        System.out.println("Terminal: " + terminal);
        System.out.println("Delayed: " + isDelayed);

        // updated values summary
        System.out.println("Updated Soccer Player: #" + jerseyNumber + " " + playerName + ", Starter: " + isStarter);
        System.out.println("Updated Movie: " + movieTitle + ", Rating: " + rating + ", Is Sequel: " + isSequel);
        System.out.println("Updated Weather: " + temperature + "°F, Condition: " + weatherCondition);
        System.out.println("Updated Flight: " + flightNumber + ", Gate: " + gateNumber + ", Delayed: " + isDelayed);
    }
}
