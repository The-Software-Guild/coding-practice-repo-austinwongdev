/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 27, 2021
 * purpose: 
 */

package com.aaw.shapes;

/**
 *
 * @author Austin Wong
 */
public class App {
    public static void main(String[] args){
        
        // Doesn't work because Shape is abstract
        // Shape shape = new Shape();
        
        // Referenced as Subclass
        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(3, 5);
        Triangle triangle = new Triangle(3, 6, 4, 5);
        Circle circle = new Circle(6);
        
        Shape[] shapes = {square, rectangle, triangle, circle};
        
        // Referenced as Shape (Superclass)
        Shape square2 = new Square(3);
        Shape rectangle2 = new Rectangle(3, 5);
        Shape triangle2 = new Triangle(3,6,4,5);
        Shape circle2 = new Circle(6);
        
        Shape[] shapes2 = {square2, rectangle2, triangle2, circle2};
        
        System.out.println("REFERENCED AS SUBCLASS\n");
        printShapeData(shapes);
        System.out.println("REFERENCED AS SUPERCLASS\n");
        printShapeData(shapes2);
    }
    
    public static void printShapeData(Shape[] shapes){
        for (int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i].getClass().getName());
            System.out.println("Area: " + shapes[i].getArea());
            System.out.println("Perimeter: " + shapes[i].getPerimeter() + "\n");
        }
    }
    
}
