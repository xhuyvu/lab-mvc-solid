package model;

/**
 *
 * @author xhuyvu
 */
public class Expense {

    private int id;
    private String date;
    private double number;
    private String content;

    // constructor
    public Expense(int id, String date, double number, String content) {
        this.id = id;
        this.date = date;
        this.number = number;
        this.content = content;

    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {

        return String.format("%-20d%-20s%-20.0f%-20s\n", id, date, number, content);
    }
}
