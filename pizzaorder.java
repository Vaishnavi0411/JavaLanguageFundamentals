import java.util.Scanner;
public class PizzaOrder {
    public static void main(String[] input) {
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("!!!Welcome!!!");
		System.out.println("!!!Enter customer details for placing an order !!!");
		System.out.println("Enter your Name");
		String name = scanner.next();
		System.out.println("Enter your Email");
		String email = scanner.next();
		System.out.println("Enter your ContactNo.");
		long contactno = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter your Address");
		String address = scanner.nextLine();
		System.out.println("");
		System.out.println("!!! Thank you for providing your details !!!");
		System.out.println("");
		System.out.println("Select the item fromthe Main Menu");
		System.out.println("");
		System.out.println("s1 No    Item Category");
		System.out.println("---------------------------");
		System.out.println("1) Pizza");
		System.out.println("2) Garlic Bread");
		System.out.println("3) Beverages");
		System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
		option=scanner.nextInt();
		
		switch(option)
		{
			case 1:
			{
				System.out.println("Please enter the number of Pizza you want to order :");
		        int  num = scanner.nextInt();
				float price = 12.99f;
				float totalBill = price*num;
				System.out.println("Your total Pizza Bill : $"+ totalBill);
			}
			break;

			case 2:
			{
				System.out.println("Please enter the number of Garlic Bread you want to order :");
				int  num = scanner.nextInt();
				float price = 5.99f;
				float totalBill = price*num;
				System.out.println("Your total Garlic Bread Bill : $"+ totalBill);
            }
			break;

			case 3:
			{
				System.out.println("Please enter the number of Beverages you want to order :");
				int  num = scanner.nextInt();
				float price = 1.99f;
				float totalBill = price*num;
				System.out.println("Your total Beverage Bill : $"+totalBill);
         	}
			break;

	    	default:
				System.out.println("wrong option");
			break;
		
	}
}

}