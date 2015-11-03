/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Justinson
 */
public class Triangle {
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
        
    }
    
    private double base, height;
    
    public double getBase(){
        return base;
        
         
    }
    public void setBase(double base){
        this.base = base;
       
    }
    public double getArea(){
        return base * height * 2.0;
        
    }
    public void setHeight(double height){
        this.height = height;
        
    }
    
    public double getHeight(){
        return height;
       
    }
    
}