package src.pollock.test;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.pollock.data.Splatter;
import src.pollock.synth.WorkQuantStub;
public class TestWorkQuantStub {
	@Before
	public void setUp(){
		
	}
	@Test
	public void testWorkQuant(){
		WorkQuantStub stub = new WorkQuantStub();
		ArrayList<Splatter> splatters = new ArrayList<Splatter>();
		stub.quantifyCommits(splatters, null, null);
		assertEquals(splatters.size(),3);
		Splatter s1 = splatters.get(0);
		assertTrue(s1.draw().contains("0 0 10 10"));
		assertTrue(s1.draw().contains("0 1 5 5"));
		assertTrue(s1.draw().contains("1 1 3 3"));
		assertTrue(s1.draw().contains("3 2 5 5"));
		
		Splatter s2 = splatters.get(1);
		assertTrue(s2.draw().contains("10 10 3 3"));
		assertTrue(s2.draw().contains("10 11 7 7"));
		assertTrue(s2.draw().contains("11 11 6 6"));
		assertTrue(s2.draw().contains("13 12 8 8"));
		
	}
}
