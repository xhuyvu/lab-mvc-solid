
package dto;

/**
 *
 * @author xhuyvu
 */
public class RequestDTO {
    private String date;
    private double number;
    private String content;
    private int id;
    
    public RequestDTO(){}
    
    public RequestDTO(String date, double number, String content) {
        this.date = date;
        this.number = number;
        this.content = content;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
