public class AddMediaCommand {
    public static void execute(MediaService mediaService) {
        Media newMedia = TerminalUtils.addMedia();
        if (newMedia != null) {
            mediaService.addMedia(newMedia);
            System.out.println("Media added successfully: " + newMedia.getName());
        } else {
            System.out.println("Media could not be added");
        }
    }
}

