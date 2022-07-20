import java.util.ArrayList;

public class TestCafe {
    public static void main(String [] args){

        CafeUtil cafe = new CafeUtil();

        int goal = cafe.getStreakGoal(10);
        System.out.println(goal);

        double[] items = new double[5];
        items[0]=3.5;
        items[1]=6.5;
        items[2]=15.2;
        items[3]=22.5;
        items[4]=9.7;
        double prices1 = cafe.getOrderTotal(items);
        System.out.println(prices1);


        

        
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("drip coffee");
        myList.add("cappuccino");
        myList.add("latte");
        myList.add("mocha");
        cafe.displayMenu(myList);

        ArrayList<String> cust = new ArrayList<String>();
        cafe.addCustomer(cust);
        // .addCustomer method takes as many customers until the user enter q to exit
        // it also return us a list of strings with all the entered customer names
        ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < customers.size(); i++) {
            String customerName = customers.get(i);
            System.out.println("customer name: "+ customerName);

    }
}
}