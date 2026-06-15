import java.util.*;

public class armstrong {

    public boolean isArmstrong(int n){
        int original=n;
        int count=0;
        if(n<0){
            return false;
        }
        if(n==0){
            count=1;
        }

        while(n>0){
            count=count+1;
            n=n/10;
        }
        int temp=original;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum=sum+(int)Math.pow(digit,count);
            temp=temp/10;
        }
        return sum==original;

    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        int n=sc.nextInt();

        armstrong obj=new armstrong();
        boolean res=obj.isArmstrong(n);
        if(res){
            System.out.println("The number is armstrong number");
        }
        else{
            System.out.println("The number is not armstrong numger");
        }
    }
    
}
