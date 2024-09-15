
public class WashingMachine extends Product{
	private String design;
	private String feature;
	private int capacity;
	
	//parameterized constructor
	public WashingMachine(int ID, String name, int stock, double price,
						String design, String feature, int capacity) {
		super(ID, name, stock, price);
		this.design = design;
		this.feature = feature;
		this.capacity = capacity;
	}
	
	//getter and setter
	public int getCapacity() {
		return capacity;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double calWashStock(int stock) {
		return getPrice()*stock ;
	}
	
	@Override
	public String toString() {
		
		return (String.format("%-22s", "\n\nItem number") + ": " + getProductID()
				+ String.format("%-21s", "\nProduct name") + ": " + getProductName()
				+ String.format("%-21s", "\nDesign") + ": " + getDesign()
				+ String.format("%-21s", "\nFeature") + ": " + getFeature()
				+ String.format("%-21s", "\nCapacity (in kgs)") + ": " + getCapacity()
				+ String.format("%-21s", "\nQuantity available") + ": " + getStock()
				+ String.format("%-21s", "\nPrice (RM)") + ": " + String.format("%.2f", getPrice())
				+ String.format("%-21s", "\nInventory value (RM)") + ": " + String.format("%.2f",getInventoryValue())
				+ String.format("%-21s", "\nProduct status") + ": " + (isStatus()? "Active":"Discontinued"));
	
	}
	
}
