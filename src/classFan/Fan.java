package classFan;

public class Fan {
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setStatus(boolean status) {
        this.on = status;
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

    public String Showall() {

        if (this.isOn()) {
            return "Speed: " + this.getSpeed() + "\tColor: " + this.getColor() + "\tRadius: " + this.getRadius() + "\t Quạt bật";
        } else {
            return "Speed: " + this.getSpeed() + "\tColor: " + this.getColor() + "\tRadius: " + this.getRadius() + "\t Quạt tắt";
        }

    }
}
