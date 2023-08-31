package circlevacylinder;

public class Cylinder extends Circle {
    private double height = 10.0;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*height;
    }

    @Override
    public String toString() {
        return "Ban kinh hinh tru la" + getRadius()
                +"mau la" + getColor() +
                "co the tich la " + getVolume();
    }
}
