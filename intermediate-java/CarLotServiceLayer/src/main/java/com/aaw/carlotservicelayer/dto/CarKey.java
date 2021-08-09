/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 3, 2021
 * purpose: 
 */

package com.aaw.carlotservicelayer.dto;

/**
 *
 * @author Austin Wong
 */
public class CarKey {

    private String VIN;
    private boolean laserCut;
    
    public CarKey(String VIN){
        this.VIN = VIN;
    }
    
    public CarKey(String VIN, boolean laserCut){
        this.VIN = VIN;
        this.laserCut = laserCut;
    }
    
    public String getVIN(){
        return this.VIN;
    }
    
    public boolean isLaserCut(){
        return laserCut;
    }
    
    public void setLaserCut(boolean isLaserCut){
        this.laserCut = isLaserCut;
    }
    
}
