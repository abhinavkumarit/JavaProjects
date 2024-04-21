package entity;

public class Customer {
	private String cname;
	private int cid;
	private long phone;
	private String email;
	private Address caddress;
	private double camt;
	public Customer(String cname, int cid, long phone, String email, Address caddress, double camt) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.phone = phone;
		this.email = email;
		this.caddress = caddress;
		this.camt = camt;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getCaddress() {
		return caddress;
	}
	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}
	public double getCamt() {
		return camt;
	}
	public void setCamt(double camt) {
		this.camt = camt;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", phone=" + phone + ", email=" + email + ", caddress="
				+ caddress + ", camt=" + camt + "]";
	}
	
	
}
