package Chapter7;

public class ArcheryGame {

    private Player[] players;

    public ArcheryGame(int numberOfArchers){
        players = new Player[numberOfArchers];


    }
    public Player[] getPlayers() {
        return players;
    }

//    private static void addPlayers(int numberOfArcher){
//        for (int i = 0;i < numberOfArcher;i++){
//            players[i] = new Player();
//        }
    }

