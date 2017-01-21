package com.iyor.basics;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ArrayListTest {

	ArrayList<Integer> al;
	
	@Before
	public void testInit() {
		this.al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
	}

    @Test
    public void testCreation() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        assertTrue(0==al.size());
    }

    @Test
    public void addTest() {
        assertTrue(4==al.size());
    }

    @Test
    public void containsIfEmptyTest() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        assertFalse(al.contains(1));
    }

    @Test
    public void containsTest() {
        assertTrue(al.contains(1));
        assertTrue(al.contains(2));
        assertTrue(al.contains(3));
        assertTrue(al.contains(4));
    }

	@Test
	public void removeMiddleElementTest() {
		al.remove(1);
		assertTrue(3==al.size());
		assertTrue(al.contains(1));
		assertFalse(al.contains(2));
		assertTrue(al.contains(3));
		assertTrue(al.contains(4));
	}

	@Test
	public void removeFirstElementTest() {
		al.remove(0);
		assertTrue(3==al.size());
		assertFalse(al.contains(1));
		assertTrue(al.contains(2));
		assertTrue(al.contains(3));
		assertTrue(al.contains(4));
	}

	@Test
	public void removeLastElementTest() {
		al.remove(3);
		assertTrue(3==al.size());
		assertTrue(al.contains(1));
		assertTrue(al.contains(2));
		assertTrue(al.contains(3));
		assertFalse(al.contains(4));
	}

	@Test
	public void addToInvokeReallocationTest() {
		for(int i = 0; i<100; i++)	
			al.add(i);
		assertTrue(104==al.size());
	}

	@Test
	public void getTest() {
		assertTrue(1==al.get(0));
	}

	@Test
	public void setTest() {
		al.set(0, 15);
		assertTrue(15==al.get(0));
	}

	@Test
	public void getOutOfBoundsTest() {
		assertNull(al.get(5));	
	}

	@Test
	public void setOutOfBoundsTest(){
		al.set(5, 15);
		assertTrue(al.contains(1));
		assertTrue(al.contains(2));
		assertTrue(al.contains(3));
		assertTrue(al.contains(4));
		assertFalse(al.contains(15));
	}

}
