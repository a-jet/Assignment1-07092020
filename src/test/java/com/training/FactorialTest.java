package com.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest extends Factorial {

	@Test
	public void testnegativenumber() {
		assertEquals(calc(-1), 0);
	}
	@Test
	public void testzero() {
		assertEquals(calc(0),1);
	}
	@Test
	public void testone() {
		assertEquals(calc(1),1);
	}
	@Test
	public void testtwo() {
		assertEquals(calc(2),2);
	}
	@Test
	public void testfive() {
		assertEquals(calc(5),120);
	}
}
