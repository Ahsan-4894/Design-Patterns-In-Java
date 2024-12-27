package BehavioralPatterns.MomentoPattern;

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void write(String content) {
        this.content += content;
    }

    public String getContent() {
        return this.content;
    }

    public DocumentMomento createMomento() {
        return new DocumentMomento(this.content);
    }

    public void restoreFromMemento(DocumentMomento momento){
        this.content = momento.getSavedContent();
    }

}
