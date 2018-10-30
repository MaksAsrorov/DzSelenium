import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class Parameters
 {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 1, 1 }, { 2, 2 , 4}, { 2, 1, 2}
        });
    }

    @Parameterized.Parameter // first data value (0) is default
    public /* NOT private */ float a;

    @Parameterized.Parameter(1)
    public /* NOT private */ float b;

    @Parameterized.Parameter(2)
    public /* NOT private */ float result;

    @Test
    public void test() {
        assertEquals(result, new Rectangle(a, b).GetArea(2,3), 0);
    }


}

