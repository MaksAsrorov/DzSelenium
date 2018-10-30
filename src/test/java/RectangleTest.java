import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(2,3);

    @Test
    public void testArea() {
        assertEquals(9, rectangle.GetArea(3, 3));
    }

    @Test
    public void testPerimeter() {
        assertEquals(12, rectangle.GetPerimeter(3, 3));
    }


}
