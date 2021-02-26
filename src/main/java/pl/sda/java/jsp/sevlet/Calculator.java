package pl.sda.java.jsp.sevlet;

public class Calculator {

    private String input = "";
    private String input2;
    private String operator;

    public String display() {
        return input;
    }

    public void input(String digit) {
        input += digit;
    }

    public void add() {
        input2 = input;
        input = "";
        operator = "+";
    }

    public void subtract() {
        input2 = input;
        input = "";
        operator = "-";
    }

    public void clear() {
        input = "";
    }

    public void evaluate() {
        switch (operator) {

            case "+":
                input = String.valueOf(Integer.valueOf(input) + Integer.valueOf(input2));
                break;
            case "-":
                input = String.valueOf(Integer.valueOf(input2) - Integer.valueOf(input));
                break;
            default:
                throw new IllegalStateException("Invalid operator " + operator);

        }
    }
}
