/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author xhuyvu
 */
public class validator {

    public static double getDouble(String input) throws Exception {
        double data;

        if (input.isEmpty()) {
            throw new Exception("Input is not empty.");
        }
        
        try {
            data = Double.parseDouble(input);
        } catch (Exception ex) {
            throw new Exception("input must be a number.");
        }
        
        if(data<0){
            throw new Exception("input must greater than 0.");
        }
        return data;
    }

    public static void isTriangle(double sideA, double sideB, double sideC) throws Exception{
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new Exception("wrong side of triangle");
        }

    }
}
