/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import dto.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xhuyvu
 */
public final class FileUtils {

    private FileUtils() {
    }

    //load data from file
    public static List<RequestDTO> load() {
        List<RequestDTO> list = new ArrayList<>();
        try (BufferedReader rd = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            int lineNumber = 0;
            while ((line = rd.readLine()) != null) {
                lineNumber++;
                String[] element = line.split(",", -1);
                // check valid date
                if (!util.Validation.isDate(element[0])) {
                    System.out.println("Line " + lineNumber
                            + " - Invalid date: " + element[0]);
                    continue;
                }
                // check valid number
                if (!util.Validation.isNumber(element[1])) {
                    System.out.println("Line " + lineNumber
                            + " - Invalid number: " + element[1]);
                    continue;

                }
                // check valid content
                if (!util.Validation.isContent(element[2])) {
                    System.out.println("Line " + lineNumber
                            + " - Invalid content: " + element[2]);
                    continue;
                }
                String date = element[0];
                double number = Double.parseDouble(element[1]);
                String content = element[2];

                list.add(new RequestDTO(date, number, content));
            }

        } catch (Exception ex) {
            return new ArrayList<>();
        }
        return list;
    }
}
