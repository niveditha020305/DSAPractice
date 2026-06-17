import java.util.*;

public class printingNtimes{
    public void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello");

        print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printingNtimes obj=new printingNtimes();

        System.out.println("Enter the n value:");
        int n=sc.nextInt();

        obj.print(n);
    }
}