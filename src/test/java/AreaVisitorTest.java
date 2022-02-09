import com.sun.xml.internal.ws.api.server.EndpointReferenceExtensionContributor;
import org.junit.Test;

import java.awt.geom.Area;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AreaVisitorTest {


    @Test
    public void areaCalculationTest() {

        Triangle triangle1 = new Triangle(2,3,4,1.94);
        Triangle triangle2 = new Triangle(1,1,1,0.87);

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);

        Rectangle rectangle1 = new Rectangle(5,4);
        Rectangle rectangle2 = new Rectangle(2,3);

        AreaVisitor areaVisitor = new AreaVisitor();

        assertEquals(areaVisitor.visit(triangle1),2.91);
        assertEquals(areaVisitor.visit(triangle2), 0.435);
        assertEquals(areaVisitor.visit(circle1),78.53981633974483);
        assertEquals(areaVisitor.visit(circle2), 314.1592653589793);
        assertEquals(areaVisitor.visit(rectangle1), 20.0);
        assertEquals(areaVisitor.visit(rectangle2), 6.0);

    }

}
