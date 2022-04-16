
public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student(1, "WX");
		Student s2 = new Student(2, "Yashas");
		Student s3 = new Student(3, "Akhil");
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		
		//create
//		hm.insert(s1);
//		hm.insert(s2);
//		hm.insert(s3);
		
		// retrieve
		hm.selectData(1);
		hm.selectData(2);
		
		//delete
//		hm.deleteData(3);
		
		//update
		hm.updateData(2, "Yahas Ma");

	}

}
