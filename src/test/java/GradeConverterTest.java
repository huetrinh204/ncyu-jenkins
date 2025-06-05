import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {

    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    // A: 90-100
    @Test
    public void testConvert_A_UpperBoundary() {
        assertEquals("A", converter.convert(100));
    }

    @Test
    public void testConvert_A_LowerBoundary() {
        assertEquals("A", converter.convert(90));
    }

    @Test
    public void testConvert_A_Mid() {
        assertEquals("A", converter.convert(95));
    }

    // B: 80-89
    @Test
    public void testConvert_B_UpperBoundary() {
        assertEquals("B", converter.convert(89));
    }

    @Test
    public void testConvert_B_LowerBoundary() {
        assertEquals("B", converter.convert(80));
    }

    @Test
    public void testConvert_B_Mid() {
        assertEquals("B", converter.convert(85));
    }

    // C: 70-79
    @Test
    public void testConvert_C_UpperBoundary() {
        assertEquals("C", converter.convert(79));
    }

    @Test
    public void testConvert_C_LowerBoundary() {
        assertEquals("C", converter.convert(70));
    }

    @Test
    public void testConvert_C_Mid() {
        assertEquals("C", converter.convert(75));
    }

    // D: 60-69
    @Test
    public void testConvert_D_UpperBoundary() {
        assertEquals("D", converter.convert(69));
    }

    @Test
    public void testConvert_D_LowerBoundary() {
        assertEquals("D", converter.convert(60));
    }

    @Test
    public void testConvert_D_Mid() {
        assertEquals("D", converter.convert(65));
    }

    // E: 0-59
    @Test
    public void testConvert_E_UpperBoundary() {
        assertEquals("E", converter.convert(59));
    }

    @Test
    public void testConvert_E_LowerBoundary() {
        assertEquals("E", converter.convert(0));
    }

    @Test
    public void testConvert_E_Mid() {
        assertEquals("E", converter.convert(30));
    }

    // Invalid: <0 and >100

    @Test
    public void testConvert_Invalid_Negative() {
        assertEquals("Invalid", converter.convert(-1));
    }

    @Test
    public void testConvert_Invalid_Above100() {
        assertEquals("Invalid", converter.convert(101));
    }

    @Test
    public void testConvert_Invalid_VeryHigh() {
        assertEquals("Invalid", converter.convert(1000));
    }



}