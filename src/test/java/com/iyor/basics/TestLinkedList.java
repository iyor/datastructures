package com.iyor.basics;

import com.iyor.basics.LinkedList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestLinkedList extends TestCase {

    public TestLinkedList( String testName ){
        super( testName );
    }
	
    public static Test suite(){
        return new TestSuite( TestLinkedList.class );
    }

	public void testCreation() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		assertTrue(0==ll.size());
	}

	public void testAdd() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		assertTrue(3==ll.size());
	}

	public void testContainsIfEmpty(){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		assertFalse(ll.contains(1));
	}

	public void testContains() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		assertTrue(ll.contains(1));
		assertTrue(ll.contains(2));
		assertTrue(ll.contains(3));
	}
}

