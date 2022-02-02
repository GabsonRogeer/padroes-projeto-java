package com.dio.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

public class Facade {

    public void dadosCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
