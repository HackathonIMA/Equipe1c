package br.com.bigbang.sevices.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.bigbang.sevices.data.ExecucaoOrcamentariaRepository;
import br.com.bigbang.sevices.model.ExecucaoOrcamentaria;

@Path("/execucao-orcamentaria")
@RequestScoped
public class ExecucaoOrcamentariaResourceRESTService {

	@Inject
	private ExecucaoOrcamentariaRepository repository;

	@GET
	@Path("/{secretaria}/{ano}")
	@Produces(MediaType.APPLICATION_JSON)
	public ExecucaoOrcamentaria listaTodos(@PathParam("secretaria") String secretaria,@PathParam("ano") int ano) {
		return repository.buscaPorNome(secretaria, ano);
	}
	

}
