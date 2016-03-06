package br.com.bigbang.sevices.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
@Table(name = "execucaoorcamentaria")
@Entity
public class ExecucaoOrcamentaria implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pkey;

	private BigDecimal ano;
	private String secretaria;
	private BigDecimal TotalDisponivel;
	public Long getPkey() {
		return pkey;
	}
	public void setPkey(Long pkey) {
		this.pkey = pkey;
	}
	public BigDecimal getAno() {
		return ano;
	}
	public void setAno(BigDecimal ano) {
		this.ano = ano;
	}
	public String getSecretaria() {
		return secretaria;
	}
	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}
	public BigDecimal getTotalDisponivel() {
		return TotalDisponivel;
	}
	public void setTotalDisponivel(BigDecimal totalDisponivel) {
		TotalDisponivel = totalDisponivel;
	}

}
