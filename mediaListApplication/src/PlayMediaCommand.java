public class PlayMediaCommand {
    // Step 1: Show the menu
    public static void showMenu(MediaService mediaService) {
        if (mediaService.isEmpty()) {
            System.out.println("No media to play.");
            return;
        }

        System.out.println("=== Select Media to Play ===");
        for (int i = 0; i < mediaService.size(); i++) {
            Media media = mediaService.getMediaList().get(i);
            System.out.println(i + ": " + media.getDescription());
        }
    }

    // Step 2: Process the play
    public static void execute(MediaService mediaService, String option) {
        try {
            int index = Integer.parseInt(option);
            Media media = mediaService.playMedia(index);
            if (media != null) {
                media.play();
            } else {
                System.out.println("Invalid index. Cannot play media.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}

