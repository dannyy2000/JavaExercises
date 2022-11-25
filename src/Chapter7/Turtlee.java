package Chapter7;

public class Turtlee {

    private int xCoordinate;
    private int yCoordinate;

    private Penn penn;
    private Cardinal direction = Cardinal.EAST;


    public Turtlee(){}
    public Turtlee(int x,int y){
        xCoordinate = x;
        yCoordinate = y;
    }
    public Turtlee(int x,int y,Cardinal direction){
        this(x, y);
        this.direction = direction;
    }

//    public void changePenPosition(PennPosition position){
//        Penn.
//    }

    public void moveForward(int numberOfSteps){
        if(direction.equals(Cardinal.EAST)){
            this.xCoordinate += numberOfSteps - 1;
        }
    }

    public void moveForward(Cardinal movementDirection ,int numberOfSteps){
        this.setDirection(movementDirection);
        if(direction.equals(Cardinal.EAST)){
            if(PennPosition.DOWN.equals(getPenn().getPosition())){
                for(int i = 0; i < numberOfSteps ;i++){

                }
            }
//        } else if (direction.equals(Cardinal.SOUTH)) {
//            this.yCoordinate += numberOfSteps -1;
//        } else if () {

        }
    }
    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Penn getPenn() {
        return penn;
    }

    public void setPenn(Penn penn) {
        this.penn = penn;
    }

    public Cardinal getDirection() {
        return direction;
    }

    public void setDirection(Cardinal direction) {
        this.direction = direction;
    }
}
