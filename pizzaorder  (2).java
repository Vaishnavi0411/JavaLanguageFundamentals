import java.util.Scanner;
public class PizzaOrder {
	void displayCustomerDetails(String name,String email,long phoneNo, String address)
	{
		System.out.println("Customer Details");
		System.out.println("-------------------");
		System.out.println("Name of the Customer is : "+name);
		System.out.println("Email of the Customer is : "+email);
		System.out.println("Contact No of the Customer is : "+phoneNo);
		System.out.println("Address of the Customer is : "+address);
		System.out.println("-------------------------------------------------");
		}

	void displayMenu()
	{
		System.out.println("Select the items to order");
		System.out.println("Sl no\t Item category");
		System.out.println("-----------------------------------------------------------");
		System.out.println("1) Pizza");
		System.out.println("Price of one regular pizza : $"+9.99);
		System.out.println("Price of one medium pizza  : $"+11.99);
		System.out.println("Price of one large pizza   : $"+13.99);
		System.out.println("2) GarlicBread");
		System.out.println("Price of one Garlic bread  : $"+5.99);
		System.out.println("3) Beverages");
		System.out.println("Price of beverages         : $"+1.99);
		}

	public float getPriceOfPizzaBasedOnSize(int size)
	{
		float priceOfPizza=0;
		if(size == 1){
			priceOfPizza=9.99f;
		}
		else if(size == 2){
			priceOfPizza=11.99f;
		}
		else if(size == 3){
			priceOfPizza=13.99f;
		}
		else{
			System.out.println("Invalid size,Enter 1,2 or 3");
			priceOfPizza=0;
		}
		return priceOfPizza;
	}

	public float getPriceOfGarlicBread(){
		return 5.99f;
	}

	public float getPriceOfBeverage(){
		return 1.99f;
	}

	public float calculatePriceOfPizza(int noOfPizza, float priceOfPizza) {
		return noOfPizza * priceOfPizza;
	}
	
	public float calculatePriceOfGarlicBread(int noOfGarlicBread, float priceOfGarlicBread) {
		return noOfGarlicBread * priceOfGarlicBread;
	}
	
	public float calculatePriceOfBeverage(int noOfBeverages, float priceOfBeverages) {
		return noOfBeverages * priceOfBeverages;
	}

	public float calculateTotalBill(float totalPizzaPrice, float totalGarlicBreadPrice, float 			totalBeverages) {
		return totalPizzaPrice + totalGarlicBreadPrice + totalBeverages;
	}

	public float calculateDiscountAndReturnBillAmount(float totalBillAmount) {
	return totalBillAmount-(totalBillAmount*0.10f);
	}

	public void displayOrderDetails(int noOfPizza, int noOfGarlicBread, int noOfBeverages, float 		totalPrice, float totalPrizeAfterDiscount) {
		System.out.println("Order Details");
		System.out.println("-----------------");
		System.out.println("The number of pizzas ordered       : "+noOfPizza);
		System.out.println("The number of garlic bread ordered : "+noOfGarlicBread);
		System.out.println("The number of beverages ordered    : "+noOfBeverages);
		System.out.println("------------------------------------------------------------------");
		if(totalPrice>50)
		{
		System.out.println("The Total Bill Amount is       : $"+totalPrice);
		System.out.println("The Discounted Bill Amount is  : $"+totalPrizeAfterDiscount);
		}
		else{
		System.out.println("The Total Bill Amount is      : $"+totalPrice);
		System.out.println("No Discount on Bill");
		}
	} 
	
    public static void main(String[] input) {
		PizzaOrder pizzaOrdering= new PizzaOrder();
		int ans;
		int size=0;
		int option;
		int noOfPizza=0;
		int noOfGarlicBread=0;
		int noOfBeverages=0;
		float priceOfPizza=0;
		float priceOfGarlicBread=0;
		float priceOfBeverages=0;
		float totalBillAmount=0;
		float totalBillAmounAfterDiscount=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = scanner.next();
		System.out.println("Enter your Email");
		String email = scanner.next();
		scanner.nextLine();
		System.out.println("Enter your Address");
		String address = scanner.nextLine();
		System.out.println("Enter your ContactNo.");
		long phoneNo = scanner.nextLong();
		
			pizzaOrdering.displayMenu();
			do{
			System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
			option= scanner.nextInt();
			switch(option)
			{
				case 1:
				{
					System.out.println("Enter 1 for Regular, 2 for Medium and 3 for Large");
					size= scanner.nextInt();
					priceOfPizza = pizzaOrdering.getPriceOfPizzaBasedOnSize(size);
					System.out.println("Please enter the number of Pizza you want to order :");
		   	        noOfPizza = scanner.nextInt();
			    }
		    	break;

		 		case 2:
				{
					priceOfGarlicBread= pizzaOrdering.getPriceOfGarlicBread();
					System.out.println("Please enter the number of Garlic Bread you want to order :");
					noOfGarlicBread = scanner.nextInt();
        	    }
				break;

				case 3:
				{
					priceOfBeverages= pizzaOrdering.getPriceOfBeverage();
					System.out.println("Please enter the number of Beverages you want to order :");
					noOfBeverages = scanner.nextInt();
         		}
				break;

	    		default:
					System.out.println("wrong option");
				break;
			}
			float totalPizzaPrice=pizzaOrdering.calculatePriceOfPizza(noOfPizza,priceOfPizza);
			float totalGarlicBreadPrice=pizzaOrdering.calculatePriceOfGarlicBread								(noOfGarlicBread,priceOfGarlicBread);
			float totalBeveragesPrice=pizzaOrdering.calculatePriceOfBeverage(noOfBeverages,						priceOfBeverages);

			totalBillAmount = pizzaOrdering.calculateTotalBill(totalPizzaPrice, 								totalGarlicBreadPrice,totalBeveragesPrice);
			totalBillAmounAfterDiscount = pizzaOrdering.calculateDiscountAndReturnBillAmount					(totalBillAmount);
			
			System.out.println("Do you want to place another order enter 1 to continue or 0 to exit");
			ans=scanner.nextInt();
		} while(ans==1);

		pizzaOrdering.displayCustomerDetails(name,email,phoneNo,address);
		pizzaOrdering.displayOrderDetails(noOfPizza,noOfGarlicBread,noOfBeverages,totalBillAmount,		   totalBillAmounAfterDiscount);
		scanner.close();
	}
}
