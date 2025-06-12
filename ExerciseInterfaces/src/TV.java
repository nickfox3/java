public class TV implements Connectable {
    private String name;
    private boolean isOn;

    public TV(String name) {
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }


    @Override
    public String getStatus() {
        return name + "TV is " + (isOn ? "ON" : "OFF");
    }
}
