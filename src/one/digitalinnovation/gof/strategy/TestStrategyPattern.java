package one.digitalinnovation.gof.strategy;

public class TestStrategyPattern {

    public static void main(String[] args) {
        Robo robo = new Robo();
        robo.mover();

        ComportamentoAgressivo comportamentoAgressivo = new ComportamentoAgressivo();
        robo.setComportamento(comportamentoAgressivo);
        robo.mover();

        ComportamentoDefensivo comportamentoDefensivo = new ComportamentoDefensivo();
        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
    }
}
