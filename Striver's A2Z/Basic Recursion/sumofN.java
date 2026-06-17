import java.util.*;

public class sumofN {
    public int sum(int n){

        if(n==0){
            return 0;
        }

        return n + sum(n-1);
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        sumofN obj=new sumofN();

        System.out.println("Enter the n value:");
        int n=sc.nextInt();

        int res=obj.sum(n);

        System.out.println("The sum of 1 to "+n+" numbers is "+res+"");

    }
}
