package com.qa.testmaven1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemperatureTest {
	TemperatureConverter T; 
	
	@BeforeClass
	public static void setup() {
	    System.out.println("Before class");
	}
	
	@Before
	public void init () {
		T = new TemperatureConverter();
	} 
	
	@Test
	public void convertFC() {
		int F =50;
		
		float sum = T.convertFahrenheitToCelsius(F);
	   assertEquals(10,sum,0.001);
	   
	}
	   
	 @Test
	 public void convertCF() {
	 int C =50;
			
	 float sum = T.convertFahrenheitToCelsius(C);
	 assertEquals(10,sum,0.001);
	 
	 }
	 
	 @Test
	 public void convertKC() {
	 int K =300;
			
	 float sum = T.convertKelvinToCelsius(K);
	 assertEquals(27,sum,0.001);
	    
	   
	}
	
	 @Test
	 public void convertCK() {
	 int C =20;
			
	 float sum = T.convertCelsiusToKelvin(C);
	 assertEquals(293,sum,0.001);
	 }

	 
	 @Test
	 public void convertKF() {
	 int K =257;
			
	 float sum = T.convertKelvinToFahrenheit(K);
	 assertEquals(3.2,sum,0.001);
	 }

	 @Test
	 public void convertFK() {
	 int F = 25;
			
	 float sum = T.convertFahrenheitToKelvin(F);
	 assertEquals(269.111,sum,0.001);
	 }
}
