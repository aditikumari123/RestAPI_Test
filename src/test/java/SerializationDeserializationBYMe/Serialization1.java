package SerializationDeserializationBYMe;


public class Serialization1 {

    private String data;
    private String support;

    public Serialization1(String data, String support) {
        this.data = data;
        this.support = support;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    @Override
    public String toString() {
        return "Serialization1{" +
                "data='" + data + '\'' +
                ", support='" + support + '\'' +
                '}';
    }
}

