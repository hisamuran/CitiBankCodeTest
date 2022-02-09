import sun.reflect.generics.visitor.Visitor;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double heightB;

    public Triangle(double sideA, double sideB, double sideC, double heightB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightB = heightB;
    }

    public void accept(Visitor v) {
    }

    public double getSideA() {
        return this.sideA;
    }
    public void setSideA(double a) {
        this.sideA = a;
    }

    public double getSideB() {
        return this.sideB;
    }
    public void setSideB(double b) {
        this.sideA = b;
    }

    public double getSideC() {
        return this.sideC;
    }
    public void setSideC(double c) {
        this.sideA = c;
    }

    public double getHeightB() {
        return this.heightB;
    }
    public void setHeightB(double hb) {
        this.heightB = hb;
    }

}