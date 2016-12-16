package rocketBase;
/////
import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

import org.junit.Test;
public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	
	@Test
	public void Ratetest() throws RateException {
		assertTrue(RateBLL.getRate(800) == 5);
		
	}
	@Test
	public void EXCEPTIONtest() throws RateException {
		assertEquals(RateBLL.getRate(0),0,0);
		}

}
