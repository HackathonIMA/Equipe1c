package br.com.bigbang.sevices.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@Entity
@XmlRootElement
@Table(name="atendimento")
public class Atendimento implements Serializable {

	@Id
	private String ID;
	private String dataProviencia;
	private String nomeLogradouro;
	private String tipoLogradouro;
	private String cep;
	private String dataConclusao;
	private String dataAtendimento;
	private String dataPrevisaoResposta;
	private String dataCadastro;
	private String descricaoStatus;
	private BigDecimal statusSolicitacao;
	private String descricaoTipoSolicitacao;
	private BigDecimal tipoSolicitacao;
	private BigDecimal anoSolicitacao;
	private String descricaoAssunto;
	private BigDecimal codigoAssunto;
	private String nomeBairro;
	private BigDecimal codigoBairro;
	private String secretaria;
	private String nomeRegiao;
	private String nomeRegional;
	private BigDecimal questionado ;
	private BigDecimal numeroSolicitacao ;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getNomeLogradouro() {
		return nomeLogradouro;
	}
	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getDescricaoStatus() {
		return descricaoStatus;
	}
	public void setDescricaoStatus(String descricaoStatus) {
		this.descricaoStatus = descricaoStatus;
	}
	public BigDecimal getStatusSolicitacao() {
		return statusSolicitacao;
	}
	public void setStatusSolicitacao(BigDecimal statusSolicitacao) {
		this.statusSolicitacao = statusSolicitacao;
	}
	public String getDescricaoTipoSolicitacao() {
		return descricaoTipoSolicitacao;
	}
	public void setDescricaoTipoSolicitacao(String descricaoTipoSolicitacao) {
		this.descricaoTipoSolicitacao = descricaoTipoSolicitacao;
	}
	public BigDecimal getTipoSolicitacao() {
		return tipoSolicitacao;
	}
	public void setTipoSolicitacao(BigDecimal tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}
	public BigDecimal getAnoSolicitacao() {
		return anoSolicitacao;
	}
	public void setAnoSolicitacao(BigDecimal anoSolicitacao) {
		this.anoSolicitacao = anoSolicitacao;
	}
	public String getDescricaoAssunto() {
		return descricaoAssunto;
	}
	public void setDescricaoAssunto(String descricaoAssunto) {
		this.descricaoAssunto = descricaoAssunto;
	}
	public BigDecimal getCodigoAssunto() {
		return codigoAssunto;
	}
	public void setCodigoAssunto(BigDecimal codigoAssunto) {
		this.codigoAssunto = codigoAssunto;
	}
	public String getNomeBairro() {
		return nomeBairro;
	}
	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	public BigDecimal getCodigoBairro() {
		return codigoBairro;
	}
	public void setCodigoBairro(BigDecimal codigoBairro) {
		this.codigoBairro = codigoBairro;
	}
	public String getSecretaria() {
		return secretaria;
	}
	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}
	public String getNomeRegiao() {
		return nomeRegiao;
	}
	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}
	public String getNomeRegional() {
		return nomeRegional;
	}
	public void setNomeRegional(String nomeRegional) {
		this.nomeRegional = nomeRegional;
	}
	public BigDecimal getQuestionado() {
		return questionado;
	}
	public void setQuestionado(BigDecimal questionado) {
		this.questionado = questionado;
	}
	public BigDecimal getNumeroSolicitacao() {
		return numeroSolicitacao;
	}
	public void setNumeroSolicitacao(BigDecimal numeroSolicitacao) {
		this.numeroSolicitacao = numeroSolicitacao;
	}
	public String getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(String dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	public String getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(String dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public String getDataPrevisaoResposta() {
		return dataPrevisaoResposta;
	}
	public void setDataPrevisaoResposta(String dataPrevisaoResposta) {
		this.dataPrevisaoResposta = dataPrevisaoResposta;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getDataProviencia() {
		return dataProviencia;
	}
	public void setDataProviencia(String dataProviencia) {
		this.dataProviencia = dataProviencia;
	}
	
}
