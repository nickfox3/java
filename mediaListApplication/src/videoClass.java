public class videoClass extends Media {
    private int duration;
    private String resolution;

    public videoClass(String name, int duration, String resolution) {
        super(name);
        this.duration = duration;
        this.resolution = resolution;
    }


    @Override
    public void play() {
        System.out.println("Playing video '" + getName() + "' using video player software");
    }

    @Override
    public String getDescription() {
        return "Video: " + getName() +
                "\nDuration: " + duration + " minutes" +
                "\nResolution: " + resolution;
    }
}


