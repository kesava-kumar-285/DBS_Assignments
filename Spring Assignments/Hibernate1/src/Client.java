import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
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
			Client client_1=new Client();
//			client_1.InsertRecordInDatabase(1, "Rohit", "Sagar", 50000);
//			client_1.InsertRecordInDatabase(2, "Surya", "Sagar", 50000);
//			client_1.InsertRecordInDatabase(3, "Charan", "Sagar", 50000);
//			client_1.InsertRecordInDatabase(4, "Hardik", "Sagar", 50000);
//			client_1.InsertRecordInDatabase(5, "Bharath", "Sagar", 50000);
			
//			client_1.DisplayRecords();
			
//			System.out.println("Updating details:  ......");
//			client_1.UpdateRecord(2, 100000);
//			
//			System.out.println("Details after update......");
//			client_1.DisplayRecords();
			
//			System.out.println("Deleting employee....");
//			client_1.DeleteRecord(6);
			
//			System.out.println("Details after deleting...");
//			client_1.DisplayRecords();
			
			
			//OneToOne Mapping Code
			
			Address add1=new Address("Flemingo Road", "Washington DC", "USA", "532");
			Employee emp1=new Employee(7,"Charan","Kumar",40000);
			emp1.setAddress(add1);
			client_1.insertData(emp1, add1);
			
			Address add2=new Address("RR Nagar","Bangalore","India","560098");
			Employee emp2=new Employee(8,"Rajesh","Charan",50000);
			emp2.setAddress(add2);
			client_1.insertData(emp2, add2);
			
			client_1.displayRecords();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception is : "+e);
		}
	}
	
	//OneToOne Mapping Functions
	public void insertData(Employee empObj,Address addObj) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	
		session.save(addObj);
		session.save(empObj);
		tx.commit();
		
		System.out.println("Employee and Address are inserted in the database....");
		session.close();
	}
	
	public void displayRecords() {
		Session session=factory.openSession();
		
		List employees=session.createQuery("FROM Employee").list();
		for(Iterator iterator=employees.iterator();iterator.hasNext();) {
			Employee employee=(Employee)iterator.next();
			System.out.println("Employee ID: "+employee.getId()+", First Name: "+employee.getFirstName()+", Last Name: "+employee.getLastName()+", Salary: "+employee.getSalary());
			Address add=employee.getAddress();
			System.out.println("Street: "+add.getStreet()+", City: "+add.getCity()+", State: "+add.getState()+", Zipcode: "+add.getZipcode());
		}
		session.close();
	}
	
	
	public void InsertRecordInDatabase(int id,String fname,String lname,int salary) throws HibernateException {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee e1=new Employee(id,fname,lname,salary);
		session.save(e1);
		tx.commit();
		
		session.close();
	}
	
//	public void DisplayRecords() throws HibernateException{
//		Session session=factory.openSession();
//		List emplist=session.createQuery("FROM Employee").list();
//		for(Iterator iterator=emplist.iterator();iterator.hasNext();) {
//			Employee emp=(Employee) iterator.next();
//			System.out.println("Employee ID: "+emp.getId()+" First Name: "+emp.getFirstName()+" Last Name: "+emp.getLastName()+" Salary: "+emp.getSalary());
//		}
//		session.close();
//	}
	
	public void DisplayRecords() {
		Session session=factory.openSession();
		Criteria cr=session.createCriteria(Employee.class);
		
		cr.add(Restrictions.gt("salary", 55000));
		List employees=cr.list();
		
		for(Iterator iterator=employees.iterator();iterator.hasNext();) {
			Employee employee=(Employee) iterator.next();
			System.out.println("Employee ID: "+employee.getId()+", First Name: "+employee.getFirstName()+", Last Name: "+employee.getLastName()+", Salary: "+employee.getSalary());
		}
		session.close();
	}
	
	public void UpdateRecord(Integer EmpId,int salary) throws HibernateException {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee employee=(Employee)session.get(Employee.class,EmpId);
		employee.setSalary(salary);
		session.update(employee);
		tx.commit();
		session.close();
	}
	
	public void DeleteRecord(int EmployeeID) throws HibernateException{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Employee employee=(Employee)session.get(Employee.class, EmployeeID);
		session.delete(employee);
		tx.commit();
		session.close();
	}
}
