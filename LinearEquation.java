import java.util.*;
public class LinearEquation {
    public static void main(String [] agrs)
    {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        a = sc.nextDouble();
        System.out.print("Enter b:");
        b = sc.nextDouble();
        if(a==0)
        {
            if (b==0)
            {
                System.out.println("The equation has many solutions\n");
            }
            else
            {
                System.out.println("The equation has no solution\n");
            }
        }
        else
        {
            System.out.printf("The equation has a solution: %f\n", -b/a);
        }


    }
}
