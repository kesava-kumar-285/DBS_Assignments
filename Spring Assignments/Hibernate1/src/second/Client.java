package second;

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
			
//			StudentAddress add1=new StudentAddress("Flemingo Road", "Washington DC", "USA", "532");
//			Student std1=new Student("Charan","Kumar");
//			std1.setStudentAddress(add1);
//			client.insertData(std1, add1);
//			
//			StudentAddress add2=new StudentAddress("RR Nagar","Bangalore","India","560098");
//			Student std2=new Student("Rajesh","Charan");
//			std2.setStudentAddress(add2);
//			client.insertData(std2, add2);
			
//			client.updateRecord(1, "Rajesh", "India");
			
			client.deleteRecord(1);
			
			client.displayRecords();
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
	}
	
	
	//OneToOne Mapping Functions
		public void insertData(Student stdObj,StudentAddress addObj) {
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
		
			session.save(addObj);
			session.save(stdObj);
			tx.commit();
			
			System.out.println("Student and Student Address are inserted in the database....");
			session.close();
		}
		
		public void displayRecords() {
			Session session=factory.openSession();
			
			List students=session.createQuery("FROM Student").list();
			for(Iterator iterator=students.iterator();iterator.hasNext();) {
				Student student=(Student)iterator.next();
				System.out.println("Student ID: "+student.getId()+", First Name: "+student.getFirstName()+", Last Name: "+student.getLastName());
				StudentAddress add=student.getStudentAddress();
				System.out.println("Street: "+add.getStreet()+", City: "+add.getCity()+", State: "+add.getState()+", Zipcode: "+add.getZipcode());
			}
			session.close();
		}
		
		public void updateRecord(Integer id,String firstName,String state) throws HibernateException {
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			
			Student student=(Student)session.get(Student.class,id);
			student.setFirstName(firstName);
			student.getStudentAddress().setState(state);
			session.update(student);
			tx.commit();
			session.close();
		}
		
		public void deleteRecord(int studentId) throws HibernateException{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			Student student=(Student)session.get(Student.class, studentId);
			session.delete(student);
			tx.commit();
			session.close();
		}
		

}
