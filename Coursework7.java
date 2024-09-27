import java.util.*;

class Coursework7{
	
	public static void homePage(){
		System.out.println("\t /$$$$$$$$                 /$$       /$$                              /$$$$$$  /$$");
		System.out.println("\t| $$_____/                | $$      |__/                             /$$__  $$| $$");
		System.out.println("\t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$ /$$$$$$$$         | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$");
		System.out.println("\t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$        |  $$$$$$ | $$__  $$ /$$__  $$ /$$__ $$");
		System.out.println("\t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$         \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$");
		System.out.println("\t| $$   /$$__  $$ \\_____ $$| $$  | $$| $$| $$  | $$| $$  | $$         /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$");
		System.out.println("\t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$        |  $$$$$$/| $$  | $$|  $$$$$$ | $$$$$$$/");
		System.out.println("\t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/         \\______/ |__/  |__/ \\_______ | $$____/");
		System.out.println("\t                                                                                                  | $$");
		System.out.println("\t                                                                                                  | $$");
		System.out.println("\t                                                                                                  |__/");
		
		System.out.println("\n\t____________________________________________________________________________________________________________");
		
		System.out.println("\n\n\t\t\t[1] Place Order                                [2] Search Customer\n\n");
		System.out.println("\t\t\t[3] Search Order                               [4] View Reports\n\n");
		System.out.println("\t\t\t[5] Set Order Status                           [6] Delete Order\n\n");
		
	}
	
	public static String generateID(String[] orders){
		int num = orders.length-1/5 + 1;
		String ID;
		if (num < 10){
			ID = "ODR#0000" + num;
		}else if (num < 100){
			ID = "ODR#000" + num;
		}else if (num < 1000){
			ID = "ODR#00" + num;
		}else if (num < 10000){
			ID = "ODR#0" + num;
		}else{
			ID = "ODR#" + num;
		}
		orders[orders.length-1] = ID;
		return ID;
	}
	
	public static void getValidContactNumber(){
		Scanner input = new Scanner (System.in);
		String isValid = "n";
		while (isValid.equals("n")){
			System.out.print("\n\t\t\tEnter Customer Phone Number : ");
			String contactNumber = input.next();
			if (contactNumber.charAt(0) == '0' && contactNumber.length() == 10){
				isValid = "y";
				break;
			}else{
				System.out.println("\n\t\t\tInvalid phone number. Try again");
				
				while (true){
					System.out.print("\n\t\t\tDo you want to enter phone number again? (y/n) : ");
					String reEnter = input.next();
					if (reEnter.equals("y") || reEnter.equals("y")){
						getValidContactNumber();
						return;
						//break;
					}else if (reEnter.equals("n") || reEnter.equals("N")){
						return;
					}else{
						System.out.println("\n\t\t\tPlease enter \"y\" or \"n\"");
					}
				}
			}
		}
	}
	
	public static String getSize(){
		Scanner input = new Scanner(System.in);
		while (true){
			System.out.print("\n\t\t\tEnter T-Shirt Size (XS/S/M/L/XL/XXL) : ");
			String size = input.next();
			if (size.toLowerCase().equals("xs") || size.toLowerCase().equals("s") || size.toLowerCase().equals("m") || size.toLowerCase().equals("l") ||
			size.toLowerCase().equals("xl") || size.toLowerCase().equals("xxl") ){
				return size;
			}else{
				System.out.println("Please enter valid size(XS/S/M/L/XL/XXL).");
			}
		}
	}
	
	public static int quantity(){
		Scanner input = new Scanner(System.in);
		while (true){
			try{
				System.out.print("\n\t\t\tEnter QTY : ");
				int qty = input.nextInt();
			}catch (Exception e){
				System.out.println("\n\t\t\tInvalid number");
			}
		}
	}
	
	public static void placeOrder(String[] orders){
		
		System.out.println("\n\n\t\t _____  _                   ____          _ ");
		System.out.println("\t\t|  __ \\| |                 / __ \\        | |");
		System.out.println("\t\t| |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __");
		System.out.println("\t\t|  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|");
		System.out.println("\t\t| |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |");
		System.out.println("\t\t|_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|");
		
		System.out.println("\n\t\t______________________________________________________\n");
		
		//String id = generateID(orders);
		//System.out.println("Order ID : " + id);
		System.out.println("");
		System.out.println("");
		
		
		
		
		getValidContactNumber();
		getSize();
		
		
	}
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		String[] orders = new String[1000];
		
		//homePage();
		
		while (true){
			homePage();
			try{
				System.out.print("\n\n\n\t\t\tInput Option : ");
				int option = input.nextInt();
				
				switch (option){
					case 1:
						placeOrder(orders);
						break;
					default:
						System.out.println("xxxxxxxxxxxxxx");
				}
			}catch (Exception e){
				System.out.println("\n\n\t\t\tInvalid input. Please input again your option.");
				
				input.next();
			}
		}
		
	}
}

