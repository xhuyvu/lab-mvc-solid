package view;

import dto.*;
import java.util.List;

/**
 *
 * @author xhuyvu
 */
public class WorkerView {

    private List<ResponseDTO> responeDTO;
    private String message;

    // set responseDTO
    public void setList(List<ResponseDTO> list) {
        this.responeDTO = list;
    }

    // set messgae
    public void setMessage(String message) {
        this.message = message;
    }

    //display message
    public void displayMessage() {
        System.out.println(message);
    }

    //display history
    public void displayInfo() {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "id", "Name", "Age", "Salary", "Status", "Date");
        for (ResponseDTO d : responeDTO) {
            System.out.printf("%-20s%-20s%-20d%-20.0f%-20s%-20s\n", d.getId(), d.getName(), d.getAge(), d.getSalary(), d.getStatus(), d.getDate());
        }
    }
}
