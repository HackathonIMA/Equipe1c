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
@Table(name="summ_secretaria")
@Entity
public class DadosSecretaria implements Serializable {
	private String secretaria;
	
	private BigDecimal anosolicitacao ;
	private BigDecimal mesSolicitacao ;
	private BigDecimal qtdChamados ;
	private BigDecimal qtdQuestionados ;
	private BigDecimal min_cad_ate ;
	private BigDecimal max_cad_ate ;
	private BigDecimal med_cad_ate ;
	private BigDecimal min_espera_prev ;
	private BigDecimal max_espera_prev ;
	private BigDecimal med_espera_prev ;
	private BigDecimal min_diff_prev_prov ;
	private BigDecimal max_diff_prev_prov ;
	private BigDecimal med_diff_prev_prov ;
	private BigDecimal foraprazo ;
	private BigDecimal antesprazo ;
	private BigDecimal maioratraso ;
	private BigDecimal maiorantecipacao ;
	private BigDecimal min_diff_cad_conc ;
	private BigDecimal max_diff_cad_conc ;
	private BigDecimal med_diff_cad_conc;
	
	@Id
	@GeneratedValue
	private Long pkey;
	
	public String getMesAno(){
		return ""+anosolicitacao.intValue()+"/"+mesSolicitacao.intValue();
	}
	
	public BigDecimal getAnosolicitacao() {
		return anosolicitacao;
	}
	public void setAnosolicitacao(BigDecimal anosolicitacao) {
		this.anosolicitacao = anosolicitacao;
	}
	public BigDecimal getMesSolicitacao() {
		return mesSolicitacao;
	}
	public void setMesSolicitacao(BigDecimal mesSolicitacao) {
		this.mesSolicitacao = mesSolicitacao;
	}
	public BigDecimal getQtdChamados() {
		return qtdChamados;
	}
	public void setQtdChamados(BigDecimal qtdChamados) {
		this.qtdChamados = qtdChamados;
	}
	public BigDecimal getQtdQuestionados() {
		return qtdQuestionados;
	}
	public void setQtdQuestionados(BigDecimal qtdQuestionados) {
		this.qtdQuestionados = qtdQuestionados;
	}
	public BigDecimal getMin_cad_ate() {
		return min_cad_ate;
	}
	public void setMin_cad_ate(BigDecimal min_cad_ate) {
		this.min_cad_ate = min_cad_ate;
	}
	public BigDecimal getMax_cad_ate() {
		return max_cad_ate;
	}
	public void setMax_cad_ate(BigDecimal max_cad_ate) {
		this.max_cad_ate = max_cad_ate;
	}
	public BigDecimal getMed_cad_ate() {
		return med_cad_ate;
	}
	public void setMed_cad_ate(BigDecimal med_cad_ate) {
		this.med_cad_ate = med_cad_ate;
	}
	public BigDecimal getMin_espera_prev() {
		return min_espera_prev;
	}
	public void setMin_espera_prev(BigDecimal min_espera_prev) {
		this.min_espera_prev = min_espera_prev;
	}
	public BigDecimal getMax_espera_prev() {
		return max_espera_prev;
	}
	public void setMax_espera_prev(BigDecimal max_espera_prev) {
		this.max_espera_prev = max_espera_prev;
	}
	public BigDecimal getMed_espera_prev() {
		return med_espera_prev;
	}
	public void setMed_espera_prev(BigDecimal med_espera_prev) {
		this.med_espera_prev = med_espera_prev;
	}
	public BigDecimal getMin_diff_prev_prov() {
		return min_diff_prev_prov;
	}
	public void setMin_diff_prev_prov(BigDecimal min_diff_prev_prov) {
		this.min_diff_prev_prov = min_diff_prev_prov;
	}
	public BigDecimal getMax_diff_prev_prov() {
		return max_diff_prev_prov;
	}
	public void setMax_diff_prev_prov(BigDecimal max_diff_prev_prov) {
		this.max_diff_prev_prov = max_diff_prev_prov;
	}
	public BigDecimal getMed_diff_prev_prov() {
		return med_diff_prev_prov;
	}
	public void setMed_diff_prev_prov(BigDecimal med_diff_prev_prov) {
		this.med_diff_prev_prov = med_diff_prev_prov;
	}
	public BigDecimal getForaprazo() {
		return foraprazo;
	}
	public void setForaprazo(BigDecimal foraprazo) {
		this.foraprazo = foraprazo;
	}
	public BigDecimal getAntesprazo() {
		return antesprazo;
	}
	public void setAntesprazo(BigDecimal antesprazo) {
		this.antesprazo = antesprazo;
	}
	public BigDecimal getMaioratraso() {
		return maioratraso;
	}
	public void setMaioratraso(BigDecimal maioratraso) {
		this.maioratraso = maioratraso;
	}
	public BigDecimal getMaiorantecipacao() {
		return maiorantecipacao;
	}
	public void setMaiorantecipacao(BigDecimal maiorantecipacao) {
		this.maiorantecipacao = maiorantecipacao;
	}
	public BigDecimal getMin_diff_cad_conc() {
		return min_diff_cad_conc;
	}
	public void setMin_diff_cad_conc(BigDecimal min_diff_cad_conc) {
		this.min_diff_cad_conc = min_diff_cad_conc;
	}
	public BigDecimal getMax_diff_cad_conc() {
		return max_diff_cad_conc;
	}
	public void setMax_diff_cad_conc(BigDecimal max_diff_cad_conc) {
		this.max_diff_cad_conc = max_diff_cad_conc;
	}
	public BigDecimal getMed_diff_cad_conc() {
		return med_diff_cad_conc;
	}
	public void setMed_diff_cad_conc(BigDecimal med_diff_cad_conc) {
		this.med_diff_cad_conc = med_diff_cad_conc;
	}
	public String getSecretaria() {
		return secretaria;
	}
	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}
	
}
