package com.iyor.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
//TODO Add a @Before clause

    @Test
    public void testCreation() {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        assertTrue(0==ll.size());
    }

    @Test
    public void addTest() {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        assertTrue(3==ll.size());
    }

    @Test
    public void containsIfEmptyTest(){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        assertFalse(ll.contains(1));
    }

    @Test
    public void containsTest() {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        assertTrue(ll.contains(1));
        assertTrue(ll.contains(2));
        assertTrue(ll.contains(3));
    }

	@Test
	public void removeMiddleElementTest(){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
		ll.add(4);

		ll.remove(2);
		assertTrue(3==ll.size());
		assertTrue(ll.contains(1));
		assertFalse(ll.contains(2));
		assertTrue(ll.contains(3));
		assertTrue(ll.contains(4));
	}

	@Test
	public void removeFirstElementTest(){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
		ll.add(4);
			
		ll.remove(1);
		assertTrue(3==ll.size());
		assertFalse(ll.contains(1));
		assertTrue(ll.contains(2));
		assertTrue(ll.contains(3));
		assertTrue(ll.contains(4));
	}

//	@Test
//	public void removeLastElementTest(){
//        LinkedList<Integer> ll = new LinkedList<Integer>();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//		ll.add(4);
//			
//		ll.remove(4);
//		assertTrue(3==ll.size());
//		assertTrue(ll.contains(1));
//		assertTrue(ll.contains(2));
//		assertTrue(ll.contains(3));
//		assertFalse(ll.contains(4));
//	}

}
