package master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Master")
public class Customer {

	@Id
	@Column(length=10)
	String cid;
	@Column(length=25)
	String cname;
	@Column(name="phno",length=10)
	String cphno;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCphno() {
		return cphno;
	}
	public void setCphno(String cphno) {
		this.cphno = cphno;
	}
	
	
}
