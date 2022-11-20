package Snacks;

public class Student {

    private int sub1Score;
    private int sub2Score;
    private int sub3Score;
    private int position;

    public Student(int sub1Score, int sub2Score, int sub3Score){
        this.sub1Score = sub1Score;
        this.sub2Score = sub2Score;
        this.sub3Score = sub3Score;
    }

    public int getSub1Score() {
        return sub1Score;
    }

    public void setSub1Score(int sub1Score) {
        this.sub1Score = sub1Score;
    }

    public int getSub2Score() {
        return sub2Score;
    }

    public void setSub2Score(int sub2Score) {
        this.sub2Score = sub2Score;
    }

    public int getSub3Score() {
        return sub3Score;
    }

    public void setSub3Score(int sub3Score) {
        this.sub3Score = sub3Score;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

   public int calculateTotal(){
        return sub1Score + sub2Score + sub3Score;
   }
   public double calculateAverage(){
        return calculateTotal() / 3;
   }

   public void printResult(){
        //String.format("%d%d%d%d%f%n",sub1Score,sub2Score,sub3Score,calculateTotal(),calculateAverage());
       System.out.printf("%d\t\t%d\t\t%d\t\tc%d\t\t%.2f%n", sub1Score,sub2Score,sub3Score,calculateTotal(),calculateAverage());
   }


//    @Override
//    public String toString() {
//        return "Students{" +
//                "sub1Score=" + sub1Score +
//                ", sub2Score=" + sub2Score +
//                ", sub3Score=" + sub3Score +
//                ", position=" + position +
//                '}';
//    }
}



