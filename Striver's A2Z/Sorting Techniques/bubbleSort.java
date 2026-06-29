import java.util.*;

public class bubbleSort {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter " + n + " elements:");
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=1;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
}
}
