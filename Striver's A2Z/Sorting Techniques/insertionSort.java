import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter " + n + " elements:");
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }


        for(int i=0;i<n;i++){
            int current=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=current;

        }

        System.out.println("The sorted array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }    
}
