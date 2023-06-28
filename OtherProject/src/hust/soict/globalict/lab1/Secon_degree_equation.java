package hust.soict.globalict.lab1;

import java.util.*;
public class Secon_degree_equation {
    public static void main(String [] agrs)
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c,delta;
        System.out.print("Enter a:");
        a=  sc.nextDouble();
        System.out.print("Enter b:");
        b=  sc.nextDouble();
        System.out.print("Enter c:");
        c=  sc.nextDouble();
        delta = b*b-4*a*c;
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                {
                    System.out.println("The equation has many soluiton");
                }
                else
                {
                    System.out.println("The equation has no solution");
                }
            }
            else
            {
                System.out.printf("The equation has 1 solution: x = %f",-c/b);
            }
        }
        else
        {
            if(delta<0)
            {
                System.out.println("The equation has no solution");
            }
            else if(delta==0)
            {
                System.out.printf("The equation has 1 solution: x = %f",-b/(2*a));
            }
            else
            {
                System.out.printf("The equation has 2 solution: x1 = %f and x2 = %f",(-b+Math.sqrt(delta))/(2*a),(-b-Math.sqrt(delta))/(2*a));
            }
        }
    }
}
