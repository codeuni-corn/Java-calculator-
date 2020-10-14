import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	@Test
	public void testAddOne(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.add(1);
		// Assert
		assertEquals("0+1 = 1", 1, sut.getState());
	}

	@Test
	public void testMultOneByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		assertEquals("1*2 = 2", 2, sut.getState());
	}

	@Test
	public void testSubOne(){
		Calculator sut = new Calculator();
		sut.setState(10);
		sut.sub(1);
		assertEquals("10-1 = 9", 9, sut.getState());
	}

	@Test
	public void testDivTenByTwo(){
		Calculator sut = new Calculator();
		sut.setState(10);
		sut.div(2);
		assertEquals("10/2 = 5", 5, sut.getState());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivTenByZero(){
		Calculator sut = new Calculator();
		sut.setState(10);
		sut.div(0);
	}
}
