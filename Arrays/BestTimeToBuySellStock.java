public class BestTimeToBuySellStock {
    static int bestTimeToBuySellStock(int prices[]){
        int min=prices[0];
        int max=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int profit=prices[i]-min;
            if(profit>max){
                max=profit;
            }
        }
        return max;
    }
    public static void main(String[] args){
int[] prices = {7, 1, 5, 3, 6, 4};
int ans=bestTimeToBuySellStock(prices);
System.out.println(ans);
    }
}