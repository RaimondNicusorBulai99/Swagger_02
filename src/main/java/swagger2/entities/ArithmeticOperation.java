package swagger2.entities;

import java.util.Arrays;

public class ArithmeticOperation {

    private final String name;
    private final Integer minNumberOfOperands;
    private final String description;
    String[] properties;

    public ArithmeticOperation(String name, Integer minNumberOfOperands, String description, String[] properties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ArithmeticOperation{" +
                "name='" + name + '\'' +
                ", minNumberOfOperands=" + minNumberOfOperands +
                ", description='" + description + '\'' +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public String getDescription() {
        return description;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}