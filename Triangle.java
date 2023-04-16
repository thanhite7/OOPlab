import java.util.Scanner;
public class Triangle {
    public static void main(String [] agrs)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<2*n+1;i+=2)
        {
            for(int j=1;j<=(2*n+1-i)/2;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=(2*n+1-i)/2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
