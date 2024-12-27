public interface SupportHandler {
    void setNextHandler(SupportHandler nextHandler);

    void handlerRequest(Request request);
}
