import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    Triangle triangle = new Triangle(2,3,4);

    @Test
    public void testAreaT() {
        assertEquals(2, triangle.GetArea(3, 3, 3));
    }

    @Test
    public void testPerimeterT() {
        assertEquals(15, triangle.GetPerimeter(3, 3, 9));

    }

}
