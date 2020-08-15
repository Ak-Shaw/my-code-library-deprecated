import java.io.*;
import java.util.*;

class MaxProfit {

    public long maxProfit(double balance, double prices[]) {
        
        double minprice = Double.MAX_VALUE;
        double maxprofit = 0;
        double sp = 0;
        double cp = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] / minprice > maxprofit){
                maxprofit = prices[i] / minprice;
                sp = prices[i];
                cp = minprice;
            }
        }
        
        if(maxprofit == 0 || cp > balance) {
        	return (long)balance;
        }

        return Math.round(sp * (balance / cp));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();
        int n = scanner.nextInt();
        double prices[] = new double[n];
        for(int i=0;i<n;i++){
            prices[i] = scanner.nextDouble();
        }
        long result = new MaxProfit().maxProfit(balance, prices);
        System.out.println(result);
    }
}
