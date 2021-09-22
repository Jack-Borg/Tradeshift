package Tests;

import com.mycompany.tradeshift.Triangle;
import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testEquilateral() throws Exception {
        Triangle t = new Triangle(1, 1, 1);

        assertEquals(Triangle.Type.Equilateral, t.getType());
    }

    @Test
    public void testIsosceles() throws Exception {
        Triangle t = new Triangle(1, 2, 2);

        assertEquals(Triangle.Type.Isosceles, t.getType());
    }

    @Test
    public void testSceles() throws Exception {
        Triangle t = new Triangle(4, 2, 3);

        assertEquals(Triangle.Type.Scalene, t.getType());
    }

    @Test(expected = Exception.class)
    public void testExceptionSmallLength() throws Exception {
        Triangle t = new Triangle(0, 1, 1);
    }

    //if the length of the two shorter legs is lower or equal to the longest leg
    //the triangle cannot be valid
    @Test(expected = Exception.class)
    public void testExceptionHighLength() throws Exception {
        Triangle t = new Triangle(1, 1, 10);
    }
}
