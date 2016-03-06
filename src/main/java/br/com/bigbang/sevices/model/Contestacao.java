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
@Table(name="contestacao")
@Entity
public class Contestacao implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String solicitation_id;
	private String observacao;
	
	public String getSolicitation_id() {
		return solicitation_id;
	}
	public void setSolicitation_id(String solicitation_id) {
		this.solicitation_id = solicitation_id;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	


}
