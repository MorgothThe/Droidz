package com.choewang.droidz;

public class Droid {
    private String name;
    private double batteryLevel;
    private String color;
    private double height;
    private User owner;
    private double maxSpeed;
    private double currentSpeed;

    public Droid(String name, String color, double height, User owner, double maxSpeed){
        this.name = name;
        this.color = color;
        this.height = height;
        this.owner = owner;
        this.maxSpeed = maxSpeed;
        batteryLevel = 0.0;
        currentSpeed = 0.0;
    }

    public String getName(){
        return this.name;
    }

    public double getBatteryLevel(){
        return this.batteryLevel;
    }

    public String getColor(){
        return this.color;
    }

    public double getHeight(){
        return this.height;
    }

    public User getOwner(){
        return this.owner;
    }

    public double getMaxSpeed(){
        return this.maxSpeed;
    }

    public double getCurrentSpeed(){
        return this.currentSpeed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBatteryLevel(double batteryLevel){
        this.batteryLevel = batteryLevel;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setOwner(User owner){
        this.owner = owner;
    }

    public void setMaxSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void setCurrentSpeed(double currentSpeed){
        this.currentSpeed = currentSpeed;
    }
}
