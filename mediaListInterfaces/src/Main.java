import service.MediaService;
import utils.TerminalUtils;
import commands.AddMediaCommand;
import commands.ListAllMediaCommand;
import commands.PlayMediaCommand;
import commands.RemoveMediaCommand;

public class Main {
    public static void main(String[] args) {
        MediaService mediaService = new MediaService();
        boolean running = true;

        while (running) {
            String choice = TerminalUtils.getMenuChoice();

            switch (choice) {
                case "1" -> new AddMediaCommand().execute(mediaService);

                case "2" -> new RemoveMediaCommand().execute(mediaService);

                case "3" -> new PlayMediaCommand().execute(mediaService);

                case "4" -> new ListAllMediaCommand().execute(mediaService);

                case "5" -> {
                    TerminalUtils.print("Goodbye!");
                    running = false;
                }

                default -> TerminalUtils.print("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }
}

