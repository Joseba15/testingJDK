package test.main.java;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestHashSet {
	

	
	/**
	 * En este test comprobamos si la lista esta vacia, lo cual es verídico,porque le pasamos el metodo 
	 * del size().
	 */
	@Test
	void testSizeEmpty() {
		Set<Integer> vacio = new HashSet<>();
		assertEquals(vacio.size(),0);
	}
	
	/**
	 * En este comprobamos que la lista que esta rellena tiene el tamaño verdadero
	 */
	@Test
	void testSize() {
		Set<Integer> relleno = new HashSet<>();
		relleno.add(3);
		relleno.add(5);
		relleno.add(5);
		relleno.add(5);
		relleno.add(5);

		assertEquals(relleno.size(),2);
	}
	
	

	@Test
	void testIsEmpty() {
		Set<Integer> vacio = new HashSet<>();
		assertTrue(vacio.isEmpty());
	}
	
	@Test
	void testIsNotEmpty() {
		Set<Integer> relleno = new HashSet<>();
		relleno.add(1);
		relleno.add(2);
		relleno.add(3);
		assertFalse(relleno.isEmpty());
	}

	
	
	@Test
	void testNotContainsWhenEmpty() {
		Set<Integer> vacio = new HashSet<>();
		assert(!vacio.contains(3));
		
	}
	
	@Test
	void testContainsElement() {
		Set<Integer> relleno = new HashSet<>();
		relleno.add(3);
		relleno.add(5);
		assert(relleno.contains(3));
		
	}
	
	@Test
	void testNotContainsElement() {
		Set<Integer> relleno = new HashSet<>();
		relleno.add(3);
		relleno.add(5);
		assert(!relleno.contains(30));
		
	}

	@Test
	void testCanRemove() {
		Set<Integer> relleno = new HashSet<>();
		relleno.add(1);
		relleno.add(2);
		relleno.add(4);
		relleno.add(6);
		
		relleno.remove(6);
		assertEquals(relleno.size(),3);
	}
	
	@Test
	void testCannotRemove() {
		Set<Integer> relleno = new HashSet<>();
		relleno.add(1);
		relleno.add(2);
		relleno.add(4);
		relleno.add(6);
		
		relleno.remove(100);
		assertEquals(relleno.size(),4);
	}

	
	@Test
	void testNotRemovable() {
		Set<Integer> vacio = new HashSet<>();
		vacio.remove(100);
		
		assertTrue(vacio.size()==0);
	}
	
	@ValueSource(ints= {1,7,9})
	@ParameterizedTest
	void testCanClear(int b) {
		Set<Integer> relleno = new HashSet<>();
		relleno.add(b);
		relleno.clear();
		
		assertEquals(relleno.size(),0);
		
	}
	
	@ValueSource(ints= {2,7,9})
	@ParameterizedTest
	void testCannotClear(int b) {
		Set<Integer> relleno = new HashSet<>();
		relleno.add(b);

		assert(relleno.size()!=0);
		
	}

}
