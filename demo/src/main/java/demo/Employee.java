package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	

	private Long eid;
	private String name;
	private Boolean SalaryPaid;
	private int ctc;
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getSalaryPaid() {
		return SalaryPaid;
	}
	public void setSalaryPaid(Boolean salaryPaid) {
		SalaryPaid = salaryPaid;
	}
	public int getCtc() {
		return ctc;
	}
	public void setCtc(int ctc) {
		this.ctc = ctc;
	}
	public Employee(Long eid, String name, Boolean salaryPaid, int ctc) {
		
		this.eid = eid;
		this.name = name;
		SalaryPaid = salaryPaid;
		this.ctc = ctc;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", name=" + name + ", SalaryPaid=" + SalaryPaid + ", ctc=" + ctc + "]";
	}
	


}