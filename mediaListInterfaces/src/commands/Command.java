package commands;

import service.MediaService;

public interface Command {
    void execute(MediaService mediaService);
}
// makes commands interchangable, behave the same, easy to extend