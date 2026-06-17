import java.util.*;

public class reverseArray {
    public int[] reverse(int arr[],int left,int right){
        if(left>=right){
            return arr;
        }

        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        return reverse(arr,left+1,right-1);

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        reverseArray obj=new reverseArray();

        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int left=0;
        int right=n-1;

        int[] revArray=new int[n];
        revArray=obj.reverse(arr,left,right);

        System.out.println("The reversed array is");
        for(int i=0;i<n;i++){
            System.out.println(revArray[i]);
        }
    }
}
