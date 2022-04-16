
public class CustomerCarDetails {
	String username;
	String model;
	String type;
	String service;
	
	public CustomerCarDetails(String username, String model, String type, String service) {
		super();
		this.username = username;
		this.model = model;
		this.type = type;
		this.service = service;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String toString() {
		return "CustomerCarDetails [username=" + username + ", model=" + model + ", type=" + type + ", service="
				+ service + "]";
	}
	
}
