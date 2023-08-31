package circlevacylinder;

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Ban kinh hinh tron la" +
                getRadius() +
                " mau la " + getColor()  +
                " co dien tich la " + getArea();
    }
}
