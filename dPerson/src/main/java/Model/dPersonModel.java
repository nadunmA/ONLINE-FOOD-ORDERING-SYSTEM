package Model;

public class dPersonModel {
	
	private String dpId;
	private String name;
	private String phone;
	private String email;
	private String location;
	private String assignedOrders;
	private String paymentStatus;
	private String orderStatus;
	private String createdAt;
	private String updatedAt;
	
	
	//constructor part
	
	public dPersonModel(String dpId, String name, String phone, String email, String location, String assignedOrders,
						String paymentStatus, String orderStatus, String createdAt, String updatedAt) {
		
		super();
		this.dpId = dpId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.location = location;
		this.assignedOrders = assignedOrders;
		this.paymentStatus = paymentStatus;
		this.orderStatus = orderStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	

	//setters & getters
	
	public String getDpId() {
		return dpId;
	}

	public void setDpId(String dpId) {
		this.dpId = dpId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAssignedOrders() {
		return assignedOrders;
	}

	public void setAssignedOrders(String assignedOrders) {
		this.assignedOrders = assignedOrders;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
