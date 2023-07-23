public class Solution {
    public static int reverse(int x) {

                int reverseNumber = 0;

                for(int i = 0; x != 0;i++){
                    int no = x % 10;
                    reverseNumber = reverseNumber * 10 + no;
                    x/=10;
                }
                if( x < 0){
                    reverseNumber = - reverseNumber;
                }
                return reverseNumber;
            }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}

