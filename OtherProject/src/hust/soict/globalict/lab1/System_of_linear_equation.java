package hust.soict.globalict.lab1;

import java.util.*;
public class System_of_linear_equation {
    public static void main(String [] agrs)
    {
        Scanner sc = new Scanner(System.in);
        double a11,a12,a21,a22,b1,b2;
        System.out.print("Enter a11: ");
        a11 = sc.nextDouble();
        System.out.print("Enter a12: ");
        a12 = sc.nextDouble();
        System.out.print("Enter b1: ");
        b1 = sc.nextDouble();
        System.out.print("Enter a21: ");
        a21 = sc.nextDouble();
        System.out.print("Enter a21: ");
        a22 = sc.nextDouble();
        System.out.print("Enter b2: ");
        b2 = sc.nextDouble();
        double D=a11*a22-a21*a12,Dx=a12*b2-b1*a22,Dy=a11*b2-a21*b1;
        if (D==0)
        {
            if(Dx==Dy)
            {
                System.out.println("System has many solutions");
            }
            else
            {
                System.out.println("System has no solution");
            }
        }
        else
        {
            System.out.printf("System has 2 solutions: x1 = %f and x2 = %f",Dx/D,Dy/D);
        }

        
    }
}
