/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Jul 28, 2021
 * purpose: 
 */

package com.aaw.collections;

/**
 *
 * @author Austin Wong
 */
public class Capital {

    private String name;
    private int population;
    private float squareMileage;
    
    public Capital(String name, int population, float squareMileage){
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPopulation(){
        return this.population;
    }
    
    public float getSquareMileage(){
        return this.squareMileage;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPopulation(int population){
        this.population = population;
    }
    
    public void setSquareMileage(float squareMileage){
        this.squareMileage = squareMileage;
    }
    
    public String getInfo(){
        String sep = " | ";
        String capitalInfo = this.getName() + sep
                + "Pop: "+ this.getPopulation() + sep
                + "Area: " + this.getSquareMileage() + " sq mi";
        return capitalInfo;
    }
    
}
