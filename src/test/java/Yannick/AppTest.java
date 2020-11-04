package Yannick;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    /**
	 * donner le dernier jour du mois
	 */
	@Test
	public void isLeapYear() {
		assertEquals(true, App.isLeapYear(1584));
		assertEquals(false, App.isLeapYear(1789));
		assertEquals(false, App.isLeapYear(2003));
		assertEquals(true, App.isLeapYear(2004));
		assertEquals(false, App.isLeapYear(2100));
		assertEquals(true, App.isLeapYear(2216));
    }
    
    @Test
	public void compute() {
        assertEquals("1", App.compute(1));
        assertEquals("FooFoo", App.compute(3));
        assertEquals("BarBar", App.compute(5));
        assertEquals("Foo", App.compute(9));
        assertEquals("FooBarBar", App.compute(15));
        assertEquals("FooQix", App.compute(21));
        assertEquals("FooFooFoo", App.compute(33));
        assertEquals("BarFoo", App.compute(53));
        assertEquals("1*1", App.compute(101));
        assertEquals("FooFoo*Foo", App.compute(303));
        assertEquals("FooBarQix*Bar", App.compute(105));
        assertEquals("FooQix**", App.compute(10101));
    }
    
    @Test
	public void writeNumbre() {
        assertEquals("nine dollars.", App.writeNumber(9));
        assertEquals("seventeen dollars.", App.writeNumber(17));
        assertEquals("one hundred and one dollars.", App.writeNumber(101));
        assertEquals("one thousand dollars.", App.writeNumber(1000));
        assertEquals("ten thousand and one hundred and one dollars.", App.writeNumber(10101));
        assertEquals("two billion and one hundred fourty seven million and four hundred eighty three thousand and six hundred fourty seven dollars.", App.writeNumber(2147483647));
	}

}
