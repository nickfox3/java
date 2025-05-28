public class enums {

    // 1. Coffee size enum
    enum CoffeeSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    // 2. Seat section enum
    enum SeatSection {
        GENERAL,
        PREMIUM,
        VIP
    }

    // 3. Traffic light enum
    enum TrafficLightColor {
        RED,
        YELLOW,
        GREEN
    }

    // 4. Weekday schedule enum
    enum Schedule {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    // 5. Government alert level enum
    enum AlertLevel {
        LOW,
        MODERATE,
        HIGH,
        SEVERE
    }

    public static void main(String[] args) {

        // 1. Coffee order - define and use an enum
        CoffeeSize myOrder = CoffeeSize.MEDIUM;
        System.out.println("Selected coffee size: " + myOrder);

        // 2. Seat section codes - enum to integer - assign enum to integer
        for (SeatSection section : SeatSection.values()) {
            System.out.println(section + " section has code: " + section.ordinal());
        }

        // 3. Traffic system - integer to enum
        TrafficLightColor[] signals = TrafficLightColor.values();
        int index = 1; // YELLOW
        TrafficLightColor currentSignal = signals[index];
        System.out.println("Traffic light signal: " + currentSignal);

        // 4. Weekday schedule - assign work days and boolean for weekend
        Schedule workday = Schedule.WEDNESDAY;
        System.out.println("Workday selected: " + workday);
        boolean isWeekend = (workday == Schedule.SATURDAY || workday == Schedule.SUNDAY);
        System.out.println("Is it a weekend? " + isWeekend);

        // 5. Government alert system - switch is the same as if, elif, else
        AlertLevel currentLevel = AlertLevel.HIGH;
        System.out.println("Current alert level: " + currentLevel);

        switch (currentLevel) {
            case LOW:
                System.out.println("No immediate danger");
                break;
            case MODERATE:
                System.out.println("Stay alert and aware");
                break;
            case HIGH:
                System.out.println("Take precautions and stay informed");
                break;
            case SEVERE:
                System.out.println("Immediate action required");
                break;
        }
    }
}

// 1.
// Selected coffee size: MEDIUM
// 2.
// GENERAL section has code: 0
// PREMIUM section has code: 1
// VIP section has code: 2
// 3.
// Traffic light signal: YELLOW
// 4.
// Workday selected: WEDNESDAY
// Is it a weekend? false
// 5.
// Current alert level: HIGH
// Take precautions and stay informed