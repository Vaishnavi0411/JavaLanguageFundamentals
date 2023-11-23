import java.util.Scanner;
public class PizzaOrder {
public static void main(String[] input) 
{
		int ans;
		int option;
		int noOfPizza;
		int noOfGarlicBread;
		int noOfBeverages;
		float totalBillAmt=0;
		float discountBillAmt=0;
		float priceOfPizza=12.99f;
		float priceOfGarlicBread=5.99f;	
		float priceOfBeverage=1.99f;
		float totalPizzaBill=0;
		float totalGarlicBreadBill=0;
		float totalBeveragesBill=0;
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = scanner.next();
		System.out.println("Enter your Email");
		String email = scanner.next();
		System.out.println("Enter your ContactNo.");
		String contactno = scanner.next();
		System.out.println("Enter your Address");
		String address = scanner.nextLine();
		scanner.nextLine();
		System.out.println("s1 No    Item Category");
		System.out.println("---------------------------");
		System.out.println("1) Pizza");
		System.out.println("2) Garlic Bread");
		System.out.println("3) Beverages");
		do{
			System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
			option=scanner.nextInt();
			switch(option)
			{
				case 1:
				{
					System.out.println("Please enter the number of Pizza you want to order :");
		   	        noOfPizza = scanner.nextInt();
					totalPizzaBill = priceOfPizza*noOfPizza;
			    }
		    	break;

		 		case 2:
				{
					System.out.println("Please enter the number of Garlic Bread you want to order :");
					noOfGarlicBread = scanner.nextInt();
					totalGarlicBreadBill = priceOfGarlicBread*noOfGarlicBread;
        	    }
				break;

				case 3:
				{
					System.out.println("Please enter the number of Beverages you want to order :");
					noOfBeverages = scanner.nextInt();
					totalBeveragesBill = priceOfBeverage*noOfBeverages;
         		}
				break;

	    		default:
					System.out.println("wrong option");
				break;
			}
		   

			System.out.println("Do you want to place another order enter 1 to continue or 0 to exit");
			ans=scanner.nextInt();
		}
			while(ans==1);
			 if(ans==0)
			{
				
			totalBillAmt = (totalPizzaBill + totalGarlicBreadBill + totalBeveragesBill);
			System.out.println("The total bill amount : $"+totalBillAmt);
			if(totalBillAmt>50)
			{
				 discountBillAmt = totalBillAmt-(totalBillAmt*0.10f);
				 System.out.println("The total discounted bill amount : $"+discountBillAmt);
			}
			else 
				System.out.println("No discount provided since bill amount is less than $50");
			}
		}
    }

