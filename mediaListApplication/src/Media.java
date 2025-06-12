public abstract class Media {
    protected String name;

    public String getName() {
        return name;
    }
    public Media(String name) {
        this.name = name;
    }

    public abstract void play();

    public abstract String getDescription();

    public String getTitle() {
        return name;
    }
}

