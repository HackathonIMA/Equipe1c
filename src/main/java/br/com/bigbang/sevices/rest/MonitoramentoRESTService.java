package br.com.bigbang.sevices.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
	public void criarMonitoramento(Monitoramento monitoramento) {
		regitration.criar(monitoramento);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Monitoramento> listaTodos() {
		return monitoramentoRepository.buscaTodos();
	}

}
