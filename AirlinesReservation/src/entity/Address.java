package entity;

public class Address {
	private int pincode;
	private String dist;
	private String state;
	public Address(int pincode, String dist, String state) {
		super();
		this.pincode = pincode;
		this.dist = dist;
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", dist=" + dist + ", state=" + state + "]";
	}
	
	
}
