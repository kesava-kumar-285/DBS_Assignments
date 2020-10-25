import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {
	public static void main(String args[]) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("./helloBean.xml");
		
		Employee emp = (Employee) context.getBean("hello");
		System.out.println("Employee Details are:");
		System.out.println("Employee id is: "+emp.getEmpId());
		System.out.println("Employee name is: "+emp.getName());
		System.out.println("Employee designation is: "+emp.getDesignation());
		System.out.println("Employee department  is: "+emp.getDept());*/
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"Zerocabbages","Developer","IBGT",70000));
		list.add(new Employee(2,"Gautam","ML Engineer","AI",50000));
		list.add(new Employee(2,"Tarun","Architect","Cloud",100000));
		
		
		for(Employee emp:list) {
			if(emp.getSalary()>50000) {
				System.out.println("Employee id:"+emp.getEmpId());
				System.out.println("Employee name:"+emp.getName());
				System.out.println("Employee designation:"+emp.getDesignation());
				System.out.println("Employee department:"+emp.getDept());
				System.out.println("Employee salary:"+emp.getSalary());
				System.out.println("\n");
			}
			
		}
		
		
		
		
		
	}
}