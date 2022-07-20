import java.util.ArrayList;

public class CafeUtil {
    
    
    public int getStreakGoal(int weeks){
            int sum = 0;
        for(int i= 0; i<=weeks; i++){
                sum += i;
        
        }
        return sum;
        
    }


    public double getOrderTotal(double[] prices){
        double totalPrice= 0;
        for (int i =0; i<prices.length; i++){
            totalPrice += prices[i];


        }
        return totalPrice;
     }

    public void displayMenu(ArrayList<String> menuItems){
        
        for(int i=0;i<menuItems.size();i++ ){
               
                String name = menuItems.get(i); 

                System.out.println(i+" "+name);
        }
            

    }

   
    public ArrayList<String> addCustomer(ArrayList<String> customers){
      
        while (true) {
            // Read customer name from console
            System.out.println("Please enter your name:");
            String customerName = System.console().readLine();
            // Check if the user entered q as a customer name then we exit the loop
            if (customerName.equals("q")) {
                break;
            }
            // Add the customer name that has been taken from console to our customers array
            // list
            customers.add(customerName);
        }

  // String.join converts the list to string like this "John,Ted,Ninja"
         System.out.println("[" + String.join(",", customers) + "]");
        return customers;

        

    }
   
}
