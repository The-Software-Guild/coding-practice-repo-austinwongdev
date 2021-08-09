/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 3, 2021
 * purpose: 
 */

package com.aaw.carlotservicelayer.dao;

import com.aaw.carlotservicelayer.dto.Car;
import java.util.List;

/**
 *
 * @author Austin Wong
 */
public interface CarLotDAO {

    public Car addCar(String VIN, Car car);
    
    public Car getCar(String VIN);
    
    public List<Car> getCars();
    
    public void editCar(String VIN, Car car);
    
    public Car removeCar(String VIN);
}
