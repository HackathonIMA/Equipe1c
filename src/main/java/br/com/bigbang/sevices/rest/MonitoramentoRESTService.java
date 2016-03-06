package br.com.bigbang.sevices.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.bigbang.sevices.data.MonitoramentoRepository;
import br.com.bigbang.sevices.model.Monitoramento;
import br.com.bigbang.sevices.service.MonitoramentoRegitration;

@Path("/monitoramento")
@RequestScoped
public class MonitoramentoRESTService {

	@Inject
	MonitoramentoRepository monitoramentoRepository;

	@Inject
	MonitoramentoRegitration regitration;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response criarMonitoramento(Monitoramento monitoramento) {
		Response.ResponseBuilder builder = null;
		try {
			regitration.criar(monitoramento);
			builder = Response.ok();
		} catch (Exception e) {
			Map<String, String> responseObj = new HashMap<>();
			responseObj.put("error", e.getMessage());
			builder = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
		}
		return builder.build();

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Monitoramento> listaTodos() {
		return monitoramentoRepository.buscaTodos();
	}

}
