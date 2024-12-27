public class Level3SupportHandler implements SupportHandler {

    public void setNextHandler(SupportHandler nextHandler) {
        // No next handler for Level 3
    }

    public void handlerRequest(Request request) {
        if (request.getPriority() == Priority.CRITICAL) {
            System.out.println("Level 3 Support handled the request.");
        }
    }
}
