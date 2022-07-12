package one.digitalinnovation.gof.chainofresponsability;

public class HandlerThatCantHandle2 extends HandlerImpl {

    public HandlerThatCantHandle2(Handler successor) {
        super(successor);
        this.canHandle = false;
    }
}
