package projectdtoo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class annabhagya1 {
	@Id
	private long aadharno;
	@Override
	public String toString() {
		return "annabhagya [aadharno=" + aadharno + ", name=" + name + ", rationno=" + rationno + "]";
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
	public int getRationno() {
		return rationno;
	}
	public void setRationno(int rationno) {
		this.rationno = rationno;
	}
	private String name;
	private int rationno;
	

}
