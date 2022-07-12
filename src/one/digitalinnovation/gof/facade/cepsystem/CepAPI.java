package one.digitalinnovation.gof.facade.cepsystem;

public class CepAPI {

    private static CepAPI instance = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Sousa";
    }

    public String recuperarEstado(String cep) {
        return "PB";
    }
}
