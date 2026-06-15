import java.util.*;

public class checkPrime {
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
            
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        checkPrime obj=new checkPrime();

        System.out.println("Enter the number:");
        int n=sc.nextInt();

        boolean result=obj.isPrime(n);

        if(result){
            System.out.println("The given number is a prime");
        }
        else{
            System.out.println("The given number is not a prime");
        }
    }
    
}
