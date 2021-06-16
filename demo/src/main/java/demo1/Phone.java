package demo1;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone extends AuditModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2343330713927868191L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	private String phoneNumber, typeofPhone;
	private Boolean whatsApp,telegram;
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getTypeofPhone() {
		return typeofPhone;
	}
	public void setTypeofPhone(String typeofPhone) {
		this.typeofPhone = typeofPhone;
	}
	public Boolean getWhatsApp() {
		return whatsApp;
	}
	public void setWhatsApp(Boolean whatsApp) {
		this.whatsApp = whatsApp;
	}
	public Boolean getTelegram() {
		return telegram;
	}
	public void setTelegram(Boolean telegram) {
		this.telegram = telegram;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		result = prime * result + ((telegram == null) ? 0 : telegram.hashCode());
		result = prime * result + ((typeofPhone == null) ? 0 : typeofPhone.hashCode());
		result = prime * result + ((whatsApp == null) ? 0 : whatsApp.hashCode());
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
		Phone other = (Phone) obj;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		if (telegram == null) {
			if (other.telegram != null)
				return false;
		} else if (!telegram.equals(other.telegram))
			return false;
		if (typeofPhone == null) {
			if (other.typeofPhone != null)
				return false;
		} else if (!typeofPhone.equals(other.typeofPhone))
			return false;
		if (whatsApp == null) {
			if (other.whatsApp != null)
				return false;
		} else if (!whatsApp.equals(other.whatsApp))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Phone [pid=" + pid + ", phoneNumber=" + phoneNumber + ", typeofPhone=" + typeofPhone + ", whatsApp="
				+ whatsApp + ", telegram=" + telegram + "]";
	}
	

}
