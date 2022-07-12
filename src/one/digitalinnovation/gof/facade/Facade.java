package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.facade.cepsystem.CepAPI;
import one.digitalinnovation.gof.facade.crmsystem.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepAPI.getInstance().recuperarCidade(cep);
        String estado = CepAPI.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
