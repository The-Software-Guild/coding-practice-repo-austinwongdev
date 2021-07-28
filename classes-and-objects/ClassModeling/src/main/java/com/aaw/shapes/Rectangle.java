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
public class Rectangle extends Shape {
    
    private float length;
    private float width;
    
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    public float getArea(){
        return (this.length * this.width);
    }
    
    @Override
    public float getPerimeter(){
        return 2*(this.length + this.width);
    }
    
}
