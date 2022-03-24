package SerializationDeserializationBYMe;

import java.util.List;

public class Deserialization {

    private List<DataClass1> data;
    private List<SupportClass1> support;

    public List<DataClass1> getData() {
        return data;
    }

    public List<SupportClass1> getSupport() {
        return support;
    }

    @Override
    public String toString() {
        return "Deserialization{" +
                "data=" + data +
                ", support=" + support +
                '}';
    }
}
