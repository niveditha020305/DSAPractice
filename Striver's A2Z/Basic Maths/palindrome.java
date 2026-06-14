import java.util.*;

public class palindrome {
    public boolean isPalindrome(int x) {
        int rev=0;
        int num=x;
        if(x<0){
            return false;
        }    
        else{
            while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
            }
        }


        return num==rev;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        palindrome obj=new palindrome();
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean res=obj.isPalindrome(n);
        if(res){
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }
}
    

