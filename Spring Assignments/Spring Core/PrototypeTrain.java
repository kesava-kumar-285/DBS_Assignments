

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeTrain {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./helloBean.xml");
		Train tr = (Train) context.getBean("train");
		Train tr1 = (Train) context.getBean("train");
		Train tr2 = (Train) context.getBean("train");
		Train tr3 = (Train) context.getBean("train");
		tr.setTrain_no(1);
		tr.setName("Ritesh");
		tr.setTrain_name("Rajdhani");
		tr.setArrival("Secunderabad");
		tr.setDestination("Delhi");
		tr.setStatus("Reserved");
		
		tr1.setTrain_no(2);
		tr1.setName("Gautam");
		tr1.setTrain_name("Rajdhani");
		tr1.setArrival("Secunderabad");
		tr1.setDestination("Delhi");
		tr1.setStatus("Sleeper");
		
		
		tr2.setTrain_no(3);
		tr2.setName("Tarun");
		tr2.setTrain_name("Rajdhani");
		tr2.setArrival("Mumbai");
		tr2.setDestination("Pune");
		tr2.setStatus("Reserved");
		
		
		tr3.setTrain_no(4);
		tr3.setName("Rajni");
		tr3.setTrain_name("Shatabdi");
		tr3.setArrival("Kachiguda");
		tr3.setDestination("Chennai");
		tr3.setStatus("Reserved");
		
		
		ArrayList<Train> li = new ArrayList<Train>();
		li.add(tr);
		li.add(tr1);
		li.add(tr2);
		li.add(tr3);
		
		
	
		
		for(Train t : li) {
			System.out.println("Train no:" +t.getTrain_no());
			System.out.println("Traveller name:" +t.getName());

			System.out.println("Train name:" +t.getTrain_name());

			System.out.println("Train arrival:" +t.getArrival());

			System.out.println("Train destination:" +t.getDestination());

			System.out.println("Seat status:" +t.getStatus());
			
			System.out.println();

		}
		
		
		
	}
}
