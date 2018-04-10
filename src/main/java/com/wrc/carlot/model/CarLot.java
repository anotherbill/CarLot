/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wrc.carlot.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author craig
 */
public class CarLot {
   private static int carIdCounter = 0;
   public Map<Integer,Car> cars = new HashMap(); 
   public void addCar (Car car){
        car.setCarID(carIdCounter++);
        cars.put(carIdCounter, car);
   }
   public List<Car> listall(){
       Collection<Car> c = cars.values();
        return new ArrayList(c);
       
   }
    
}
