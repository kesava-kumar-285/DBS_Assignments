

public class Systems {
	
	public int model_no;
	public String brand;
	public int cost;
	public Processor processor;
	public int getModel_no() {
		return model_no;
	}
	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	
	public void displayInfo() {
		System.out.println("Model no:"+model_no);
		System.out.println("Brand : "+brand);
		System.out.println("Cost : "+cost);
		System.out.println("Processor speed : " +processor.getSpeed());
		System.out.println("Processor type : " +processor.getType());

		
	}

}
