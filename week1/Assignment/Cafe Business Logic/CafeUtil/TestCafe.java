import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthStyle;
public class TestCafe {
    public static void main(String[] args) {
        
    /* 
      You will need add 1 line to this file to create an instance 
      of the CafeUtil class. 
      Hint: it will need to correspond with the variable name used below..
    */
    	
        /* ============ App Test Cases ============= */
    
        // System.out.println("\n----- Streak Goal Test -----");
        // System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());
    
        // System.out.println("----- Order Total Test-----");
        // double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        // System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
         System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip cofee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        for (int i = 0 ; i<menu.size();i++){
            
            System.out.println(i+" "+menu.get(i)); 
        }
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        customers.add("sayf");
        customers.add("sbour");
        customers.add("smirlo");
        customers.add("sadik");

        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("hi "+username);
        System.out.println("people that ahead of u are");
        for (int i =0; i< customers.size(); i++){

            System.out.print("+"+customers.get(i));

        }
        customers.add(username);
        System.out.println(customers);
    

        // // --- Test 4 times ---
        // for (int i = 0; i < 4; i++) {
        //     appTest.addCustomer(customers);
        //     System.out.println("\n");
        // }
    }
}
