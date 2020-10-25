

public class BMW {
	
	public String name;
	public int cost;
	public String features;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	
	public void display_features() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(features);
		
	}

}
