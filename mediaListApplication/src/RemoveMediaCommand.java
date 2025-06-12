public class RemoveMediaCommand {
    // Step 1: Show the menu
    public static void showMenu(MediaService mediaService) {
        if (mediaService.isEmpty()) {
            System.out.println("No media to remove.");
            return;
        }

        System.out.println("=== Select Media to Remove ===");
        for (int i = 0; i < mediaService.size(); i++) {
            Media media = mediaService.getMediaList().get(i);
            System.out.println(i + ": " + media.getDescription());
        }
    }

    // Step 2: Process the removal
    public static void execute(MediaService mediaService, String option) {
        try {
            int index = Integer.parseInt(option);
            Media removed = mediaService.removeMedia(index);
            if (removed != null) {
                System.out.println("Successfully removed: " + removed.getName());
            } else {
                System.out.println("Invalid index. No media removed.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}