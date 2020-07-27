public class Printer {

    private String type;
    private Integer number;

    public Printer (String type, Integer number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public Printer setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public Printer setNumber(Integer number) {
        this.number = number;
        return this;
    }
}
