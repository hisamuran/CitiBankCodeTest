
public class AreaVisitor implements AreaVisitorInterface {
    public double visit(Circle circle) {
        //Area = PI*radius*radius
        double area = Math.PI * (circle.getRadius() * circle.getRadius());
        System.out.println("The area of circle is: " + area);
        return area;
    }

    public double visit(Triangle triangle) {
        //Area = (width*height)/2
        double area = (triangle.getSideB()* triangle.getHeightB())/2;
        System.out.println("Area of Triangle is: " + area);
        return area;
    }

    public double visit(Rectangle rectangle) {
        //Area = length*width;
        double area = rectangle.getLength()*rectangle.getWidth();
        System.out.println("Area of Rectangle is:"+area);
        return area;
    }

}
