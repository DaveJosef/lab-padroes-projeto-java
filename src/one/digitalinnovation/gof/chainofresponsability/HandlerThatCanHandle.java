package one.digitalinnovation.gof.chainofresponsability;

public class HandlerThatCanHandle extends HandlerImpl {

    public HandlerThatCanHandle(Handler successor) {
        super(successor);
        canHandle = true;
    }
}
