package br.com.bigbang.sevices.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
	private Date dataProviencia;
	private String nomeLogradouro;
	private String tipoLogradouro;
	private String cep;
	private Date dataConclusao;
	private Date dataAtendimento;
	private Date dataPrevisaoResposta;
	private Date dataCadastro;
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
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Date getDataProviencia() {
		return dataProviencia;
	}
	public void setDataProviencia(Date dataProviencia) {
		this.dataProviencia = dataProviencia;
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
	public Date getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	public Date getDataAtendimento() {
		return dataAtendimento;
	}
	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}
	public Date getDataPrevisaoResposta() {
		return dataPrevisaoResposta;
	}
	public void setDataPrevisaoResposta(Date dataPrevisaoResposta) {
		this.dataPrevisaoResposta = dataPrevisaoResposta;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
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
	
}
