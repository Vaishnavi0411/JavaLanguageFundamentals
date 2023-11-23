class PizzaOrder {
       public static void main(String[] args) {
		String name = "Gary";
		long phoneNo = 412312345l;
		String email = "gary@123.com";
		String address = "20, Marble Drive, Eville";
		int noOfPizza = 5;
		float pizzaPrice=12.5f;
		char pizzaSize='M';
		int noOfGarlicBread=3;
		float garlicBreadPrice=5.99f;
		int noOfBeverages=3;
		float beveragePrice=1.99f;

		float tpofpizza=noOfPizza*pizzaPrice;
		float tpofgarlicbread=noOfGarlicBread*garlicBreadPrice;
		float tpofbeverages=noOfBeverages*beveragePrice;
		

		System.out.println("--------------------------------"); 
	    System.out.println("       Customer Details");       
		System.out.println("--------------------------------"); 
		System.out.println("Customer Name : "+name); 
		System.out.println("Customer Phone Number : "+phoneNo); 
		System.out.println("Customer email : "+email); 
		System.out.println("Customer Address : "+address); 
		System.out.println(""); 
		System.out.println("--------------------------------"); 
		System.out.println("        Order Summary"); 
		System.out.println("--------------------------------"); 
		System.out.format("%-10s%-15s%-20s%-20s%-10s\n","Sr.no","Item Name","ItemQuality","$Price/Unit","$TotalPrice");
		System.out.println("----------------------------------------------------------------------------"); 
		System.out.format("%-10d%-15s%-20d%-20.1f%-10.1f\n",1,"Pizza",noOfPizza,pizzaPrice,tpofpizza);
		System.out.format("%-10d%-15s%-20d%-20.2f%-10.2f\n",2,"Garlic Bread",noOfGarlicBread,garlicBreadPrice,tpofgarlicbread);
		System.out.format("%-10d%-15s%-20d%-20.2f%-10.7f\n",3,"Beverages",noOfBeverages,beveragePrice,tpofbeverages);
		System.out.println("----------------------------------------------------------------------------"); 
	    float billAmount = (tpofpizza+tpofgarlicbread+tpofbeverages);
		System.out.println("Total Bill Amount: $"+billAmount);

		float discount = billAmount-(billAmount*0.10f);
		System.out.println("Discount offered : 10%");
		System.out.println("Amount to be paid: $"+discount);
		System.out.println("----------------Thank you-----------------------------"); 

    }
}

