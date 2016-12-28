package com.iyor.basics;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class QueueTest {

	Queue <Integer> q;
	
	@Before
	public void testInit() {
		this.q = new Queue<Integer>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
	}

	@Test
	public void dequeueTest() {
		assertTrue(1==q.dequeue());	
		assertTrue(2==q.dequeue());	
		assertTrue(3==q.dequeue());	
		assertTrue(4==q.dequeue());	
	}

	@Test 
	public void enqueueAndDequeueTest() {
		q.dequeue();
		q.dequeue();
		q.enqueue(8);
		assertTrue(3==q.dequeue());
		assertTrue(4==q.dequeue());
		assertTrue(8==q.dequeue());
	}
	@Test
	public void dequeueWhenEmpty() {
		q = new Queue<Integer>();
		assertNull(q.dequeue());
	}
}
