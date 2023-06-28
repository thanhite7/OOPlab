package hust.soict.globalict.lab1;
import java.util.*;
public class array {
    public static void main(String [] agrs) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array:");
        n  =sc.nextInt();
        int arr [] = new int[n];
        System.out.print("Enter each element of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        double aver = (double) sum/n;
        System.out.println("The sorted array is: " + Arrays.toString(arr));
        System.out.println("The sum of the array elements is: " + sum);
        System.out.println("The average of the array elements is: " + aver);
        System.exit(0);

    }
}
