package Snacks;

public class Prics {

//  todo  You are given an array prices where prices[i] is the price of a given stock on the ith day.
// todo You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// todo Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//   todo  Example 1:
// todo Input: prices = [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//    Example 2:
// todo Input: prices = [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transactions are done and the max profit = 0.

    public static int maxProfit(int[] prices) {

        int maxIndex = 1;
        int minIndex = 0;
        int maxNumber = 0;
        int minNumber = 0;



        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[minIndex]) {
                minIndex = i;
                minNumber = prices[i];
            }
        }


        for (int j = 0; j < prices.length; j++) {
            if (prices[j] > prices[maxIndex]) {
                maxIndex = j;
                maxNumber = prices[j];
            }
        }

        while (minIndex >= maxIndex && minIndex < prices.length - 1) {
            maxIndex++;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i]  < maxNumber) {
                    maxNumber = prices[i];
                }

            }

//            maxNumber = prices[maxIndex];
        }

        return maxNumber - minNumber;
    }



    public static void main(String[] args) {
        int[] numbr = {7,1,5,3,6,4};
        System.out.println(maxProfit(numbr));

    }

}
