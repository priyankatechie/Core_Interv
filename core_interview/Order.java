package OOPs;

/*
 * 2. Food Delivery Order
Question:
Create an Order class with properties: orderId, restaurantName, foodItem, quantity, and pricePerItem.
Write methods to:

Calculate total bill (quantity * pricePerItem).

Display order details.

Change the quantity and show the new bill.
 */
public class Order {

	int orderId;
	String restaurantName;
	String foodItem;
	int quantity;
	int priceperItem;
	
	
	public Order(int orderId,String restaurantName,String foodItem,int quantity,int priceperItem) {
		this.orderId=orderId;
		this.restaurantName=restaurantName;
		this.foodItem=foodItem;
		this.quantity=quantity;
		this.priceperItem=priceperItem;
	}
	
	double CalculateBill(){
		return quantity*priceperItem;
	}
	
	
	public void displayOrder() {
		System.out.println("Order Id : " +orderId+  " Restaurant Name : "+restaurantName+ " Food Item : "+foodItem+  " Quantity : "+quantity+  " Total : "+CalculateBill());
	}
	
	public void changeQuantity(int newQty) {
		this.quantity=newQty;
		System.out.println("Quantity updated to :"+newQty);
		
	}

	public static void main(String args[]) {
		
		Order o1= new Order(001,"Pizza Tokn","Maigreeta Pizza",1,180);

	o1.displayOrder();
	
	o1.changeQuantity(3);
	o1.displayOrder();
	
	}
}
