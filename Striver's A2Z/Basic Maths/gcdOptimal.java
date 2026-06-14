import java.util.*;

public class gcdOptimal {
    public int gcd(int n1,int n2){
        if(n2==0){
            return n1;
        }

        return gcd(n2,n1%n2);
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=sc.nextInt();
        System.out.println("Enter the second number:");
        int n2=sc.nextInt();

        gcdOptimal obj=new gcdOptimal();

        int gcd=obj.gcd(n1,n2);

        System.out.println("The gcd of "+n1+" and "+n2+" is "+gcd+"");
    }
    
}
