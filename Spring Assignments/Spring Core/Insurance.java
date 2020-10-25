import org.springframework.beans.factory.annotation.Required;
public class Insurance {
	public int id;
	public String insurance_holder;
	public String insurance_company;
	public int insurance_amount;
	public String insurance_type;
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getInsurance_holder() {
		return insurance_holder;
	}
	
	@Required
	public void setInsurance_holder(String insurance_holder) {
		this.insurance_holder = insurance_holder;
	}
	public String getInsurance_company() {
		return insurance_company;
	}
	
	@Required
	public void setInsurance_company(String insurance_company) {
		this.insurance_company = insurance_company;
	}
	public int getInsurance_amount() {
		return insurance_amount;
	}
	
	@Required
	public void setInsurance_amount(int insurance_amount) {
		this.insurance_amount = insurance_amount;
	}
	public String getInsurance_type() {
		return insurance_type;
	}
	
	
	@Required
	public void setInsurance_type(String insurance_type) {
		this.insurance_type = insurance_type;
	}
	
	
	public void init()
	{
		System.out.println("Bean is going through init");
	}
	
	public void destroy() {
		System.out.println("Bean will destroy now");
	}
}