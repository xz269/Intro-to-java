import java.util.Scanner;

public class Menu_41342 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		char menu;
		int quantity;
		double a = 24.99;
		double b = 17.99;
		double c = 15.99;
		double d = 5.99;
		double e = 7.99;
		double f = 4.99;
		double g = 1.29;
		double h = 1.50;
		double i = 2.5;
		System.out.printf("Welcome to the Java restaurant.You can choose one of the following items:\n"
				+ "a- Grilled salmon, price $%.2f\n"
				+ "b- New York Steak, price $%.2f\n"
				+ "c-Roast Chicken, price $%.2f\n"
				+ "d-Salad, price $%.2f\n"
				+ "e-Soup, price $%.2f\n"
				+ "f-Hamburger, price $%.2f\n"
				+ "g-Soft drink, price $%.2f\n"
				+ "h-Tea, price $%.2f\n"
				+ "i-Orange juice, price $%.2f\n",a,b,c,d,e,f,g,h,i);
		System.out.println("Select a letter from the menu:");
		menu = in.next().charAt(0);
		if (menu < 'a'|| menu > 'i'){
			System.out.println("Invalid item");
			System.exit(1);
		}
		System.out.println("Enter the quantity:");
		quantity = in.nextInt();
		int limit;
		if (quantity < 0){
			System.out.println("Invalid item quantity. It must not be nagetive.");
			System.exit(1);
		}
		
		if (menu >= 'a' && menu <= 'c'){
			limit = 50;
			if (quantity > limit){
				System.out.println("Invalid item quantity. It must not exceed 50.");
				System.exit(1);
			}
		}else{
			limit = 200;
			if (quantity > limit){
				System.out.println("Invalid item quantity. It must not exceed 200.");
				System.exit(1);
			}
		}
		double price,tips,tax,total;
		switch(menu){
		case 'a':System.out.printf("The item price for (%d x Grilled salmon) is: $%.2f\nThe sale tax is $%.2f\n\n",quantity,quantity*a,quantity*a*(9.25/100));
				 System.out.println("Enter the gratuity amount:");
				 price = quantity * a;
				 tips = in.nextDouble();
				 tax = price * (9.25/100);
				 total = price +tips + tax;
				 System.out.printf("Your total price is $%.2f\n", total);
				 break;
		case 'b':System.out.printf("The item price for (%d x New York Steak) is: $%.2f",quantity,quantity*b);
				 price = quantity*b;
				 tips = in.nextDouble();
				 tax = price * (9.25/100);
				 total = price +tips + tax;
				 System.out.printf("Your total price is $%.2f\n", total);
				 break;
		case 'c':System.out.printf("The item price for (%d x Roast Chicken) is: $%.2f",quantity,quantity*c);
				 price = quantity*c;
				 tips = in.nextDouble();
				 tax = price * (9.25/100);
				 total = price +tips + tax;
				 System.out.printf("Your total price is $%.2f\n", total);
				 break;
		case 'd':System.out.printf("The item price for (%d x Salad) is: $%.2f",quantity,quantity*d);
				 price = quantity*d;
				 tips = in.nextDouble();
				 tax = price * (9.25/100);
				 total = price +tips + tax;
				 System.out.printf("Your total price is $%.2f\n", total);
				 break;
		case 'e':System.out.printf("The item price for (%d x Soup) is: $%.2f",quantity,quantity*e);
			 	 price = quantity*e;
			 	 tips = in.nextDouble();
				 tax = price * (9.25/100);
				 total = price +tips + tax;
				 System.out.printf("Your total price is $%.2f\n", total);
				 break;
		case 'f':System.out.printf("The item price for (%d x Hamburger) is: $%.2f",quantity,quantity*f);
				 price = quantity*f;
				 tips = in.nextDouble();
				 tax = price * (9.25/100);
				 total = price +tips + tax;
				 System.out.printf("Your total price is $%.2f\n", total);
				 break;
		case 'g':System.out.printf("The item price for (%d x Hamburger) is: $%.2f",quantity,quantity*g);
				 price = quantity*g;
				 tips = in.nextDouble();
				 tax = price * (9.25/100);
				 total = price +tips + tax;
				 System.out.printf("Your total price is $%.2f\n", total);
				 break;
		case 'h':System.out.printf("The item price for (%d x Hamburger) is: $%.2f",quantity,quantity*h);
				 price = quantity*h;
				 tips = in.nextDouble();
				 tax = price * (9.25/100);
				 total = price +tips + tax;
				 System.out.printf("Your total price is $%.2f\n", total);
				 break;
		case 'i':System.out.printf("The item price for (%d x Hamburger) is: $%.2f",quantity,quantity*i);
				price = quantity*i;
				tips = in.nextDouble();
			    tax = price * (9.25/100);
			    total = price +tips + tax;
			    System.out.printf("Your total price is $%.2f\n", total);
			    break;
		default:System.exit(1);
		}
		System.out.println("\nThank you for your order");
	}
}
