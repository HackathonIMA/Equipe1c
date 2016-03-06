package br.com.bigbang.sevices.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.bigbang.sevices.data.DadosSecretariaRepository;
import br.com.bigbang.sevices.model.DadosSecretaria;

@Path("/dados-secretaria")
@RequestScoped
public class DadosSecretariaResourceRESTService {

	@Inject
	private DadosSecretariaRepository repository;

	@GET
	@Path("/{secretaria}/{ano}/{mes}")
	@Produces(MediaType.APPLICATION_JSON)
	public DadosSecretaria listaTodos(@PathParam("secretaria") String secretaria,@PathParam("ano") int ano,@PathParam("mes") int mes) {
		return repository.buscaPorNome(secretaria, ano, mes);
	}
	@GET
	@Path("/{secretaria}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<DadosSecretaria> listaTodos(@PathParam("secretaria") String secretaria) {
		return repository.buscaPorNome(secretaria);
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<DadosSecretaria> listaTodos() {
		return repository.buscaTodos();
	}

}
