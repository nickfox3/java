public class Artifact {
    private final String name;
    private final int yearOfDiscovery;
    private final Person discoverer;
    private final Person curator;

    public Artifact(String name, int yearOfDiscovery, Person discoverer, Person curator) {
        this.name = name;
        this.yearOfDiscovery = yearOfDiscovery;
        this.discoverer = discoverer;
        this.curator = curator;
    }

    public String toString() {
        return "Artifact: " + name + " (" + yearOfDiscovery + ")\n"
                + "Discovered by: " + discoverer + "\n"
                + "Curated by: " + curator;
    }
}

