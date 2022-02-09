import sun.reflect.generics.visitor.Visitor;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void accept(Visitor v) {

    }

    public double getWidth() {
        return this.width;
    }
    public void setWidth(double w) {
        this.width = w;
    }

    public double getLength() {
        return this.length;
    }
    public void setLength(double l) {
        this.length = l;
    }

}