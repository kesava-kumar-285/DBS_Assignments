

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCar {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./helloBean.xml");
		BMW cars = (BMW) context.getBean("bmwcar");
		cars.display_features();
		
		Mercedez mers = (Mercedez)context.getBean("mercar");
		mers.display_features();
		
	}

}
