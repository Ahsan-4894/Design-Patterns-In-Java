package PrototypePattern;

public class NetworkConnection implements Cloneable {
    public String ip;
    public String importantData;

    @Override
    public String toString() {
        return "NetworkConnection [ip=" + this.ip + ", importantData=" + this.importantData + "]";
    }

    public void loadVeryImportantData() {
        this.importantData = "Important Data";
        // this will take 10 minutes to fetch data from server
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
