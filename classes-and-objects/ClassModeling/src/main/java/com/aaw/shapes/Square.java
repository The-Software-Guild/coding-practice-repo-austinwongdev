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
public class Square extends Shape {
    
    private float length;
    
    public Square(float length){
        this.length = length;
    }
    
    @Override
    public float getArea(){
        return (this.length * this.length);
    }
    
    @Override
    public float getPerimeter(){
        return (4 * this.length);
    }
}
