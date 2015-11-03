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
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        testShapes();
       
    }

    private static void testShapes() {
        Circle myCircle = new Circle(5.5);
        
//        myCircle.setRadius(5.5);
//        
//        System.out.println("Circle");
//        System.out.printf("  radius = %.2f \n", myCircle.getRadius());
//        System.out.printf("  area = %.2f \n", myCircle.getArea());
//        System.out.printf("  circumference = %.2f \n", myCircle.getPerimeter());
//        System.out.printf("  diameter = %.2f \n", myCircle.getDiameter());

        Rectangle myRectangle = new Rectangle(1, 1);
//        System.out.println("Rectangle");
//        System.out.printf("  length = %.2f \n", myRectangle.getLength());
//        System.out.printf("  width %.2f \n", myRectangle.getWidth());
//        System.out.printf("  perimeter %.2f \n", myRectangle.getPerimeter());
        
        Triangle myTriangle = new Triangle(2.0, 2.0);
        System.out.println("Triangle");
        System.out.printf("  Area = %.2f \n", myTriangle.getArea());
        System.out.printf("  Base = %.2f \n", myTriangle.getBase());
        System.out.printf("  Height = %.2f \n", myTriangle.getHeight());
        
        
        
        
        
        
    }
        
    
}
