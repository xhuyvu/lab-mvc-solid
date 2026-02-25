package main;

import controller.ExpenseController;
import dto.*;
import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExpenseController controller = new ExpenseController();

        int choice;
        do {

            int line = 0;
            System.out.println("=====Handy Expense Program=====");
            System.out.println("1.Add an expense");
            System.out.println("2.Display all expenses");
            System.out.println("3.Delete an expense");
            System.out.println("4.quit");
            System.out.println("your choice: ");
            // get choice
            while (true) {
                try {
                    choice = util.Validation.getInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            // functions 1,2,3,4
            switch(choice) {
                case 1:
                    // load list data from utils
                    List<RequestDTO> data = util.FileUtils.load();
                    controller.setExpenseDTO(data);
                    controller.addExpense();

                    break;
                case 2:
                    // display all expense
                    controller.displayExpense();
                    break;
                case 3:
                    int id;
                    // get id needs remove
                    while (true) {
                        System.out.println("Enter id:");
                        try {
                            id = util.Validation.getInt(sc.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    RequestDTO resDTO = new RequestDTO();
                    resDTO.setId(id);
                    controller.removeExpense(resDTO.getId());
                    
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }
}
