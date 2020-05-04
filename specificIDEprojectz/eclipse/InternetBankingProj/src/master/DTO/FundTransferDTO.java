package master.DTO;

public class FundTransferDTO {

	String saccno;
	String baccno;
	String ifcs;
	String bank;
	double amount;
	String tdate;
	
	public String getSaccno() {
		return saccno;
	}
	public void setSaccno(String saccno) {
		this.saccno = saccno;
	}
	public String getBaccno() {
		return baccno;
	}
	public void setBaccno(String baccno) {
		this.baccno = baccno;
	}
	public String getIfcs() {
		return ifcs;
	}
	public void setIfcs(String ifcs) {
		this.ifcs = ifcs;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	
	
	
}
