
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "WX", "Ling", "wenxing.ling@dxc.com");
		Employee e2 = new Employee(2, "Yashas", "Ma", "yashas.ma@dxc.com");
		Employee e3 = new Employee(3, "Akhil", "Banagiri", "akhil.banagiri@avensys.com");
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		
		//create
//		hm.insert(e1);
//		hm.insert(e2);
//		hm.insert(e3);
		
		// retrieve
//		hm.selectData(1);
//		hm.selectData(2);
//		hm.selectAllData();
//		hm.selectByName();
		
		//delete
//		hm.deleteData(3);
		
		//update
//		hm.updateData(2, "Yahas");

	}

}
