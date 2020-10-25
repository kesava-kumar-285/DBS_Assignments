package first;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

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
			client.InsertRecordInDatabase("Aman", 5, 200000);
			client.InsertRecordInDatabase("Rakesh", 2, 75000);
			client.InsertRecordInDatabase("Raman", 3, 150000);
			
			client.DisplayRecords();
			
//			client.UpdateRecord(1, 300000);
//			client.DeleteRecord(1);
			
//			client.DisplayRecords();
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	
	
	public void InsertRecordInDatabase(String name,int tenure,int amount) throws HibernateException {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Insurance i1=new Insurance(name,tenure,amount);
		session.save(i1);
		tx.commit();
		
		session.close();
	}
	
	
	public void DisplayRecords() throws HibernateException{
	Session session=factory.openSession();
	List emplist=session.createQuery("FROM Insurance").list();
	for(Iterator iterator=emplist.iterator();iterator.hasNext();) {
		Insurance ins=(Insurance) iterator.next();
		System.out.println("Insurance No: "+ins.getId()+", Name: "+ins.getName()+", Tenure: "+ins.getTenure()+", Amount: "+ins.getAmount());
	}
	session.close();
}
	
	public void UpdateRecord(Integer id,int amount) throws HibernateException {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Insurance ins=(Insurance)session.get(Insurance.class,id);
		ins.setAmount(amount);
		session.update(ins);
		tx.commit();
		session.close();
	}
	
	public void DeleteRecord(int id) throws HibernateException{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Insurance ins=(Insurance)session.get(Insurance.class, id);
		session.delete(ins);
		tx.commit();
		session.close();
	}

}
