package demo1;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LAPTOP")
public class Laptop extends AuditModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6493222099537158724L;
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long lid;
	private String brand,model;
	private Integer cpu,hdd,ram;
	
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getCpu() {
		return cpu;
	}
	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}
	public Integer getHdd() {
		return hdd;
	}
	public void setHdd(Integer hdd) {
		this.hdd = hdd;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((hdd == null) ? 0 : hdd.hashCode());
		result = prime * result + ((lid == null) ? 0 : lid.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((ram == null) ? 0 : ram.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (hdd == null) {
			if (other.hdd != null)
				return false;
		} else if (!hdd.equals(other.hdd))
			return false;
		if (lid == null) {
			if (other.lid != null)
				return false;
		} else if (!lid.equals(other.lid))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (ram == null) {
			if (other.ram != null)
				return false;
		} else if (!ram.equals(other.ram))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", model=" + model + ", cpu=" + cpu + ", hdd=" + hdd
				+ ", ram=" + ram + "]";
	}
	
	
}
