public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.141592653589793D;
    }

    public double getDiameter() {
        return 2.0D * this.radius;
    }

    public double getPerimeter() {
        return 2.0D * this.radius * 3.141592653589793D;
    }

    public void printCircle() {
        System.out.println("The circle is created " + this.getDateCreated() + " and the radius is " + this.radius);
    }
}
