package projectdtoo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class shakthi1 {
	@Id
	private long aadharno;
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
	public int getRation() {
		return ration;
	}
	public void setRation(int ration) {
		this.ration = ration;
	}
	private String name;
	private int ration;
	

}
