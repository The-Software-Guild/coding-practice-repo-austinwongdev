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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Austin Wong
 */
public class CarLotServiceImpl implements CarLotService {

    Map<String, Car> carLot = new HashMap<String, Car>();
    
    public CarLotServiceImpl(){
        
    }
    
    @Override
    public Car getACar(String VIN){
        return carLot.get(VIN);
    }
    
    @Override
    public List<Car> getAllCars(){
        return new ArrayList<Car>(carLot.values());
    }
    
    @Override
    public List<Car> getCarsByColor(String color){
        List<Car> carsOfSpecifiedColor = new ArrayList<Car>();
        for (Car car : getAllCars()){
            if (car.getColor().equals(color)){
                carsOfSpecifiedColor.add(car);
            }
        }
        return carsOfSpecifiedColor;
    }
    
    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice){
        List<Car> carsOfSpecifiedBudget = new ArrayList<Car>();
        for (Car car : getAllCars()){
            if (car.getPrice().compareTo(maxPrice) <= 0){
                carsOfSpecifiedBudget.add(car);
            }
        }
        return carsOfSpecifiedBudget;
    }
    
    @Override
    public List<Car> getCarByMakeAndModel(String make, String model){
        List<Car> carsOfSpecifiedMakeAndModel = new ArrayList<Car>();
        for (Car car : getAllCars()){
            if (car.getMake().equals(make) && car.getModel().equals(model)){
                carsOfSpecifiedMakeAndModel.add(car);
            }
        }
        return carsOfSpecifiedMakeAndModel;
    }
    
    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) 
            throws NoSuchCarException{
        Car car = getACar(VIN);
        if (car == null){
            throw new NoSuchCarException("Car doesn't exist.");
        }
        BigDecimal decimalDiscount = 
                percentDiscount.divide(new BigDecimal("100"));
        BigDecimal newPrice = 
                car.getPrice().multiply((new BigDecimal("1")).subtract(decimalDiscount));
        car.setPrice(newPrice);
        return newPrice;
    }
    
    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid)
            throws NoSuchCarException,
            OverpaidPriceException,
            UnderpaidPriceException{
        Car car= getACar(VIN);
        if (car == null){
            throw new NoSuchCarException("Car doesn't exist.");
        }
        BigDecimal carPrice = car.getPrice();
        int priceCashComparison = carPrice.compareTo(cashPaid);
        switch (priceCashComparison){
            case -1:
                throw new OverpaidPriceException("Paid too much.");
            case 0:
                carLot.remove(car);
                return car.getCarKey();
            case 1:
                throw new UnderpaidPriceException("Not enough cash.");
            default:
                return null;
        }
    }
    
}
