import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.*;
public class HibernateManager  {
	Session session;
	public void connect() {
	//Connection code
		// these 5 lines would remain same and is used for getting connection
       Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
       ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
       SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   
          		 
        session =sessionFactory.openSession();	
        System.out.println("Connected to StudentHibernate....");
	}
	
	public void insert(Student s) {  //inserts a row into the table
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		System.out.println("Insertion success...");
	}
	
	public void selectData(int sid) { //select based on student id
		session.beginTransaction();
		Student s = (Student)session.get(Student.class, sid);
		session.getTransaction().commit();
		System.out.println(s);
	}
	
	public void deleteData(int sid) { //delete based on student id
		session.beginTransaction();
		Student s = (Student)session.get(Student.class, sid);
		session.delete(s);
		session.getTransaction().commit();
		System.out.println("Student data deleted...");
	}
	
	public void updateData(int sid, String sname) {
		session.beginTransaction();
		Student s = (Student)session.get(Student.class, sid);
		s.setSname(sname);
		session.update(s);
		session.getTransaction().commit();
		System.out.println("Student data updated..." + s);
	}
	

}
