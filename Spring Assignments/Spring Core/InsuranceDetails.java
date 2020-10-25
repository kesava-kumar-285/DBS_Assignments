import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class InsuranceDetails {
	public static void main(String args[]) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("./insBean.xml");
	
	Insurance ins = (Insurance) context.getBean("insurance");
	System.out.println("Insurance Id is: "+ ins.getId());
	System.out.println("Insurance holder name  is: "+ ins.getInsurance_holder());
	System.out.println("Insurance Company name is: "+ ins.getInsurance_company());
	System.out.println("Insurance Type is: "+ ins.getInsurance_type());
	System.out.println("Insurance Amount is: "+ ins.getInsurance_amount());
	
	
	context.registerShutdownHook();
	}
}