package CSC1009_Lab.Lab_2;

public class Circle {
    // Constants (static + final)
    // static -> variable applies to every object
    // final -> value will not change
    static final double PI = 3.14159;

    // Attributes
    // private (-), default (), protected (#), public (+)
    private double radius;
    private double area;

    // Operations
    // Default Constructor
    // (note: if no parameters are passed in)
    public Circle() {
        // Radius of a default circle shall be '10'
        this.radius = 10;
        this.area = getArea(10);
    }

    public Circle(double r) {
        this.radius = r;
        this.area = getArea(r);
    }

    // Getters
    public double getRadius() { return this.radius; }

    public double getArea() { return this.area; }

    // Setters
    // (note: area should not be set)
    public void setRadius(double r) { this.radius = r; }

    // A function to return the area of a circle
    // if the radius is provided
    public double getArea(double r) {
        return r * r * PI;
    }
}
