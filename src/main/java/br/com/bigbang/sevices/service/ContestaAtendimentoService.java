/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.bigbang.sevices.service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.bigbang.sevices.data.AtendimentoRepository;
import br.com.bigbang.sevices.data.DadosSecretariaRepository;
import br.com.bigbang.sevices.model.Atendimento;
import br.com.bigbang.sevices.model.Contestacao;
import br.com.bigbang.sevices.model.DadosSecretaria;

@Stateless
public class ContestaAtendimentoService {

    @Inject
    private EntityManager em; 
    @Inject 
    private DadosSecretariaRepository dadosSecretariaRepository;
    @Inject 
    private AtendimentoRepository atendimentoRepository;
    public void contesta(Contestacao contestacao) throws Exception  {
    	Atendimento atendimento = atendimentoRepository.buscaPorID(contestacao.getSolicitation_id());
    	
    	SimpleDateFormat formater= new SimpleDateFormat("dd/MM/yyyy");
    	Date dataCadastro = formater.parse(atendimento.getDataCadastro());
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(dataCadastro);
    	atendimento.setQuestionado(BigDecimal.ONE);
    	DadosSecretaria dadosSecretaria = dadosSecretariaRepository.buscaPorNome(atendimento.getSecretaria(),atendimento.getAnoSolicitacao().intValue(),calendar.get(Calendar.MONTH)+1);
    	dadosSecretaria.setQtdQuestionados(dadosSecretaria.getQtdQuestionados().add(BigDecimal.ONE));
    	em.merge(dadosSecretaria);
    	em.persist(contestacao);
    	em.merge(atendimento);
    }
    
  

}
