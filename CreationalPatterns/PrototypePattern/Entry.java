package PrototypePattern;

public class Entry {
    public static void main(String[] args) {
        NetworkConnection n1 = new NetworkConnection();
        n1.ip = "244.178.44.111";
        n1.loadVeryImportantData();

        System.out.println(n1);

        NetworkConnection n2 = null;
        try {
            n2 = (NetworkConnection) n1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(n2);
    }
}
