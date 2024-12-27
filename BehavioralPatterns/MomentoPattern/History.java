package BehavioralPatterns.MomentoPattern;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentMomento> momentos;

    public History() {
        this.momentos = new ArrayList<>();
    }

    public void addMomento(DocumentMomento momento) {
        this.momentos.add(momento);
    }

    public DocumentMomento getMemento(int index) {
        return this.momentos.get(index);
    }

}
