public class Locker {
    private final int lockerNumber;
    private final String pin;

    public Locker(int lockerNumber, String pin) {
        this.lockerNumber = lockerNumber;
        this.pin = pin;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public String getPin() {
        return pin;
    }


}
