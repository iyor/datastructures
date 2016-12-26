package com.iyor.basics;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

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

}