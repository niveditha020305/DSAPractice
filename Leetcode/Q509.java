import java.util.Scanner;
class Q509 {
    public int fib(int n) {

        int ans;
        
        if(n==0){
            return 0;
        }

        else if(n==1){
            return 1;
        }
        
        else{
            
            ans=fib(n-1)+fib(n-2);
        }
       

        return ans;
        
    }


    

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        Q509 obj=new Q509();

        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        int res=obj.fib(n);

        System.out.println(res);
    }
}