/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author josak
 */
public class FootShape {
    public String shape;
    
    public void drawAsEllipse(){
        Ellipse ellipse = new Ellipse();
        shape = ellipse.draw();
    }
    
    public void drawAsRectangle(){
        Rectangle rectangle = new Rectangle();
        shape = rectangle.draw();
    }
    
}
