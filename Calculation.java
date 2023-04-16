import java.util.*;
public class Calculation {
    public static void main(String [] agrs)
    {
        //Nguyen Tien Thanh 20215243
        Scanner sc = new Scanner(System.in);
        String strnums1,strnums2;
        System.out.print("Enter the first number: ");
        strnums1 = sc.nextLine();
        System.out.print("Enter the second number: ");
        strnums2 = sc.nextLine();
        double num1 = Double.parseDouble(strnums1);
        double num2 = Double.parseDouble(strnums2);
        System.out.printf("The sum is: %f\n",num1+num2);
        System.out.printf("The difference is: %f\n",num1-num2);
        System.out.printf("The product is: %f\n",num1*num2);
        if (num2==0)
        {
            System.out.print("The divisor is 0, can not divide 2 number!\n");
        }
        else
        {
            System.out.printf("The quotient is : %f",num1/num2);
        }


    }
}


