package commands;

import Media.Media;
import service.MediaService;
import utils.TerminalUtils;

public class AddMediaCommand implements Command {
    @Override
    public void execute(MediaService mediaService) {
        Media newMedia = TerminalUtils.addMedia();
        if (newMedia != null) {
            mediaService.addMedia(newMedia);
            System.out.println("Media added successfully: " + newMedia.getName());
        } else {
            System.out.println("Media could not be added.");
        }
    }
}
