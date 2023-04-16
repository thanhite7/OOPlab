import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class day_of_month {
   public static void main(String [] agrs)
   {
        Scanner sc = new Scanner(System.in);
        String month;
        int year;
        int check =0;
        int day=0;
        String temp;
        do
        {
            System.out.print("Enter year:");
            year = sc.nextInt();
            temp = Integer.toString(year);
            if(year<0 || temp.length()!=4)
            {
               System.out.println("Invalid year! Try again!");
            }

        }while(year<0|| temp.length()!=4);
        String c  = sc.nextLine();
        do
        {
         System.out.print("Enter month:");
         month = sc.nextLine();
         switch(month)
         {
            case "January": case "Jan.": case "Jan": case "1": case "March": case "Mar.":case "Mar":
            case "3": case "May": case "5": case "July": case "Jul": case "7": case "August": case "Aug.": case "Aug":
            case "8": case "October": case "Oct.": case "Oct": case "10": case "December": case "Dec.": case "Dec": case "12": 
                day = 31;
                check = 1;
                break;
            case "April": case "Apr.": case "Apr": case "4": 
            case "June": case "Jun": case "6": case "September": case "Sept.": case "Sep": case "9": case "November": case "Nov.": case "Nov": case "11":
                day =30;
                check =1;
                break;
            case "February": case "Feb.": case "Feb": case "2":
                
                if(year %400==0 || (year%4==0 && year %100!=0))
                {
                   day = 29;
                }
                else 
                {
                   day = 28;
                }
                check = 1;
                break;
            default:
                System.out.println("Invalid Month. Try again!");
                break;
 
            }
         }while(check==0);
         System.out.print("The month " + month + "/"+year);
         System.out.printf(" has %d days\n",day);


   } 
}
