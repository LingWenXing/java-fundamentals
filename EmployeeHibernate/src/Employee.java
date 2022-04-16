
public class Employee {
	private int eid;
	private String efirstname;
	private String elastname;
	private String eemail;
	
	public Employee() {}
	
	public Employee(int eid, String efirstname, String elastname, String eemail) {
		super();
		this.eid = eid;
		this.efirstname = efirstname;
		this.elastname = elastname;
		this.eemail = eemail;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", efirstname=" + efirstname + ", elastname=" + elastname + ", eemail=" + eemail
				+ "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEfirstname() {
		return efirstname;
	}
	public void setEfirstname(String efirstname) {
		this.efirstname = efirstname;
	}
	public String getElastname() {
		return elastname;
	}
	public void setElastname(String elastname) {
		this.elastname = elastname;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	
	
}
