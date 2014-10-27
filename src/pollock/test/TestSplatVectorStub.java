package src.pollock.test;
import java.util.ArrayList;
import java.util.List;

import src.pollock.data.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.pollock.synth.SplatVectorStub;
import src.pollock.synth.WorkQuantStub;
public class TestSplatVectorStub {

	@Test
	public void testVectorizer(){
		SplatVectorStub stub = new SplatVectorStub();
		ArrayList<Splatter> splatters = new ArrayList<Splatter>();
		stub.vectorizeCommits(splatters, null, null);
		assertEquals(splatters.size(),3);
		Splatter s1 = splatters.get(0);
		assertTrue(s1.draw().contains("0 0 0 0"));
		assertTrue(s1.draw().contains("0 1 0 0"));
		assertTrue(s1.draw().contains("1 1 0 0"));
		assertTrue(s1.draw().contains("3 2 0 0"));
		
		Splatter s2 = splatters.get(1);
		assertTrue(s2.draw().contains("10 10 0 0"));
		assertTrue(s2.draw().contains("10 11 0 0"));
		assertTrue(s2.draw().contains("11 11 0 0"));
		assertTrue(s2.draw().contains("13 12 0 0"));
	}

}
