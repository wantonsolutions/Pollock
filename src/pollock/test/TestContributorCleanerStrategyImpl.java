package src.pollock.test;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

import src.pollock.cleaner.ContributorCleanerStrategy;
import src.pollock.cleaner.ContributorCleanerV1;
import src.pollock.data.ContributorCommit;
import src.pollock.data.ContributorCommitData;

public class TestContributorCleanerStrategyImpl {

	@Test
	public void test() {
		ContributorCleanerStrategy sut = new ContributorCleanerV1();
		// change path
		String path = "C:\\Users\\Nastya\\contributorCommit.txt";
		
		ContributorCommitData loc = sut.cleanCommits(path);
		assertNotNull("expected result should not be null", loc);
		ArrayList<ContributorCommit> list = loc.getContributorCommits();
		assertNotNull("expected result should not be null", list);
		assertFalse(list.isEmpty());
		
	}

}
