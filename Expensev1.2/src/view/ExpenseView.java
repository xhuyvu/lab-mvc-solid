/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import dto.*;
import java.util.List;
import model.Expense;

/**
 *
 * @author xhuyvu
 */
public class ExpenseView {

    private List<ResponseDTO> response;
    private String message;

    //setter message
    public void setMessage(String msg) {
        this.message = msg;
    }

    //setter message ResponseDTO
    public void setResponseDTO(List<ResponseDTO> res) {
        this.response = res;
    }

    // printMessage 
    public void printMessage() {
        System.out.println(message);
    }

    

    // Display all processed expense information.
    public void printExpenseInformation() {
        System.out.println(String.format("%-20s%-20s%-20s%-20s","ID","Date","Amount of money","Content"));
        double total = 0;
        for(ResponseDTO res : response){
            total += res.getNumber();
            System.out.println(String.format("%-20s%-20s%-20s%-20s",res.getId(),res.getDate(),res.getNumber(),res.getContent()));
        }
        System.out.printf("Total: %.0f\n",total);
        
        
    }

}
