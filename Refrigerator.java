public class Refrigerator extends Product {
	private String doorDesign;
	private String color;
	private int capacity;
	
	//parameterized constructor
	public Refrigerator(int ID, String name, int stock, double price,
						String doorDesign, String color, int capacity) {
		super(ID, name, stock, price);
		this.doorDesign = doorDesign;
		this.color = color;
		this.capacity = capacity;
	}
	
	//getter and setter
	public String getDoorDesign() {
		return doorDesign;
	}

	public void setDoorDesign(String doorDesign) {
		this.doorDesign = doorDesign;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public double calRefrigStock(int stock) {
		return getPrice()*stock ;
	}
	
	@Override
	public String toString() {
		
		return (String.format("%-22s", "\n\nItem number") + ": " + getProductID()
				+ String.format("%-21s", "\nProduct name") + ": " + getProductName()
				+ String.format("%-21s", "\nDoor design") + ": " + getDoorDesign()
				+ String.format("%-21s", "\nColor") + ": " + getColor()
				+ String.format("%-21s", "\nCapacity (in Litres)") + ": " + getCapacity()
				+ String.format("%-21s", "\nQuantity available") + ": " + getStock()
				+ String.format("%-21s", "\nPrice (RM)") + ": " + String.format("%.2f", getPrice())
				+ String.format("%-21s", "\nInventory value (RM)") + ": " + String.format("%.2f",getInventoryValue())
				+ String.format("%-21s", "\nProduct status") + ": " + (isStatus()? "Active":"Discontinued"));
	
	}
	
}
