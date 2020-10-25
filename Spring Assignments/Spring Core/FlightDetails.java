import java.util.Random;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class FlightDetails {
 public static void main(String args[]) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("./helloBean.xml");
	 
	 Flight fgt =(Flight) context.getBean("flight");
	 Random rd = new Random();
	 int flight_id = rd.nextInt(100000);
	 fgt.setId(flight_id);
	 
	 Scanner sc = new Scanner(System.in); 
	 
	 System.out.println("Enter Traveller name:");
	 String flyer_name = sc.nextLine();
	 fgt.setName(flyer_name);
	 
	 System.out.println("Enter Flight name:");
	 String fname = sc.nextLine();
	 fgt.setFlight_name(fname);
	 
	 System.out.println("Enter Departure place:");
	 String src = sc.nextLine();
	 fgt.setSource(src);
	 
	 System.out.println("Enter Destination");
	 String dest = sc.nextLine();
	 fgt.setDestination(dest);
	 
	 System.out.println("Enter Ticket price");
	 int amt = sc.nextInt();
	 fgt.setPrice(amt);
	 
	 System.out.println("Flight ticket id is: "+fgt.getId());
	 System.out.println("Traveller name is: "+fgt.getName());
	 System.out.println("Flight Name is: "+fgt.getFlight_name());
	 System.out.println("Flight Departure at: "+fgt.getSource());
	 System.out.println("Flight Arrival  at: "+fgt.getDestination());
	 System.out.println("Flight ticket price is: "+fgt.getPrice());


	 
 }
}