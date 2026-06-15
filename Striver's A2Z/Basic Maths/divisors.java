import java.util.*;

public class divisors {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        System.out.println("The divisors of "+n+" are:");

        ArrayList<Integer> divisors = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                divisors.add(i);
    
            }
        }
        int size=divisors.size();
        int[] results=new int[size];

        for(int i = 0; i < divisors.size(); i++){
            results[i]=divisors.get(i);
        }

        for(int i = 0; i < divisors.size(); i++){
            System.out.println(results[i]);
        }

        
    }
    
    
}
