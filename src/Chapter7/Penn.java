package Chapter7;

public class Penn {
    public PennPosition getPosition() {
        return position;
    }

    public void setPosition(PennPosition position) {
        this.position = position;
    }

    private  PennPosition position = PennPosition.UP;
}
