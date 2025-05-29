public class reservation {
    private String partyName;
    private int partySize;

    public reservation(String name, int size) {
        this.partyName = name;
        this. partySize = size;
    }
    public void printInfo() {
        System.out.println("%s party of %d.%n", this.partyName, this.partySize);

    }
}
