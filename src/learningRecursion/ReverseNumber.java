package learningRecursion;

public class ReverseNumber {
    static int revNumber(int n) {


        if(n== 0){
            return 0;
    }

        return revNumber(n % 10);


}







    public static void main(String[] args) {
        int ans = 12345;
        System.out.print(revNumber(ans));
    }
}
