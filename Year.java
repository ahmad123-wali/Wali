
package year;

import java.util.Scanner;

public class Year {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in); 
        System.out.println("please enter a year");
       int year = input.nextInt();
       
       if (year %4 == 0 && year % 100 != 0|| year%400==0){
         
      System.out.println("Thia is a leap year ");}
       else{System.out.println("This is not a leap year");
       
       }
    
}
    }
    
