/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author josak
 */
public class Foot {
    public void draw(){
        FootShape s = new FootShape();
        Scanner sc = new Scanner(System.in);
        System.out.print("What to draw 1. Ellipse, 2. Rectangle ");
        int type = sc.nextInt();
        switch(type) {
            case 1:
                s.drawAsEllipse();
                break;
            case 2:
                s.drawAsRectangle();
                break;
        }
        System.out.println(s.shape);
        }

       public static void main(String [] args){
       Foot f = new Foot();
       f.draw();
    }
    
     
}
