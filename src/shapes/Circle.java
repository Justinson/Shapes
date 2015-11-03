package shapes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justinson
 */
public class Circle {
  
    public Circle(double radius){
       this.radius = radius;
   }
    
    
    private double radius; 

    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getDiameter(){
        return radius * 2;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

}




