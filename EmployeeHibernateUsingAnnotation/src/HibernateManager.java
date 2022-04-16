import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class HibernateManager {
	public static SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(Employee.class).buildSessionFactory();
	public static Session session = factory.getCurrentSession();
	
	public static void main(String[] args) {
		System.out.println("Connection established to EMPLOYEE database");
		
//		HibernateManager.insert();
		HibernateManager.selectAllData();
//		HibernateManager.selectById(1);
//		HibernateManager.updateById(2);
//		HibernateManager.deleteById(2);
//		HibernateManager.deleteMulti();
	}
	
	public static void insert(){ //inserts a row into the table
//		Employee emp = new Employee("Rudresh","Aradhya", "rudresh@gmail.com");
//		Employee emp = new Employee("Akhil","Banagiri", "akhil@gmail.com");
		Employee emp = new Employee("Yashas","Aradhya", "yashas@gmail.com");
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		System.out.println("Employee inserted successfully");
	}
	
	public static void selectAllData() {
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee").list();
		System.out.println("Here is the list of all the employees");
		for(Employee emp: empList) {
			System.out.println(emp);
		}
		System.out.println("Employee details using Iterator");
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		session.getTransaction().commit();
	}
	
	public static void selectById(int eid) { //select based on employee id
		session.beginTransaction();
		Employee e = (Employee)session.get(Employee.class, eid);
		session.getTransaction().commit();
		System.out.println(e);
	}
	public static void deleteById(int eid) { //delete based on employee id
		session.beginTransaction();
		Employee emp = (Employee)session.get(Employee.class, eid);
		session.delete(emp);
		session.getTransaction().commit();
		System.out.println("Employee data deleted...");
	}
	
	public static void updateById(int eid) {
		session.beginTransaction();
		Employee emp = (Employee)session.get(Employee.class, eid);
		emp.setElastname("Ban");
		session.update(emp);
		session.getTransaction().commit();
		System.out.println("Employee data updated..." + emp);
	}
	
	public static void deleteMulti() { //delete based on employee id
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee").list();
		System.out.println("Employee details using Iterator");
		Iterator<Employee> itr = empList.iterator();
		while(itr.hasNext()) {
			session.delete(itr.next());
		}
		session.getTransaction().commit();
		System.out.println("Employee data deleted...");
	}

}
