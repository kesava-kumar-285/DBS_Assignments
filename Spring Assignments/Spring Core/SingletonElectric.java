

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonElectric {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./helloBean.xml");
		
		Electric el = (Electric) context.getBean("elec");
		el.setMeter_no(101);
		el.setInitial_reading(0);
		el.setCurrent_reading(150);
		el.setColor("red");
		
		System.out.println("Meter no:"+el.getMeter_no());
		System.out.println("Initial Reading:"+el.getInitial_reading());
		System.out.println("Current Reading:"+el.getCurrent_reading());
		System.out.println("Color:"+el.getColor());
		
		Electric el1 = (Electric) context.getBean("elec");
		
		
		System.out.println("Meter no:"+el1.getMeter_no());
		System.out.println("Initial Reading:"+el1.getInitial_reading());
		System.out.println("Current Reading:"+el1.getCurrent_reading());
		System.out.println("Color:"+el1.getColor());
		
	}

}
