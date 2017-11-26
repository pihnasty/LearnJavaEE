package calculator.calc;

/**
 * Created by pom on 05.11.2017.
 */
public enum OperationType {
    ADD("+"),
    SUBTRACK("-"),
    MULTIPLY("*"),
    DEVIDE("/");

    String s;

    OperationType(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}
