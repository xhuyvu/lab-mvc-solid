package view;

import dto.*;

public class DoctorView {

    private ResponseDTO ResponseDTO;
    private String message;

    //setter
    public void setResponseDTO(ResponseDTO ResponseDTO) {
        this.ResponseDTO = ResponseDTO;
    }

    // setter
    public void setMessage(String message) {
        this.message = message;
    }

    //display message
    public void printMessage() {
        System.out.println(message);
    }

    //display doctor
    public void displayDoctor() {
        System.out.println("-----Result-----");
        System.out.printf(String.format("%-20s%-20s%-20s%-20s\n", "Code","Name","Specialization","Availbility"));
        System.out.println(ResponseDTO.getBody());
    }

}
