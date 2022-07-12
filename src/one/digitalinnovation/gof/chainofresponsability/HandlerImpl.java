package one.digitalinnovation.gof.chainofresponsability;

public abstract class HandlerImpl implements Handler {
    protected Handler successor;
    protected boolean canHandle;

    public HandlerImpl(Handler successor) {
        this.successor = successor;
    }

    void responda() {
        System.out.println(getClass().getName() + ": Respondendo");
    }

    @Override
    public void handleRequest() {
        if (canHandle) {
            responda();
        } else {
            if (successor != null) {
                successor.handleRequest();
            }
        }
    }
}
