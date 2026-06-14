import java.util.*;

public class gcd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=sc.nextInt();
        System.out.println("Enter the second number:");
        int n2=sc.nextInt();

        int gcd=1;
        int n=Math.min(n1, n2);

        for(int i=n;i>0;i--){
            if(n1%i==0 && n2%i==0){
                gcd=i;
                break;
            }
        }

        System.out.println("The gcd of "+n1+" and "+n2+" is "+gcd+"");


    }
    
}
