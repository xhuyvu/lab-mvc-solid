
import controller.ShapeController;
import java.util.Scanner;
import dto.*;
import model.Circle;
import model.Recangle;
import model.Triangle;
import utils.validator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author xhuyvu
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=======Caculator Shape Program====");

        double width, length;
        // ======= witdh =====
        while (true) {
            try {
                System.out.println("Please enter side width of Rectangle.");
                width = utils.validator.getDouble(sc.nextLine());
                System.out.println("Please enter side length of Rectangle:");
                length = utils.validator.getDouble(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        RectangleDTO rectangleDTO = new RectangleDTO(width, length);

        double radius;

        while (true) {
            try {
                System.out.println("Please enter  radius of circle:");
                radius = utils.validator.getDouble(sc.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        CircleDTO circleDTO = new CircleDTO(radius);

        double sideA, sideB, sideC;

        while (true) {
            try {
                System.out.println("Please enter side sideA of triangle:");
                sideA = utils.validator.getDouble(sc.nextLine());

                System.out.println("Please enter side sideB of triangle:");
                sideB = utils.validator.getDouble(sc.nextLine());

                System.out.println("Please enter side sideC of triangle:");
                sideC = utils.validator.getDouble(sc.nextLine());
                validator.isTriangle(sideA, sideB, sideC);
                break;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        TriangleDTO triangleDTO = new TriangleDTO(sideA, sideB, sideC);

        ShapeController controller = new ShapeController();
        controller.ShapeExecute(new Recangle(rectangleDTO.getWidth(), rectangleDTO.getLength()));
        controller.ShapeExecute(new Circle(circleDTO.getRadius()));

        controller.ShapeExecute(new Triangle(triangleDTO.getSideA(), triangleDTO.getSideB(), triangleDTO.getSideC()));

    }
}
