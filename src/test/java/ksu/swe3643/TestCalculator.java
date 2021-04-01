package ksu.swe3643;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.Mockito;
//import static org.mockito.Mockito.*;
public class TestCalculator {

	MyCalculator c;
	CalculatorService service  = new CalculatorService();
	
	//Cerate fake object using Mockito
	//CalculatorService service = Mockito.mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		c = new MyCalculator(service);
	}

	@Test
	public void testSumSquare() {
		//Tell Mockito that the expected return value is 5
		//when(service.addHelper(2, 3)).thenReturn(5);
		// 2 and 3		
		assertEquals(20, c.SumSqure(2,3));
	}
}
