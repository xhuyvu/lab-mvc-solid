package dto;

import java.util.List;

/**
 *
 * @author xhuyvu
 */
public class ResponseDTO {


    private int id;
    private String date;
    private double number;
    private String content;
   
    // constructor
    public ResponseDTO(int id, String date, double number, String content) {
        this.id = id;
        this.date = date;
        this.number = number;
        this.content = content;
    
    }

    public int getId() {
        return id;
    }
    public double getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

  
}
