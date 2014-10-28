package src.pollock.test;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.pollock.data.DrawingInstruction;
public class TestDrawingInstruction {
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void testDrawingInstruction(){
		DrawingInstruction di = new DrawingInstruction(10,10,1,1);
		assertTrue(di.draw().equals("10 10 1 1"));
	}
	
}
