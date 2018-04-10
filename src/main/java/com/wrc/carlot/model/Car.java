/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wrc.carlot.model;

/**
 *
 * @author craig
 */
public abstract class Car {

   

    
    int carID;
    String fuelType;
    String carType;
    int fuelLevel=14;
    int currentPrice=20000;
    double discountPercent=.20;
    int lotNumber;
    
    public void beep(){
        System.out.println("Beep");
    }
    public void drive(){
        System.out.println("Zoom");
        this.setFuelLevel(fuelLevel - 3);
        if (this.fuelLevel<=0) {
            System.out.println("Oh No, you are out of fuel");
        }
        
    }
    
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
     public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    } 
    
}
