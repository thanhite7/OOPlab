import java.util.*;
public class add_two_matrix {
    public static void main(String [] agrs) 
    {
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of row of each matrix: ");
        m = sc.nextInt();
        System.out.print("Enter number of column of each matrix: ");
        n = sc.nextInt();
        int arr1 [][] = new int[m][n];
        int arr2 [][] = new int[m][n];
        System.out.println("Enter elements of matrix 1: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix 2: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("The sum of two matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%d ",arr1[i][j]);
            }
            System.out.print("\n");
        }

    }  
}
