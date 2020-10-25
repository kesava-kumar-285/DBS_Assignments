import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.Iterator;

import java.util.List;

public class Client {
	private static SessionFactory factory;
	public static void getSessionFactory() {
		try {
			Configuration conf = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(conf.getProperties());
			factory = conf.buildSessionFactory(builder.build());

		}
		catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object"+ ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static void main(String[] args) {
		try {
			getSessionFactory();
			Client client_1 = new Client();
			System.out.println("Inserting record in db");
//			client_1.InsertRecordInDatabase(1, "Kesava", "Kumar", 8800);
//			client_1.InsertRecordInDatabase(2, "Rishika", "Reddy", 8000);
//			client_1.InsertRecordInDatabase(3, "Chandra", "Kiran", 4800);
//			client_1.InsertRecordInDatabase(4, "Suresh", "Krishna", 9000);
//			client_1.InsertRecordInDatabase(5, "Prashanth", "Nadella", 9800);
//			client_1.InsertRecordInDatabase(6, "Shiva", "Reddy", 8800);
//			client_1.InsertRecordInDatabase(7, "Vani", "Rasagna", 8900);
//			client_1.InsertRecordInDatabase(8, "Manoj", "Varma", 9800);

			System.out.println("Display record in db");
			client_1.DisplayRecords();
//			client_1.UpdateRecord(1,8888);
//			client_1.DisplayRecords();
//			client_1.DeleteRecord(1);
//			client_1.DisplayRecords();
		}
		catch (HibernateException e) {
			System.out.println("Exception is: "+e);
		}
	}

	public void InsertRecordInDatabase(int id, String fname, String lname, int salary) throws HibernateException {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee el = new Employee(id, fname, lname, salary);
		session.save(el);
		tx.commit();
		session.close();
	}

	public void DisplayRecords() throws HibernateException{
		Session session = factory.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		cr.add(Restrictions.gt("salary",800));
		List empLst = cr.list();
//		List empLst = session.createQuery("From Employee").list();
		for (Iterator iterator = empLst.iterator(); iterator.hasNext();) {
			Employee emp = (Employee) iterator.next();
			System.out.println("First Name: "+ emp.getFirstName());
			System.out.println("Last Name: "+emp.getLastName());
			System.out.println("Salary: "+ emp.getSalary());
		}
		session.close();
	}
	
	public void UpdateRecord(int Empid, int salary) throws HibernateException {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee employee =(Employee) session.get(Employee.class, Empid);
		employee.setSalary(salary);
		session.update(employee);
		tx.commit();
		session.close();
	}
	public void DeleteRecord(int empId) throws HibernateException {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee employee = (Employee) session.get(Employee.class, empId);
		session.delete(employee);
		tx.commit();
		session.close();
	}
	
	
}






