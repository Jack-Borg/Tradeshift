/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import com.mycompany.tradeshift.Triangle;
import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

//    @Test
//    public void testEquilateral() throws Exception {
//        int[] lengths = new int[]{1,1,1};
//
//        assertEquals(Triangle.Type.Equilateral, Triangle.getType(lengths));
//    }
//    
//    @Test
//    public void testIsosceles() throws Exception {
//        int[] lengths = new int[]{1,1,2};
//
//        assertEquals(Triangle.Type.Isosceles, Triangle.getType(lengths));
//    }
//    
//    @Test
//    public void testSceles() throws Exception {
//        int[] lengths = new int[]{1,2,3};
//
//        assertEquals(Triangle.Type.Scalene, Triangle.getType(lengths));
//    }
    @Test
    public void testEquilateral() throws Exception {
        Triangle t = new Triangle(1, 1, 1);

        assertEquals(Triangle.Type.Equilateral, t.getType());
    }

    @Test
    public void testIsosceles() throws Exception {
        Triangle t = new Triangle(1, 1, 2);

        assertEquals(Triangle.Type.Isosceles, t.getType());
    }

    @Test
    public void testSceles() throws Exception {
        Triangle t = new Triangle(1, 2, 3);

        assertEquals(Triangle.Type.Scalene, t.getType());
    }
}
