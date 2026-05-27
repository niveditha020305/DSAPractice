
import java.util.Scanner;
class Q121 {
    
    public int maxProfit(int[] prices) {

        int chPri=prices[0];
        int maxProf=0;

        for(int i=1;i<prices.length;i++){
            int bDay=0;
            if(prices[i]<chPri){
                chPri=prices[i];
                bDay=i;
            }

            if(prices[i]-chPri>maxProf && i>bDay){
                maxProf=prices[i]-chPri;
            }
        }

        return maxProf;
        
    }

    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        Q121 obj=new Q121();
        String input=sc.nextLine();
        String[] parts=input.split(" ");

        int[] prices=new int[parts.length];

        for(int i = 0; i < parts.length; i++) {
            prices[i] = Integer.parseInt(parts[i]);
        }

        int profit=obj.maxProfit(prices);

        System.out.println(profit);



    }
}