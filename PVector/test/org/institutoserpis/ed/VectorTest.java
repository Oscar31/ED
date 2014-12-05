package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class VectorTest {

	@Test
	public void testMin() {
		//int [] v = new int []{12,33,16,15,7};		
		
		//int menor= Vector.Min(v);
		assertEquals(7, Vector.Min(new int []{12,33,16,15,7}));
		//v = new int[]{12,33,16,15,24};
		//menor= Vector.Min(v);
		assertEquals(12, Vector.Min(new int[]{12,33,16,15,24}));
		assertEquals(15, Vector.Min(new int[]{19,33,16,15,24}));

	}

	@Test
	public void testIndexOf() {
		
		assertEquals(0,Vector.indexOf(new int[]{12,33,16,15,24}, 12));
		assertEquals(3,Vector.indexOf(new int[]{12,33,16,7,24}, 7));
		assertEquals(1,Vector.indexOf(new int[]{12,33,16,7,24}, 33));
		assertEquals(-1,Vector.indexOf(new int[]{12,33,16,7,24}, 100));

		
		
		
		
	}

}
