package chapter8;

public enum Region {

    SOUTH_EAST("Sabo","Yaba","Surulere"),
    SOUTH_SOUTH("Ikorodu","Bariga","Pako"),
    SOUTH_North("Alogomeji","Unilag","Makoko");

    private final String[] states;

    Region(String... states){
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }

//
}
