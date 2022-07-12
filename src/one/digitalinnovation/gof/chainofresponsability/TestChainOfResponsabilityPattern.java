package one.digitalinnovation.gof.chainofresponsability;

public class TestChainOfResponsabilityPattern {
    public static void main(String[] args) {
        HandlerThatCanHandle handlerThatCanHandle = new HandlerThatCanHandle(null);
        HandlerThatCantHandle2 handlerThatCantHandle2 = new HandlerThatCantHandle2(handlerThatCanHandle);
        HandlerThatCantHandle1 handlerThatCantHandle1 = new HandlerThatCantHandle1(handlerThatCantHandle2);

        handlerThatCantHandle1.handleRequest();
    }
}
