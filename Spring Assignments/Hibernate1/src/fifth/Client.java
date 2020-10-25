package fifth;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Client {
	private static SessionFactory factory;
	
	public static void getSessionFactory() {
		try {
			Configuration conf=new Configuration().configure();
			StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
			factory=conf.buildSessionFactory(builder.build());
		} catch (Throwable e) {
			// TODO: handle exception
			System.err.println("Failed to create sessionFactory object: "+e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static void main(String args[]) {
		try {
			getSessionFactory();
			Client client=new Client();
			
			client.InsertRecordInDatabase("Aman", 23, "B1");
			client.InsertRecordInDatabase("Atul", 24, "A1");
			client.InsertRecordInDatabase("Ajay", 30, "B1");
			client.InsertRecordInDatabase("Amit", 45, "B2");
			client.InsertRecordInDatabase("Arun", 50, "C1");
			
			client.DisplayRecords();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Excepion is: "+e);
		}
	}
	
	
	public void InsertRecordInDatabase(String name,int age,String seat) throws HibernateException {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Train t1=new Train(name,age,seat);
		session.save(t1);
		tx.commit();
		
		session.close();
	}
	
	public void DisplayRecords() {
		Session session=factory.openSession();
		Criteria cr=session.createCriteria(Train.class);
		
		cr.add(Restrictions.ge("age", 25));
		cr.add(Restrictions.le("age", 45));
		List trains=cr.list();
		
		for(Iterator iterator=trains.iterator();iterator.hasNext();) {
			Train train=(Train) iterator.next();
			System.out.println("Ticket ID: "+train.getId()+", Name: "+train.getName()+", Age: "+train.getAge()+", Seat: "+train.getSeat());
		}
		session.close();
	}

}
