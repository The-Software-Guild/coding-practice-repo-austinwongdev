/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 3, 2021
 * purpose: 
 */

package com.aaw.carlotservicelayer.dto;

import java.math.BigDecimal;

/**
 *
 * @author Austin Wong
 */
public class Car {
    
    private String VIN;
    private String make;
    private String model;
    private String color;
    
    private BigDecimal price;
    private long odometerMiles;
    
    private CarKey key;
    
    public Car(String VIN){
        this.VIN = VIN;
        this.key = new CarKey(VIN);
    }
    
//    public Car(String VIN, String make, String model, String color){
//        this.VIN = VIN;
//        this.make = make;
//        this.model= model;
//        this.color = color;
//    }
//    
//    public Car(String VIN, String make, String model, String color,
//            BigDecimal price, long odometerMiles){
//        this.VIN = VIN;
//        this.make = make;
//        this.model= model;
//        this.color = color;
//        this.price = price;
//        this.odometerMiles = odometerMiles;
//    }
    
    public String getVIN(){
        return this.VIN;
    }
    
    public String getMake(){
        return this.make;
    }
    
    public String getModel(){
        return this.model;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public BigDecimal getPrice(){
        return this.price;
    }
    
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    
    public long getOdometerMiles(){
        return this.odometerMiles;
    }
    
    public void setOdometerMiles(long odometerMiles){
        this.odometerMiles = odometerMiles;
    }
    
    public CarKey getCarKey(){
        return this.key;
    }
    
    public void setCarKey(CarKey key){
        this.key = key;
    }
}
