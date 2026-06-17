import java.util.*;

public class printing1toN{
    public void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);

        print(i+1,n);
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        printing1toN obj=new printing1toN();

        System.out.println("Enter the n value:");
        int n=sc.nextInt();

        int i=1;

        obj.print(i, n);
    }
}