/*
 * @author Austin Wong
 * email: austinwongdev@gmail.com
 * date: Aug 3, 2021
 * purpose: 
 */

package com.aaw.carlotservicelayer.service;

import com.aaw.carlotservicelayer.dto.Car;
import com.aaw.carlotservicelayer.dto.CarKey;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Austin Wong
 */
public interface CarLotService {

    public Car getACar(String VIN);
    public List<Car> getAllCars();
    public List<Car> getCarsByColor(String color);
    public List<Car> getCarsInBudget(BigDecimal maxPrice);
    public List<Car> getCarByMakeAndModel(String make, String model);
    
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) 
            throws NoSuchCarException;
    
    public CarKey sellCar(String VIN, BigDecimal cashPaid)
            throws NoSuchCarException,
            OverpaidPriceException,
            UnderpaidPriceException;
    
}
