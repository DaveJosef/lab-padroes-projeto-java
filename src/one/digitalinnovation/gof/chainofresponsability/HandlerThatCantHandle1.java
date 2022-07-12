package one.digitalinnovation.gof.chainofresponsability;

public class HandlerThatCantHandle1 extends HandlerImpl {

    public HandlerThatCantHandle1(Handler successor) {
        super(successor);
        this.canHandle = false;
    }
}
