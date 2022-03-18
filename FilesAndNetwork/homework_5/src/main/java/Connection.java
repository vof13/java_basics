public class Connection {

    private String name;
    private String number;

    public Connection(String name, String stationNumber) {
        this.name = name;
        this.number = stationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
