public class ListAllMediaCommand {
    public static void execute(MediaService mediaService) {
        if (mediaService.isEmpty()) {
            TerminalUtils.print("No media in the library.");
            return;
        }

        TerminalUtils.print("=== Media Library ===");
        int index = 1;
        for (Media media : mediaService.getMediaList()) {
            TerminalUtils.print(index + ": " + media.getDescription());
            TerminalUtils.print("------------------------");
            index++;
        }
    }
}

