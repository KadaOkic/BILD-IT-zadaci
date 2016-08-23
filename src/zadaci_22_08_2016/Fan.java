package zadaci_22_08_2016;

public class Fan {

	// fan speed variables
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    // Other fan variables
    private int speed;
    private boolean on; // true means on
    private double radius;  // radius of fan
    String color;

    // No-arg constructor
    Fan(){
    	speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    // setter methods
    public void setSpeed(int newSpeed){
        if(newSpeed < 0)
            System.out.println("Illegal speed!");
        else
            speed = newSpeed;
    }

    public void setOn(boolean newOn){
         on = newOn;
    }

    public void setRadius(int newRadius){
        if(newRadius < 0)
            System.out.println("Illegal radius!");
        else 
            radius = newRadius;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    // getter methods
    public int getSpeed(){
        return speed;
    }

    public boolean getOn(){
        return on;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    // toString method to output Fan data
    public String toString(){
        if(on)
        	return "Fan Properties:\n" + "Fan speed: " + speed + "\n"
        	+ "Color: " + color + "\n"
        	+ "Radius: " + radius + "\n";
        else
			return "Color: " + color + " Radius: " + radius + " .Fan is OFF.";
	}

}
