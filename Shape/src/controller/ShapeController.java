/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.ShapeView;
import model.*;
/**
 *
 * @author xhuyvu
 */
public class ShapeController {
    private ShapeView view =  new ShapeView();;
   
    public void ShapeExecute(IShape shape){
        view.setBody(shape.toString());
        view.displayBody();
    }
    
    
}
