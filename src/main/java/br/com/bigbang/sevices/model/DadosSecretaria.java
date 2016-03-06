package br.com.bigbang.sevices.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement
@Table(name="sum_secretaria")
@Entity
public class DadosSecretaria implements Serializable {
	private BigDecimal qtd_fora_prazo;
	private BigDecimal qtd_dentro_prazo;
	private BigDecimal tempo_med_resp;
	private BigDecimal qtd_chamados;
	private String nome;
	
	@Id
	@GeneratedValue
	private Long id;
	
	public BigDecimal getQtd_fora_prazo() {
		return qtd_fora_prazo;
	}
	public void setQtd_fora_prazo(BigDecimal qtd_fora_prazo) {
		this.qtd_fora_prazo = qtd_fora_prazo;
	}
	public BigDecimal getQtd_dentro_prazo() {
		return qtd_dentro_prazo;
	}
	public void setQtd_dentro_prazo(BigDecimal qtd_dentro_prazo) {
		this.qtd_dentro_prazo = qtd_dentro_prazo;
	}
	public BigDecimal getTempo_med_resp() {
		return tempo_med_resp;
	}
	public void setTempo_med_resp(BigDecimal tempo_med_resp) {
		this.tempo_med_resp = tempo_med_resp;
	}
	public BigDecimal getQtd_chamados() {
		return qtd_chamados;
	}
	public void setQtd_chamados(BigDecimal qtd_chamados) {
		this.qtd_chamados = qtd_chamados;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
