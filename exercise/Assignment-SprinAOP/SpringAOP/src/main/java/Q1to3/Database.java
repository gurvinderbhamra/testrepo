package Q1to3;

public class Database {
    private int port;
    private String name;

    public void connect(CustomEventPublisher customEventPublisher){
        System.out.println("\n Event published in database connect method.........");
        customEventPublisher.display();
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
