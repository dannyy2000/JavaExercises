package ExceptionHandling;

public class Beans {


    private int numberOfSpoons;
    private boolean withOmiEwa;
    public Beans(int numberOfSpoons, boolean withOmiEwa) {
    }

    public int getNumberOfSpoons() {
        return numberOfSpoons;
    }

    public void setNumberOfSpoons(int numberOfSpoons) {
        this.numberOfSpoons = numberOfSpoons;
    }

    public boolean isWithOmiEwa() {
        return withOmiEwa;
    }

    public void setWithOmiEwa(boolean withOmiEwa) {
        this.withOmiEwa = withOmiEwa;
    }

    @Override
    public String toString() {
        return "Beans{" +
                "numberOfSpoons=" + numberOfSpoons +
                ", withOmiEwa=" + withOmiEwa +
                '}';
    }




}
