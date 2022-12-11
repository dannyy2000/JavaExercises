package ExceptionHandling;

public class BeansMessenger {

    public Beans buyBeans(int amount,int numberOfSpoons,boolean moneyIsFake,boolean withOmiEwa){

        verify(moneyIsFake);
        verifyValidPrice(amount,numberOfSpoons);
        return buyBeans(numberOfSpoons,withOmiEwa);
    }

    private Beans buyBeans(int numberOfSpoons, boolean withOmiEwa) {
        return new Beans(numberOfSpoons,withOmiEwa);
    }

    private void verifyValidPrice(int amount, int numberOfSpoons) {
        int pricePerSpoon = 50;
        if(numberOfSpoons * pricePerSpoon > amount) throw new IllegalArgumentException("You no get money");
    }

    private boolean verify(boolean moneyIsFake) {
        return moneyIsFake;
    }
}
