
public abstract class Product {
	private String productName;
	private double price;
	private int stock;
	private int productID;
	private boolean status = true;
	
	public Product(int ID, String name, int stock, double price) {
		this.productID = ID;
		this.productName = name;
		this.stock = stock;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public double getInventoryValue() {
		return price*stock;
	}
	
	public boolean addStock(int value) {
		if (status != true)
			return false;
		else {
			stock += value;
			return true;
		}
	}
	
	public boolean deductStock(int value) {
			stock -= value;
			return true;
	}
	
	public String toString() {
		return (String.format("%-20s", "Item number") + ": " + productID
				+ String.format("%-21s", "\nProduct name") + ": " + productName
				+ String.format("%-21s", "\nQuantity available") + ": " + stock
				+ String.format("%-21s", "\nPrice (RM)") + ": " + String.format("%.2f", price)
				+ String.format("%-21s", "\nInventory value (RM)") + ": " + String.format("%.2f",getInventoryValue())
				+ String.format("%-21s", "\nProduct status") + ": " + (isStatus()? "Active":"Discontinued"));
	}
}
