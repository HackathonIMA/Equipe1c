package br.com.bigbang.sevices.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
@Table(name="monitoramento")
@Entity
public class Monitoramento implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String solicitation_id;
	private String cell;
	private String email;
	private String mobile;
	
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getSolicitation_id() {
		return solicitation_id;
	}
	public void setSolicitation_id(String solicitation_id) {
		this.solicitation_id = solicitation_id;
	}

}
