package projectdtoo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class lakshmi1 {
	@Id
	private long aadharno;
	@Override
	public String toString() {
		return "lakshmi1 [aadharno=" + aadharno + ", name=" + name + ", income=" + income + ", rationno=" + rationno
				+ "]";
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getRationno() {
		return rationno;
	}
	public void setRationno(int rationno) {
		this.rationno = rationno;
	}
	private String name;
	private int income;
	private int rationno;
	

}
