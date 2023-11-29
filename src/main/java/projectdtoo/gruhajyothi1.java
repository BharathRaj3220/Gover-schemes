package projectdtoo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class gruhajyothi1{
	@Id
	private Long aadharno;
	@Override
	public String toString() {
		return "jyothi [aadharno=" + aadharno + ", name=" + name + ", bill=" + bill + ", rationcard=" + rationcard
				+ "]";
	}
	public Long getAadharno() {
		return aadharno;
	}
	public void setAadharno(Long aadharno) {
		this.aadharno = aadharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public int getRationcard() {
		return rationcard;
	}
	public void setRationcard(int rationcard) {
		this.rationcard = rationcard;
	}
	private String name;
	private int bill;
	private int rationcard;
	

}
