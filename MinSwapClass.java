package InterviewPrep;

import java.util.Scanner;

public class MinSwapClass {
	static void swap(int arr[],int i,int pos)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[pos];
        arr[pos]=temp;
    }

    static int find(int[] arr,int num)
    {
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                break;
            }
        }
        return i;
    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=i+1)
            {
                int pos=find(arr,i+1);
                swap(arr,i,pos);
                count++;
            }
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }

        int res = minimumSwaps(arr);

        System.out.println(res);
        scanner.close();
    }

}
