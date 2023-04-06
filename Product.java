public class Product {

	private int UPC;
	private String store;
	private double price;
	private String name;
	private String description;

	public Product() {
		UPC = -1;
		store = "";
		price = -1d;
		name = "";
		description = "";
	}

	/**
	 * 
	 * @param UPC
	 * @param store
	 * @param price
	 * @param name
	 * @param description
	 */
	public Product(int UPC, String store, double price, String name, String description) {
		this.UPC = UPC;
		this.store = store;
		this.price = price;
		this.name = name;
		this.description = description;
	}

	public int getUPC() {
		return this.UPC;
	}

	/**
	 * 
	 * @param UPC
	 */
	public void setUPC(int UPC) {
		this.UPC = UPC;
	}

	public String getStore() {
		return this.store;
	}

	/**
	 * 
	 * @param store
	 */
	public void setStore(String store) {
		this.store = store;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}