

public class Satellite {
	
	public String name;
	public String fueltype;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	

	public void init()
	{
		System.out.println("Bean is going through init");
	}
	
	public void destroy() {
		System.out.println("Bean will destroy now");
	}

}
