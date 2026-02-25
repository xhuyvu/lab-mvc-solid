package controller;

import constant.Message;
import dto.*;
import java.util.List;
//import model.Expense;
import service.ExpenseService;

import view.ExpenseView;

/**
 *
 * @author xhuyvu
 */
public class ExpenseController {

    private ExpenseView view = new ExpenseView();
    private ExpenseService service = new ExpenseService();
    private List<RequestDTO> expenseDTO;

    //method setter expenseDTO
    public void setExpenseDTO(List<RequestDTO> expenseDTO) {
        this.expenseDTO = expenseDTO;
    }

    //function one : add expense
    public void addExpense() {
        // add all valid expense from dto
        for (RequestDTO dto : expenseDTO) {
            if (service.addAnExpense(dto)) {
                view.setMessage(constant.Message.MSG_ADD_SUCCESSFULLY);
                view.printMessage();
            } else {
                view.setMessage(Message.MSG_ADD_FAILED);
                view.printMessage();
            }
        }
    }

    // function two : show all information and total number
    public void displayExpense() {
        List<ResponseDTO> resDTO = service.showAll();
        view.setResponseDTO(resDTO);
        view.printExpenseInformation();
    }

    // function three: delete an expense by id
    public void removeExpense(int id) {

        if (service.removeExpense(id)) {
            view.setMessage(constant.Message.MSG_REMOVE_SUCCESSFULLY);
            view.printMessage();
        } else {
            view.setMessage(constant.Message.MSG_REMOVE_FAILED);
            view.printMessage();
        }
    }

}
