import java.util.*;

public class factorial {
    public int fact(int n){

        if(n==0){
            return 1;
        }

        return n*fact(n-1);
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        factorial obj=new factorial();

        System.out.println("Enter the n value:");
        int n=sc.nextInt();

        int res=obj.fact(n);

        System.out.println("The factorial of "+n+" is "+res+"");

    }
}

