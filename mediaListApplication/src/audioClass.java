public class audioClass extends Media {
    private int duration;
    private String artist;

    public audioClass(String name, int duration, String artist) {
        super(name);
        this.duration = duration;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing audio '" + getName() + "' using audio player software");
    }

    @Override
    public String getDescription() {
        return "Audio: " + getName() +
                "\nArtist: " + artist +
                "\nDuration: " + duration + " minutes";
    }
}

