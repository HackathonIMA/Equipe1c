package br.com.bigbang.sevices.rest;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.bigbang.sevices.model.Contestacao;
import br.com.bigbang.sevices.service.ContestaAtendimentoService;

@Path("/contestaAtendimento")
@RequestScoped
public class ContestaAtendimentoRESTService {

	

	@Inject
	ContestaAtendimentoService regitration;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response contessta(Contestacao contestacao) {
		Response.ResponseBuilder builder = null;
		try {
			regitration.contesta(contestacao);
			builder = Response.ok();
		} catch (Exception e) {
			Map<String, String> responseObj = new HashMap<>();
			responseObj.put("error", e.getMessage());
			builder = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
		}
		return builder.build();

	}

	
}
