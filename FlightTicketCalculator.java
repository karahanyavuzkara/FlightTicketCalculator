package patika;
import java.util.Scanner;
public class FlightTicketCalculator {

public static void main (String[]args) {
    
double age , range , type, cost;
   	
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter the range you will go by km : "); 	
   	range = input.nextDouble();
   
   	System.out.print("Enter your age : ");
  	age = input.nextDouble();
    
   	System.out.println("If your flight type is one way press 1 : ");
    System.out.print("If your flight type is two way press 2 : ");
    type = input.nextDouble();
    
    if ((age < 12 ) && ( type == 1)) {
      cost = range * 0.05 ;
      System.out.print("Your flight cost : "+ cost);
     	
    }

    if ((age < 12 ) && ( type == 2)) {
        cost = range * 0.04 ;
        System.out.print("Your flight cost : "+ cost);
       	
      }
    
    if ((age <= 24 ) && (type == 1)) {
    	cost = range * 0.09 ;
    	System.out.print("Your flight cost : "+ cost);
    	
    }
     
    if ((age <= 24 ) && (type == 2)) {
    	cost = range * 0.072 ;
    	System.out.print("Your flight cost : "+ cost);
    	
    }
    
    if ((age > 65 ) && (type == 1)) {
    	cost = range * 0.07 ; 
    	System.out.print("Your flight cost : " + cost);
    
    }
    if ((age > 65 ) && (type == 2)) {
    	cost = range * 0.056 ; 
    	System.out.print("Your flight cost : " + cost);
    
    }




    
   

}
}
