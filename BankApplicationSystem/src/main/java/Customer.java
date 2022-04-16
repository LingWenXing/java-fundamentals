import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer implements Serializable {
	@Id @GeneratedValue
	@Column(name="C_ID")
	private int customerId;
	
	@Column(name="C_NAME")
	private String customerName;
	
	@Column(name="C_USERNAME")
	private String customerUsername;
	
	@Column(name="C_PASSWORD")
	private String customerPassword;
	
	@Column(name="C_EMAIL")
	private String customerEmail;
	
	public Customer() {}
	
	public Customer(String customerName, String customerUsername, String customerPassword, String customerEmail) {
		super();
		this.customerName = customerName;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.customerEmail = customerEmail;
	}
	
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerUsername=" + customerUsername
				+ ", customerPassword=" + customerPassword + ", customerEmail=" + customerEmail + "]";
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerUsername() {
		return customerUsername;
	}
	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
}
