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
public abstract class Shape {

    protected String color;
    public static final float PI = 3.14f;
    
    public Shape(){
    }
    
    public abstract float getArea();
    public abstract float getPerimeter();
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
}
