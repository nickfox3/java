public class imageClass extends Media {
    private String dimensions; // e.g., "1920x1080"
    private String fileFormat; // e.g., "PNG"

    public imageClass(String name, String dimensions, String fileFormat) {
        super(name);
        this.dimensions = dimensions;
        this.fileFormat = fileFormat;
    }

    @Override
    public void play() {
        System.out.println("Displaying image '" + getName() + "' using image viewer software");
    }

    @Override
    public String getDescription() {
        return "Image: " + getName() +
                "\nDimensions: " + dimensions +
                "\nFile Format: " + fileFormat;
    }
}

