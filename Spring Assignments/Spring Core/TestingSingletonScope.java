import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestingSingletonScope {
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("./helloBean.xml");
		
		Scope sc = (Scope) context.getBean("scope");
		sc.setMessage("I'm learning Spring Core");
		sc.getMessage();
		System.out.println(sc.hashCode());
		
		Scope sc1 = (Scope) context.getBean("scope");
		sc1.getMessage();
		System.out.println(sc1.hashCode());
	}
}
