package learningRecursion;

public class Print {
    public static void main(String[] args) {
       printRev(5);
    }

    static void printRev(int n){
        if(n==0){
            return;
        }
        printRev(n-1);
        System.out.println(n);



    }












}


