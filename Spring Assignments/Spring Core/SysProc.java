

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SysProc {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./employee.xml");
		
		Systems syst = (Systems) context.getBean("system");
		syst.displayInfo();
	}

}
