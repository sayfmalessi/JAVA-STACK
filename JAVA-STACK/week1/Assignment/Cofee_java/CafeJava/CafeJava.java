public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly ";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCOFEE = 4.5;
        double late = 5.5 ;
        double capuccino = 7.7 ; 
    
        // Customer name variables (add yours below)
        String customer1 =  "Cindhuri";
        String customer2 =  "Sam";
        String customer3 =  "Jimmy" ;
        String Customer4 =   "Naah" ;

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false ;
        boolean isReadyOrder3= false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(pendingMessage + customer1);
        
        System.out.println(generalGreeting + Customer4);
            if (isReadyOrder4) {
                System.out.println(readyMessage + Customer4);
                System.out.println(displayTotalMessage + capuccino) ; }
        
                System.out.println(customer2 +","+ displayTotalMessage + late*2) ; 
                
                
                if (isReadyOrder2) {
                    System.out.println(pendingMessage + customer2);
                } else {
                    System.out.println(readyMessage) ;
                    }
                    System.out.println(customer3 +","+ displayTotalMessage +( late-dripCOFEE));
    }
}



