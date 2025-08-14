package OOPs;
/*
 * Encapsulation
 * Online Shopping Order
Fields (private)
productName, quantity, price
Validation: quantity > 0, price > 0.

Methods:
calculateBill() — return total bill = quantity × price.
displayOrder() — print details.
 */
public class Online_Order {

	private String productName;
	private int quantity;
	private int price;
	
	
	
	public Online_Order(String productName,int quantity,int price) {
		
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
	}
	// getter setter
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity>0) {
		this.quantity = quantity;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price >0 ) {
			this.price = price;
		}
		
	}
	
	
	public void calculateBill() {
		
	}




	public static void main(String args[]) {
		
		
	}
}
