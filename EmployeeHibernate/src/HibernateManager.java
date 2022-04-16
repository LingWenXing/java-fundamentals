import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager  {
	Session session;
	public void connect() {
	//Connection code
		// these 5 lines would remain same and is used for getting connection
       Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
       ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
       SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   
          		 
        session =sessionFactory.openSession();	
        System.out.println("Connected to Employee....");
	}
	
	public void insert(Employee e){ //inserts a row into the table
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		System.out.println("Insertion success...");
	}
	
	public void selectData(int eid) { //select based on employee id
		session.beginTransaction();
		Employee e = (Employee)session.get(Employee.class, eid);
		session.getTransaction().commit();
		System.out.println(e);
	}
	
	public void selectAllData() {
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee").list();
		display(empList);
		session.getTransaction().commit();
	}

	public void display(List<Employee> empList) {
		for(Employee emp: empList) {
			System.out.println(emp);
		}
	}
	
	public void selectByName() {
		session.beginTransaction();
		List<Employee> empList = session.createQuery("from Employee e WHERE e.efirstname='WX'").list();
		display(empList);
		session.getTransaction().commit();
	}
	
	public void deleteData(int eid) { //delete based on employee id
		session.beginTransaction();
		Employee e = (Employee)session.get(Employee.class, eid);
		session.delete(e);
		session.getTransaction().commit();
		System.out.println("Employee data deleted...");
	}
	
	public void updateData(int eid, String efirstname) {
		session.beginTransaction();
		Employee e = (Employee)session.get(Employee.class, eid);
		e.setEfirstname(efirstname);
		session.update(e);
		session.getTransaction().commit();
		System.out.println("Employee data updated..." + e);
	}
	

}
