package leetCode;

public class BestTimetoBuyandSellStockII122 {
    public static void main(String[] args) {
        int []a = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
    public static int maxProfit(int[] a) {

        int max=0;

        for(int i=1;i<a.length;i++){
if(a[i]>a[i-1]){
    max+=a[i]-a[i-1];
}

        }
        return max;

    }
}
