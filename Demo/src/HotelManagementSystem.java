import java.util.*;

class Bill{
	String itemName;
	int qty;
	int price;
	int subTotal;
	
	Bill(String itemName, int qty, int price, int subTotal){
		this.itemName=itemName;
		this.qty=qty;
		this.price=price;
		this.subTotal=subTotal;
	}
	
	public String toString() {
		return itemName + "\t\t" + qty + "\t\t" + price + "\t\t" + subTotal;
	}
}
public class HotelManagementSystem {

	public static void main(String[] args) {
		int itemNo = 0;
		int qty = 0;
		String itemName = "";
		int price = 0;
		int subTotal = 0;
		int grandTotal = 0;
		ArrayList<Bill> billList = new ArrayList<Bill>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Hotel New World");
		System.out.println("Enter your name: ");
		String custName = sc.next();
		System.out.println("Welcome " + custName + "!");
		String cont = "";
		do {
			System.out.println("========================== Menu =================================");
			System.out.println("_________________________________________________________________");
			System.out.println("Item No" + "\t\t\t" + "Item Name" + "\t\t\t" + "Price");
			System.out.println("=================================================================");
			System.out.println("1." + "\t\t\t" + "Water" + "\t\t\t\t" + "5");
			System.out.println("2." + "\t\t\t" + "Coke" + "\t\t\t\t" + "10");
			System.out.println("3." + "\t\t\t" + "Pizza" + "\t\t\t\t" + "25");
			System.out.println("4." + "\t\t\t" + "Burger" + "\t\t\t\t" + "20");
			System.out.println("5." + "\t\t\t" + "Fries" + "\t\t\t\t" + "15");

			System.out.println("Enter the item no.: ");
			itemNo = sc.nextInt();
			System.out.println("Enter the quantity: ");
			qty = sc.nextInt();
			
			switch(itemNo) {
			case 1:
				itemName = "Water";
				price = 5;
				subTotal = price * qty;
				break;
			case 2:
				itemName = "Coke";
				price = 10;
				subTotal = price * qty;
				break;
			case 3: 
				itemName = "Pizza";
				price = 25;
				subTotal = price * qty;
				break;
			case 4: 
				itemName = "Burger";
				price = 20;
				subTotal = price * qty;
				break;
			case 5:
				itemName = "Fries";
				price = 15;
				subTotal = price * qty;
				break;
			default:
				System.out.println("Invalid selection");
				break;
			}
			billList.add(new Bill(itemName, qty, price, subTotal));
			System.out.println(itemNo+"." + "\t\t\t" + itemName + "\t\t\t\t" + subTotal);
			grandTotal+=subTotal;
			System.out.println("Do you want to add more items? [Y/N]: ");
			cont = sc.next();
		}while(cont.equalsIgnoreCase("Y")||cont.equalsIgnoreCase("Yes"));
		
		if(cont.equalsIgnoreCase("n")||cont.equalsIgnoreCase("no")){
			System.out.println("Customer: " + custName);
			System.out.println("=================================================================");
			System.out.println("Item Name" + "\t" + "Quantity" + "\t" + "Price" + "\t\t" + "SubTotal");
			System.out.println("=================================================================");
			for(Bill b: billList) {
				System.out.println(b);
			}
			System.out.println("=================================================================");
			System.out.println("Total:\t\t\t\t\t\t" + grandTotal);
		}
	}

}
