public class null_emptyStrings {
    public static void main (String[] args) {
        String i = null;
        // check for null
        if (i == null) {
            System.out.println("The string is null, cannot compute length.");
        } else {
            System.out.println("Length: " + i.length());
        }
// declare empty string and length
        String emptyText = "";
        System.out.println("Empty string length: " + emptyText.length());
        }
    }
//The string is null, cannot compute length.
//Empty string length: 0