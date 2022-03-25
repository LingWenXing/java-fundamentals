// HDB Rentals
// This program maintain information about the rental of 1-Room, 2-Rooms and 3-Rooms HDB Flat
// Name : Ling Wen Xing

//Features done:
//1. Initialisation
//2. Display main menu(repeatedly)
//3. List items
//4. Display available items
//5. Enquire average rental of items on loan
//6. Update status of an item
//7. Validation (Partially done)
//A1. Changing the name of an item's category
//A2. List the items as grouped by categories
//A3. Remove an item

//Description Section: 
//In order to maintain the serial number for the items in running order, create a new 
//option in the main menu and then create a new method and passed in all required arrays, 
//then introduce a for loop to loop the serial numbers with an initialised i and a counter 
//i++, when the condition is (i < 10), prints ("000" + (i+1)), when the condition is (i > 9), 
//prints ("00" + (i+1)). Lastly, call the method in the new case in the switch statement. 

import java.util.*;

class HDB{
	final static int MAX_ITEMS = 15; // maximum number of items
	final static String[] categoryTypes = {"1-Room(Joint-Singles)", "2-Rooms(Family Nucleus)", "3-Rooms(Family Nucleus)"}; // the 3 types
	static String[] categories = new String[MAX_ITEMS]; // array for the categories
	static String[] titles = new String[MAX_ITEMS]; // array for the titles
	static int[] serialNos = new int[MAX_ITEMS]; // array for the serial numbers
	static double[]rentalCharges = new double[MAX_ITEMS]; // array for the rental charges
	static boolean[] statuses = new boolean[MAX_ITEMS]; // array to store the statuses
	
	//This method initialise the data for the first 3 items in the system
	public static int init(String[] categories, String[] titles, int[] serialNos, double[] rentalCharges, boolean[] statuses) {
		int itemCount = 3;
		categories[0] = "1-Room(Joint-Singles)";
		categories[1] = "2-Rooms(Family Nucleus)";
		categories[2] = "3-Rooms(Family Nucleus)";
		titles[0] = "Bayfront";
		titles[1] = "Labrador Park";
		titles[2] = "Promenade";
		serialNos[0] = 2222;
		serialNos[1] = 1111;
		serialNos[2] = 4444;
		rentalCharges[0] = 1000; 
		rentalCharges[1] = 2000; 
		rentalCharges[2] = 4000;
		statuses[0] = false;
		statuses[1] = true;
		statuses[2] = false;
		return itemCount;

	}//end of init method
}

public class HDB_Rentals {

	public static void main(String[] args) {
		int option, onLoan = 2;
		double averageRental = 0;
		int itemCount = HDB.init(HDB.categories, HDB.titles, HDB.serialNos, HDB.rentalCharges, HDB.statuses);
		Scanner input = new Scanner(System.in);

		do {
			//call displayMenu method
			displayMenu();
			option = input.nextInt();

			//select menu option
			switch(option) {
			case 1: listItems(HDB.categories, HDB.titles, HDB.serialNos, HDB.rentalCharges, HDB.statuses, itemCount);   //call listItems method
					break;

			case 2: displayAvailableItems(HDB.categories, HDB.titles, HDB.serialNos, HDB.rentalCharges, HDB.statuses, itemCount, onLoan);  //call  method
					break;

			case 3: displayAverageRentalChargeOnLoan(HDB.rentalCharges, HDB.statuses, itemCount, averageRental, onLoan);  //call displayAverageRentalChargeOnLoan method 
					break;

			case 4: itemCount = addNewItem(HDB.categories, HDB.titles, HDB.serialNos, HDB.rentalCharges, HDB.statuses, itemCount, HDB.categoryTypes, HDB.MAX_ITEMS); //call addNewItem method
					break; 

			case 5: onLoan = updateStatus(HDB.categories, HDB.titles, HDB.serialNos, HDB.rentalCharges, HDB.statuses, itemCount, HDB.categoryTypes, onLoan); //call updateStatus method
					break;

			case 6: changeCategoryName(HDB.categories, HDB.titles, HDB.serialNos, HDB.rentalCharges, HDB.statuses, itemCount, HDB.categoryTypes); //call changeCategoryName method
					break;

			case 7: itemCount = listItemsAsGroupedByCategories(HDB.categories, HDB.titles, HDB.serialNos, HDB.rentalCharges, HDB.statuses, itemCount, HDB.categoryTypes);  //call listItemsAsGroupedByCategories method
					break;

			case 8: itemCount = removeItem(HDB.categories, HDB.titles, HDB.serialNos, HDB.rentalCharges, HDB.statuses, itemCount); //call removeItem method
					break;

			case 0: System.out.println("\tExit system...");
					break;

			default: System.out.println("\tPlease input a valid option.");
					break;

			}//end of switch

		}while(option != 0);

	}//end of main

	//This method display the main menu
	public static void displayMenu() {
		System.out.println();
		System.out.println("MENU");
		System.out.println("=====");
		System.out.println("[1] List items");
		System.out.println("[2] Display available items");
		System.out.println("[3] Enquire average rental of items on loan");
		System.out.println("[4] Add new item");
		System.out.println("[5] Update status of an item");
		System.out.println("[6] Changing the name of an item's category");
		System.out.println("[7] List the items as grouped by categories");
		System.out.println("[8] Remove an item");
		System.out.println("[0] Exit"); 
		System.out.print("Enter your option: ");

	}//end of displayMenu method

	//This method allows user to view all the items in the system
	public static void listItems(String[] categories, String[] titles, int[] serialNos, double[] rentalCharges,  boolean[] statuses, int itemCount) {
		String status = " ";

		if(itemCount > 0) {
			System.out.println("List items");
			System.out.println("==========");
			System.out.printf("%-5s %-23s %-19s %11s %14s %-7s\n", "Item", "Category", "Titles", "Serial No.", "Rental Charge", "Status");

			for (int i = 0; i < itemCount; i++) {
				if(statuses[i] == true) {
					status = "Available";
				} else {
					if(statuses[i] == false) {
						status = "On Loan";
					}
				}//end of else-if statement
				System.out.printf("%-5d %-23s %-19s %11d %14.2f %-7s\n", (i+1) , categories[i] , titles[i] , serialNos[i] , rentalCharges[i] , status);

			}//end of for loop
		} else {
			System.out.println();
			System.out.println("There are currently no items to be displayed. Please add a new item.");
		}//end of if-else statement

	}//end of listItems method

	//This method displays available items for rental in the system
	public static void displayAvailableItems(String[] categories, String[] titles, int[] serialNos, double[] rentalCharges,  boolean[] statuses, int itemCount, int onLoan) { 
		int j = 1;
		String status = " ";

		if(itemCount > 0) {
			System.out.println();
			System.out.printf("%-5s %-23s %-19s %11s %14s %-7s\n", "Item", "Category", "Title", "Serial No.", "Rental Charge", "Status");  
			for(int i = 0; i < itemCount; i++) {
				if(statuses[i] == true) {
					status = "Available";
					System.out.printf("%-5d %-23s %-19s %11d %14.2f %7s\n", j , categories[i] , titles[i] , serialNos[i] , rentalCharges[i] , status);
					j++;
				}
			}//end of for loop

			if (onLoan == itemCount) {
				System.out.println();
				System.out.println("There are currently no available items. Please update the status of an item.");
			}//end of if statement
		} else {
			System.out.println();
			System.out.println("There are currently no items to be displayed. Please add a new item.");
		}//end of if-else statement

	}//end of displayAvailableItems method

	//This method find out the average rental charge for items on loan in the system
	public static double calculateAverageRentalChargeOnLoan(double[] rentalCharges, boolean[] statuses, int itemCount) {
		int count = 0;
		double sum = 0.0;

		for(int i = 0; i < itemCount; i++) {
			if(statuses[i] == false) {
				sum += rentalCharges[i];
				count++;
			}//end of if statement

		}//end of for loop
		double averageRental = (double) sum / count;
		if (count == 0) {
			return 0;
		} else {  
			return averageRental;
		}//end of if-else statement

	}//end of calculateAverageRentalChargeOnLoan method

	//This method display average rental charge for rooms on loan in the system
	public static void displayAverageRentalChargeOnLoan(double[] rentalCharges, boolean[] statuses, int itemCount, double averageRental, int onLoan) {
		averageRental = calculateAverageRentalChargeOnLoan(rentalCharges, statuses, itemCount);  //call calculateAverageRentalCharge method
		if(onLoan == 0 || itemCount == 0 || averageRental == 0) {
			System.out.println();
			System.out.println("There are currently no items on loan or to be displayed. Please update the status of an item or add a new item.");
		} else {
			if(onLoan > 0 && itemCount > 0) {
				System.out.println();
				System.out.println("Average rental of rooms on loan");
				System.out.println("===============================");
				System.out.printf("The average rental for all rooms on loan is $%.2f" , averageRental);
				System.out.println();
			}
		}//end of else-if statement 

	}//end of displayAverageRentalChargeOnLoan method

	//This method add new item to the application with a status of "Available"
	public static int addNewItem(String[] categories, String[] titles, int[] serialNos, double[] rentalCharges,  boolean[] statuses, int itemCount, String[] categoryTypes, int MAX_ITEMS) {
		int count = 0;
		if(itemCount <= MAX_ITEMS - 1) {
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.println("Add new item");
			System.out.println("============");
			System.out.print("Category (1-Room 2-Rooms 3-Rooms): ");
			count = input.nextInt();

			while(count > 3 || count < 1) {
				System.out.println("\tInvalid category.");
				System.out.println();
				System.out.print("Please input a valid category: ");
				count = input.nextInt();
				System.out.println();
			}//end of while loop
			count--;

			statuses[itemCount] = true;
			categories[itemCount] = categoryTypes[count];
			System.out.print("Title: ");
			input.nextLine();
			titles[itemCount] = input.nextLine();
			System.out.print("Serial No.: ");
			serialNos[itemCount] = input.nextInt();

			boolean duplicate = true;
			while(duplicate == true) {
				for(int i = 0; i < itemCount; i++) {
					if(serialNos[itemCount] == serialNos[i]) {
						duplicate = true;
						System.out.println("\tInvalid serial number.");
						System.out.println();
						System.out.print("Please input a valid Serial No.: ");
						serialNos[itemCount] = input.nextInt();
						System.out.println();
						break;
					} else {
						duplicate = false;
					}//end of if-else statement

				}//end of for loop

			}//end of while loop
			System.out.print("Rental Charge : $");
			rentalCharges[itemCount] = input.nextDouble();

			while(rentalCharges[itemCount] < 1) {
				System.out.println("\tInvalid rental charge.");
				System.out.println();
				System.out.print("Please input a valid Rental Charge : $");
				rentalCharges[itemCount] = input.nextDouble();
			}//end of while loop
			System.out.println("One new item added.");
			System.out.println();
			itemCount += 1;
			listItems(categories, titles, serialNos, rentalCharges, statuses, itemCount);   //call listItems method
		} else {
			System.out.println();
			System.out.println("Maximum items reached. Please remove an item to add new item.");
			System.out.println();
		}
		return itemCount;

	}//end of addNewItem method

	//This method change the status of a selected item from the displayed list
	public static int updateStatus(String[] categories, String[] titles, int[] serialNos, double[] rentalCharges,  boolean[] statuses, int itemCount, String[] categoryTypes, int onLoan) {
		int itemNo = 0;
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Update Status");
		System.out.println("=============");

		if(itemCount > 0) {
			listItems(categories, titles, serialNos, rentalCharges, statuses, itemCount);   //call listItems method
			System.out.println();
			System.out.print("Enter item no.: ");
			itemNo = input.nextInt();

			while(itemNo > itemCount || itemNo < 1) {
				System.out.println("\tInvalid item number.");
				System.out.println();
				System.out.print("Please input a valid item number: ");
				itemNo = input.nextInt();
				System.out.println();
			}//end of while loop
			itemNo -= 1;

			if(statuses[itemNo] == false) {
				statuses[itemNo] = true;
				onLoan--;
			} else {
				if(statuses[itemNo] == true) {
					statuses[itemNo] = false;
					onLoan++;
				}
			}//end of else-if statement
			listItems(categories, titles, serialNos, rentalCharges, statuses, itemCount);   //call listItems method
		} else {
			System.out.println();
			System.out.println("There are currently no items to be updated. Please add a new item.");
		}
		return onLoan;

	}//end of updateStatus method

	//This method change the name of the category of an item in the system
	public static void changeCategoryName(String[] categories, String[] titles, int[] serialNos, double[] rentalCharges,  boolean[] statuses, int itemCount, String[] categoryTypes) {
		int count = 0, serialNo = 0;
		Scanner input = new Scanner(System.in);
		if(itemCount > 0) {
			listItems(categories, titles, serialNos, rentalCharges, statuses, itemCount);   //call listItems method
			System.out.print("Please enter serial number to change its category: ");
			serialNo = input.nextInt();

			for(int i = 0; i < itemCount; i++) {
				if(serialNo == serialNos[i]) {
					System.out.print("Category (1-Room 2-Rooms 3-Rooms): ");
					count = input.nextInt();

					while(count > 3 || count < 1) {
						System.out.println("\tInvalid category.");
						System.out.println();
						System.out.print("Please input a valid category: ");
						count = input.nextInt();
						System.out.println();
					}//end of while loop
					count--;
					categories[i] = categoryTypes[count];
				}//end of if statement

			}//end of for loop
			listItems(categories, titles, serialNos, rentalCharges, statuses, itemCount);   //call listItems method
		} else {
			System.out.println();
			System.out.println("There are currently no items to be displayed. Please add a new item.");
		}//end of if-else statement

	}//end of changeCategoryName method

	//This method grouped all items by category
	public static int listItemsAsGroupedByCategories(String[] categories, String[] titles, int[] serialNos, double[] rentalCharges,  boolean[] statuses, int itemCount, String[] categoryTypes) {
		int l = 1;
		String status = " ";
		if(itemCount > 0) {
			System.out.println("List items by categories");
			System.out.println("========================");
			System.out.printf("%-5s %-23s %-19s %11s %14s %-7s\n", "Item", "Category", "Title", "Serial No.", "Rental Charge", "Status");
			for(int i = 0; i < itemCount; i++) {
				if(categories[i] == categoryTypes[0]) {
					if(statuses[i] == true) {
						status = "Available";
					} else  {
						if(statuses[i] == false) {
							status = "On Loan";
						}
					}//end of else-if statement
					System.out.printf("%-5d %-23s %-19s %11d %14.2f %-7s\n", l , categories[i] , titles[i] , serialNos[i] , rentalCharges[i] , status);
					l++;
				}//end of if statement

			}//end of for loop

			for(int j = 0; j < itemCount; j++) {
				if(categories[j] == categoryTypes[1]) {
					if(statuses[j] == true) {
						status = "Available";
					} else {
						if(statuses[j] == false) {
							status = "On Loan";
						}
					}//end of else-if statement
					System.out.printf("%-5d %-23s %-19s %11d %14.2f %-7s\n", l , categories[j] , titles[j] , serialNos[j] , rentalCharges[j] , status);
					l++; 
				}//end of if statement

			}//end of for loop

			for(int k = 0; k < itemCount; k++) {
				if(categories[k] == categoryTypes[2]) {
					if(statuses[k] == true) {
						status = "Available";
					}else {
						if(statuses[k] == false) {
							status = "On Loan";
						}
					}//end of else-if statement
					System.out.printf("%-5d %-23s %-19s %11d %14.2f %-7s\n", l , categories[k] , titles[k] , serialNos[k] , rentalCharges[k] , status);
					l++; 
				}//end of if statement

			}//end of for loop
		} else {
			System.out.println();
			System.out.println("There are currently no items to be displayed. Please add a new item.");
		}
		return itemCount;

	}//end of listItemsAsGroupedByCategories method

	//This method delete an item with the selected item number
	public static int removeItem(String[] categories, String[] titles, int[] serialNos, double[] rentalCharges,  boolean[] statuses, int itemCount) {
		int itemNo = 0;
		Scanner input = new Scanner(System.in);
		if(itemCount > 0) {
			listItems(categories, titles, serialNos, rentalCharges, statuses, itemCount);   //call listItems method
			System.out.println();
			System.out.print("Please enter the item number to remove: ");
			itemNo = input.nextInt();

			while(itemNo > itemCount || itemNo < 1) {
				System.out.println("\tInvalid item number.");
				System.out.println();
				System.out.print("Please input a valid item number: ");
				itemNo = input.nextInt();
				System.out.println();
			}//end of while loop
			itemNo -= 1;

			for(int i = 0; i < itemCount; i++) {
				if(i > itemNo) {
					categories[i - 1] = categories[i];
					titles[i - 1] = titles[i];
					serialNos[i - 1] = serialNos[i];
					rentalCharges[i - 1] = rentalCharges[i];
					statuses[i - 1] = statuses[i];
				}//end of if statement

			}//end of for loop
			itemCount--;
			listItems(categories, titles, serialNos, rentalCharges, statuses, itemCount);   //call listItems method
		} else {
			System.out.println();
			System.out.println("There are currently no items to be displayed. Please add a new item.");
		}
		return itemCount;

	}//end of removeItem method 

}//end of class
