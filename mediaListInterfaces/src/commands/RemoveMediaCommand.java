package commands;

import service.MediaService;
import utils.TerminalUtils;
import Media.Media;

public class RemoveMediaCommand implements Command {

    @Override
    public void execute(MediaService mediaService) {
        if (mediaService.isEmpty()) {
            TerminalUtils.print("No media to remove");
            return;
        }

        // show menu
        showMenu(mediaService);

        // get user input
        String option = TerminalUtils.getIndexToRemove();


        // Step 2: Process the removal
        try {
            int index = Integer.parseInt(option);
            Media removed = mediaService.removeMedia(index);
            if (removed != null) {
                TerminalUtils.print("Successfully removed: " + removed.getName());
            } else {
                TerminalUtils.print("Invalid index. No media removed.");
            }
        } catch (NumberFormatException e) {
            TerminalUtils.print("Invalid input. Please enter a valid number.");
        }
    }

        public static void showMenu (MediaService mediaService){
            TerminalUtils.print("=== Select Media to Remove ===");
            for (int i = 0; i < mediaService.size(); i++) {
                Media media = mediaService.getMediaList().get(i);
                TerminalUtils.print(i + ": " + media.getDescription());
            }
        }
    }



