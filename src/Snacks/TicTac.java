package Snacks;

public class TicTac {
    private final String[] moves = {"","","","","","","","","",""};

    public void displayBoard() {
        System.out.printf("""
                           %1s  | %1s |  %1s 
                         __________________
                           %1s  | %1s |  %1s 
                         __________________
                           %1s  | %1s |  %1s 
                        
                         """,
                         moves[1],moves[2],moves[3],
                         moves[4],moves[5],moves[6],
                         moves[7],moves[8],moves[9]);
    }

    public void makeMove(String marker,int position) {
        moves[position] = marker;
        displayBoard();
    }

    public void clearMove() {
        for(int position = 1; position<= 9;position++){
            moves[position] = "";
        }
        displayBoard();
    }


    public boolean isWin() {
        boolean won = false;

        if(itMoves(1,2,3)) won = true;

        if(itMoves(4,5,6)) won = true;

        if(itMoves(7,8,9)) won = true;

        if(itMoves(1,5,9)) won = true;

        if(itMoves(3,6,9)) won = true;

        if(itMoves(3,5,7)) won = true;

        if(itMoves(1,4,7)) won = true;

        if(itMoves(2,5,8)) won = true;

        return won;
    }

    public boolean itMoves(int position1,int position2,int position3) {
        boolean check = false;

        if(!moves[position1].equals("")){
            if(moves[position2].equals(moves[position1]) && moves[position3].equals(moves[position2])){
                check = true;
            }
        }
        return check;
    }
}
