import java.util.*;

public class printingNto1 {
    public void print(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);

        print(n-1);
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        printingNto1 obj=new printingNto1();

        System.out.println("Enter the n value:");
        int n=sc.nextInt();

        obj.print( n);
    }
}
