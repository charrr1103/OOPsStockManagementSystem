
public class TV extends Product{
	private String screenType;
	private String resolution;
	private double displaySize;
	
	//parametized constructor
	public TV (int productID, String name, int stock, double price, 
			String screenType, String resolution, double displaySize){
		super(productID, name, stock, price);
		this.screenType = screenType;
		this.resolution = resolution;
		this.displaySize = displaySize;
	}
	
	//accessors
	public String getScreenType() {
		return screenType;
	}
	
	public String getResolution() {
		return resolution;
	}
	
	public double getDisplaySize() {
		return displaySize;
	}
	
	//mutators
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	
	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}
	
	public double calculateTVstockValue(int stock) {
		return getPrice()*stock;
	}
	
	@Override
	public String toString() {
		
		return (String.format("%-22s", "\n\nItem number") + ": " + getProductID()
				+ String.format("%-21s", "\nProduct name") + ": " + getProductName()
				+ String.format("%-21s", "\nScreen type") + ": " + getScreenType()
				+ String.format("%-21s", "\nResolution") + ": " + getResolution()
				+ String.format("%-21s", "\nDisplay size") + ": " + getDisplaySize()
				+ String.format("%-21s", "\nQuantity available") + ": " + getStock()
				+ String.format("%-21s", "\nPrice (RM)") + ": " + String.format("%.2f", getPrice())
				+ String.format("%-21s", "\nInventory value (RM)") + ": " + String.format("%.2f",getInventoryValue())
				+ String.format("%-21s", "\nProduct status") + ": " + (isStatus()? "Active":"Discontinued"));
	
	}
}
