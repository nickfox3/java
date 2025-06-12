public class Main {
    public static void main(String[] args) {
        MediaService mediaService = new MediaService();

        while (true) {
            String choice = TerminalUtils.getMenuChoice();

            if (choice.equals("4")) {
                ListAllMediaCommand.execute(mediaService);
            } else if (choice.equals("1")) {
                AddMediaCommand.execute(mediaService);
            } else if (choice.equals("3")) {
                //  show the play menu
                PlayMediaCommand.showMenu(mediaService);
                // get user input and process play
                String input = TerminalUtils.getIndexToPlay();
                PlayMediaCommand.execute(mediaService, input);
            } else if (choice.equals("2")) {
                //  show the remove menu
                RemoveMediaCommand.showMenu(mediaService);
                // get user input and process remove
                String input = TerminalUtils.getIndexToRemove();
                RemoveMediaCommand.execute(mediaService, input);
            } else if (choice.equals("5")) {
                TerminalUtils.print("Goodbye!");
                break;
            } else {
                TerminalUtils.print("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }
}


