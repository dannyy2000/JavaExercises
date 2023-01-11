// todo Create a class HugeInteger which uses a 40-element array of digits to
//        store integers as large as 40 digits each. Provide methods parse, toString, add and subtract.
//        Method parse should receive a String, extract each digit using method charAt and place the integer
//        equivalent of each digit into the integer array. For comparing HugeInteger objects,
//        provide the following methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
//        and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
//        holds between the two HugeInteger objects and returns false if the relationship does not hold.
//        Provide a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
//        remainder. [Note: Primitive boolean values can be output as the word “true” or the word “false” with
//        format specifier %b.]

package chapter8_Exercises;

public class HugeInteger {

    private final static int[] myArray = new int[40];


    public HugeInteger(int number) {

    }

    public void parse(String letters){
        int digitalLength = letters.length();

        for(int i = 0;i<digitalLength;i++){
            String characters = Character.toString(letters.charAt(i));
            myArray[i] = Integer.parseInt(characters);
        }


    }

    public int[] getMyArray(){
        return myArray;
    }

    public void add(String letters){
        
    }
}
