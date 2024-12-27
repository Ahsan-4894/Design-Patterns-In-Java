package BehavioralPatterns.MomentoPattern;

public class MomentoExample {
    public static void main(String[] args) {
        Document document = new Document("Hello World\n");
        History history = new History();

        document.write("Hello wonderful\n");

        history.addMomento(document.createMomento());

        document.write("Hello excellent");

        System.out.println(document.getContent()); // Hello World\nHello wonderful\nHello excellent

        // restore back to its previous state!

        document.restoreFromMemento(history.getMemento(0));

        System.out.println(document.getContent()); // Hello World\nHello wonderful
    }
}
