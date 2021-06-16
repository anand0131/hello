package demo1;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees")  // to change the table name in the database
public class Employee extends AuditModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 349550440629329565L;

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long eid;
	
	@OneToOne(cascade = CascadeType.ALL) // One to One Relationship
	// Operations to be performed on the child class from parent class  
    @JoinColumn(name = "laptop_id", referencedColumnName = "lid") 
	// Name of the column in Employee table
	private Laptop laptop;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "phone_id", referencedColumnName = "pid")
//	private List<Phone> ph;
	
	@Column(name = "first_name")  // to change the column name in the database
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((eid == null) ? 0 : eid.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((laptop == null) ? 0 : laptop.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		Employee other = (Employee) obj;
		if (eid == null) {
			if (other.eid != null)
				return false;
		} else if (!eid.equals(other.eid))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (laptop == null) {
			if (other.laptop != null)
				return false;
		} else if (!laptop.equals(other.laptop))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", laptop=" + laptop + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}
	
		
}