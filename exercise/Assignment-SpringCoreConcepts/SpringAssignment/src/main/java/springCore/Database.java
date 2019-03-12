package springCore;

public class Database {


    private String port;
    private String name;

    public Database(String port, String name){
        this.port = port;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString(){
        return "Database bean";
    }
}
