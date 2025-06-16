package commands;

import Media.Media;
import service.MediaService;
import utils.TerminalUtils;

public class PlayMediaCommand implements Command {

    @Override
    public void execute(MediaService mediaService) {
        if (mediaService.isEmpty()) {
            TerminalUtils.print("No media to play.");
            return;
        }

        // Show menu
        showMenu(mediaService);

        // Get user input
        String option = TerminalUtils.getIndexToPlay();

        // Handle input and play
        try {
            int index = Integer.parseInt(option);
            Media media = mediaService.playMedia(index);
            if (media != null) {
                media.play();
            } else {
                TerminalUtils.print("Invalid index. Cannot play media.");
            }
        } catch (NumberFormatException e) {
            TerminalUtils.print("Invalid input. Please enter a valid number.");
        }
    }

    public static void showMenu(MediaService mediaService) {
        TerminalUtils.print("=== Select Media to Play ===");
        for (int i = 0; i < mediaService.size(); i++) {
            Media media = mediaService.getMediaList().get(i);
            TerminalUtils.print(i + ": " + media.getDescription());
        }
    }
}


