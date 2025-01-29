import java.awt.*;

public abstract class Car implements Movable{
    protected int nrDoors;
    protected double enginePower;
    protected double currentSpeed;
    protected Color color;
    protected String modelName;
    protected int dirIndex;
    protected double x;
    protected double y;

    public Car(int drs, Color clr, double engPow, String modName){
        nrDoors = drs;
        color = clr;
        enginePower = engPow;
        modelName = modName;
        dirIndex = 0;
        x = 0;
        y = 0;
        stopEngine();
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    @Override
    public void turnLeft(){
        dirIndex = (dirIndex + 3) % 4;
    }

    @Override
    public void turnRight(){
        dirIndex = (dirIndex + 1) % 4;
    }

    @Override
    public void move(){
        switch(dirIndex){
            case 0:
                y += currentSpeed;
                break;
            case 1:
                x += currentSpeed;
                break;
            case 2:
                y -= currentSpeed;
                break;
            case 3:
                x -= currentSpeed;
                break;
        }
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    protected abstract double speedFactor();

    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);

    public void gas(double amount){
        incrementSpeed(amount);
    }

    public void brake(double amount){
        decrementSpeed(amount);
    }
    
}