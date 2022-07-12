package one.digitalinnovation.gof.strategy;

public class Robo {
    private Comportamento comportamento;

    public Robo() {
        comportamento = new ComportamentoNormal();
    }

    public void mover() {
        comportamento.mover();
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
}
