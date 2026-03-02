
import dto.RequestDTO;
import java.util.Scanner;
import controller.WorkerController;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        WorkerController controller = new WorkerController();

        int choice;
        String id;
        String name;
        int age;
        double salary;
        String workLocation;
        double amount;
        // l
        do {
            System.out.println("====== Worker Management =====");
            System.out.println("1.Add Worker");
            System.out.println("2.Increase Salary");
            System.out.println("3.Decrease Salary");
            System.out.println("4.Display salary infomation");
            System.out.println("5.Exit");
            System.out.println("Enter choice:");
            //enter choice until input is valid
            while (true) {
                try {
                    choice = utils.Validation.getInt(sc.nextLine());
                    break;
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            //function 1,2,3,4
            switch (choice) {
                // function 1: add Worker
                case 1:
                    System.out.println("------Add Worker-----");
                    // get valid id
                    while (true) {
                        try {
                            System.out.println("Enter id:");
                            id = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    // get valid name
                    while (true) {
                        try {
                            System.out.println("Enter Name:");
                            name = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    // get valid age
                    while (true) {
                        try {
                            System.out.println("Enter Age:");
                            age = utils.Validation.getInt(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    // get valid salary
                    while (true) {
                        try {
                            System.out.println("Enter Salary:");
                            salary = utils.Validation.getDouble(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    // get valid workLocation
                    while (true) {
                        try {
                            System.out.println("Enter work location:");
                            workLocation = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    RequestDTO req = new RequestDTO(id, name, age, salary, workLocation);
                    controller.setRequestDTO(req);
                    controller.addWorker();
                    break;
                case 2:
                    System.out.println("------Increase Salary-----");
                    while (true) {
                        try {
                            System.out.println("Enter code:");
                            id = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    // get valid amount
                    while (true) {
                        try {
                            System.out.println("Enter amount:");
                            amount = utils.Validation.getDouble(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    RequestDTO dtoI = new RequestDTO();
                    dtoI.setId(id);
                    dtoI.setAmount(amount);
                    controller.setRequestDTO(dtoI);
                    controller.increaseSalary();
                    break;
                case 3:
                    System.out.println("------Decrease Salary-----");
                    while (true) {
                        try {
                            System.out.println("Enter code:");
                            id = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    // get valid amount
                    while (true) {
                        try {
                            System.out.println("Enter amount:");
                            amount = utils.Validation.getDouble(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    RequestDTO dtoD = new RequestDTO();
                    dtoD.setId(id);
                    dtoD.setAmount(amount);
                    controller.setRequestDTO(dtoD);
                    controller.decreaseSalary();

                    break;
                // function 4: show history
                case 4:
                    controller.displayInformation();
                    break;
                case 5:
                    break;
            }

        } while (choice != 5);
    }
}
