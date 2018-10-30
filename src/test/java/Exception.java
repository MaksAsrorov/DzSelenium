import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class Exception {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testRule(){
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("стороны должны быть положительным числом!");
        new Rectangle(1, 0);
    }

    @Test(expected = IllegalFigureParamException.class)
    public void rectangleTest() {
        new Rectangle(1, 0);
    }


    @Test
    public void testExceptionMessage() {
        try {
            new Rectangle(1, 0);
            fail("Expected an IllegalFigureParamException to be thrown");
        } catch (IllegalFigureParamException e) {
            assertThat(e.getMessage(), is("стороны должны быть положительным числом!"));
        }
    }
}

