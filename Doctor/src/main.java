
import controller.DoctorController;
import java.util.Scanner;
import dto.*;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoctorController controller = new DoctorController();

        int choice;
        String code;
        String name;
        String specialization;
        int availability;

        // l
        do {
            System.out.println("====== Doctor Management =====");
            System.out.println("1.Add Doctor");
            System.out.println("2.Update Doctor");
            System.out.println("3.Delete Doctor");
            System.out.println("4.Search Doctor");
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
                // function 1: add doctor
                case 1:
                    System.out.println("------Add Doctor-----");
                    // get valid name
                    while (true) {
                        try {
                            System.out.println("Enter code:");
                            code = utils.Validation.getString(sc.nextLine());
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

                    // get valid specialization
                    while (true) {
                        try {
                            System.out.println("Enter specialization:");
                            specialization = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    // get valid availability
                    while (true) {
                        try {
                            System.out.println("Enter availability:");
                            availability = utils.Validation.getInt(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    // using dto 
                    RequestDTO reqDTO = new RequestDTO(code, name, specialization, availability);

                    controller.setRequestDTO(reqDTO);
                    controller.addDoctor();
                    break;
                case 2:
                    System.out.println("------Update Doctor-----");
                    // get valid code
                    while (true) {
                        try {
                            System.out.println("Enter code:");
                            code = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    // get valid name
                    while (true) {
                        try {
                            System.out.println("Enter name:");
                            name = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    // get valid specialization
                    while (true) {
                        try {
                            System.out.println("Enter specialization:");
                            specialization = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    // get valid availability
                    while (true) {
                        try {
                            System.out.println("Enter availability:");
                            availability = utils.Validation.getInt(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    // using dto 
                    RequestDTO updateDTO = new RequestDTO(code, name, specialization, availability);

                    controller.setRequestDTO(updateDTO);
                    controller.updateDoctor();
                    break;
                case 3:
                    System.out.println("------Delete Doctor-----");
                    // get valid availability
                    System.out.println("Enter code:");
                    String removeId;
                    while (true) {
                        try {
                            removeId = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }

                    RequestDTO deleteDto = new RequestDTO();
                    deleteDto.setRemoveId(removeId);
                    controller.setRequestDTO(deleteDto);
                    controller.deleteDoctor();
                    break;
                case 4:
                    System.out.println("------Search Doctor-----");
                    System.out.println("Enter String:");
                    // get input
                    while (true) {
                        try {
                            code = utils.Validation.getString(sc.nextLine());
                            break;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    RequestDTO searchDto = new RequestDTO();
                    searchDto.setInfo(code);
                    controller.setRequestDTO(searchDto);
                    controller.SearchDoctor();
                    break;
                case 5:
                    break;
            }

        } while (choice != 5);
    }
}
