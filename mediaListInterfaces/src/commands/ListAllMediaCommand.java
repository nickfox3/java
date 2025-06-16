package commands;

import Media.Media;
import service.MediaService;
import utils.TerminalUtils;

public class ListAllMediaCommand implements Command {

    @Override
    public void execute(MediaService mediaService) {
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

