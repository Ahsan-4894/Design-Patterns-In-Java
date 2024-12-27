public class Client {
    public static void main(String[] args) {
        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request basicRequest = new Request(Priority.BASIC);
        Request intermediateRequest = new Request(Priority.INTERMEDIATE);
        Request criticalRequest = new Request(Priority.CRITICAL);

        level1Handler.handlerRequest(basicRequest); // Level 1 Support handled the request.
        level1Handler.handlerRequest(intermediateRequest);// Level 2 Support handled the request.
        level1Handler.handlerRequest(criticalRequest);// Level 3 Support handled the request.
    }
}
