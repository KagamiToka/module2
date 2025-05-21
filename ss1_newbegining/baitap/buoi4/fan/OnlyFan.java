package baitap.buoi4.fan;

public class OnlyFan {
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    private int speed = LOW;
    private boolean ON = false;
    private double radius = 5;
    private  String color;

    public OnlyFan() {
    }

    public OnlyFan(int speed, boolean ON, double radius, String color) {
        this.speed = speed;
        this.ON = ON;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = LOW;
    }

    public boolean isON() {
        return ON;
    }

    public void setON(boolean ON) {
        this.ON = ON;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public String setSpeed(int speed) {
//        String result;
//        if (speed == LOW) {
//            result = "Speed is low";
//        } else if (speed == MEDIUM) {
//            result = "Speed is medium";
//        } else if (speed == HIGH) {
//            result = "Speed is high";
//        } else {
//            result = "Speed is invalid";
//        }
//        return result;
//    }

    public String getFanType() {
        if (this.ON == true) {
            return "ON";
        } else {
            return "OFF";
        }
    }

    @Override
    public String toString() {
        if (getFanType().equals("ON")) {
            return "Fan is ON with color " + color + " and radius " + radius + " and speed " + speed;
        } else {
            return "Fan is OFF";
        }
    }
}
