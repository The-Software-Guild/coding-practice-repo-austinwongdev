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
public class Triangle extends Shape {

    private float base;
    private float height;
    private float side1;
    private float side2;
    
    public Triangle(float base, float height, float side1, float side2){
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    
    @Override
    public float getArea(){
        return (0.5f * this.base * this.height);
    }
    
    @Override
    public float getPerimeter(){
        return (this.side1 + this.side2 + this.base);
    }
    
}
