package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.spell.deloite.Calculator;

class TestCul {
Calculator c=new Calculator();
	@Test
	public void test() {
	assertEquals(6,c.add(3,3));
	}

}
