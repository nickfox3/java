public class Fridge implements Connectable {
    private boolean isOn;
    private String name;

    public Fridge(String name) {
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }


    @Override
    public String getStatus() {
        return name + " is " + (isOn ? "ON" : "OFF");
    }
}
