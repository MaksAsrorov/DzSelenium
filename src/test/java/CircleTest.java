import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    Circle circle = new Circle(2);

    @Test
    public void testAreaC() {
        assertEquals(28.26, circle.GetArea(3.0), 0);
    }

    @Test
    public void testPerimeterC() {
        assertEquals(18.84, circle.GetPerimeter(3.00), 0);
    }

}
