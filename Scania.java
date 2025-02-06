import java.awt.*;

public class Scania extends Car{

    private double torque;
    private double trunkAngle;

    public Scania() {
        super(2, Color.pink, 125, "Scania");
        torque = 950;
        trunkAngle = 0;
    }

    public void setTrunkAngle(double amount)    {
        double newAngle = (trunkAngle + amount);

        if(newAngle < 0 || newAngle > 70)   {
            //exception
        } else if(getCurrentSpeed()!=0) {
            //exception
        } else {
            trunkAngle = newAngle;
        }
    }

    // använd super.gas()

    if trunkAngle < 0 {
        
    }

}