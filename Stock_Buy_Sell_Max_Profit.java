/* -----------OBJECTIVE------------
    - This program will take an array which has the cost of stock on each day as every element.
    - We need to find the max profit that we can make by buying and selling on those days. 

    ------- Example --------
            input: arr[]= {100,180, 260, 310, 40, 535, 695};
            output: 865

            Note: selling - buying = profit
    ------- How? -----------
    - Buy stock on day 0 and sell it on day 3 => 310 - 100= 210
    - Buy stock on day 4 and sell it on day 6 => 695 - 40 = 655

    - Max profit= 210+655-865;

 */
import java.util.*;
// 1. try to buy every stock from start to end


class MaxProfit{
    static int maxF(int[] arr){
        int getProfit=0;
        //the day at which we want to buy the stock:
        for(int i =0; i < arr.length-1; i++){
            //the day at which the stock must be sold:
            for(int j = i+1; j<=arr.length-1; j++){
                if(arr[j]>arr[i]){
                    int curr_profit=arr[j]- arr[i]+ maxF(arr);
                    getProfit=Math.max(getProfit, curr_profit);
                }
            }
        }
        
        return getProfit;
    }
    public static void Main(String[] args){
        int[] arr= {100,180, 260, 310, 40, 535, 695};
        maxF(arr);
    }

}





