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
public class Circle extends Shape{

    private float radius;
    
    public Circle(float radius){
        this.radius = radius;
    }
    
    @Override
    public float getArea(){
        return (PI * radius * radius);
    }
    
    @Override
    public float getPerimeter(){
        return (2 * PI * radius);
    }
}
