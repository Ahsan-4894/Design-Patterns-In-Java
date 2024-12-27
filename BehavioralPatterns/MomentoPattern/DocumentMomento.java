package BehavioralPatterns.MomentoPattern;

public class DocumentMomento {
    private String content;

    public DocumentMomento(String content) {
        this.content = content;
    }

    public String getSavedContent() {
        return this.content;
    }

}
