

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.Insurance;

public class SatelliteLifeCycle {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("./helloBean.xml");
		
		Satellite sat = (Satellite) context.getBean("satellite");
		System.out.println("Satellite name is: "+ sat.getName());
		System.out.println("Satellite fuel type is: "+ sat.getFueltype());

		
		
		
		context.registerShutdownHook();
	}

}
