package Tests;

import Model.FileCommit;
import Model.FileCommitData;
import Parsers.FileCommitCleanerV1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jelenafurundzic on 2014-11-08.
 */
public class FileCommitCleanerV1Tests {
    String filename = "/Users/jelenafurundzic/Documents/CPSC210/L1E-marking/marking/L1E/b9t9a/FileParsers/src/FileCommits.txt";
    FileCommitCleanerV1 f;
    FileCommitData fcd;
    FileCommit fc;

    @Before
    public void runBefore(){
        f = new FileCommitCleanerV1();
        fcd = f.cleanCommits(filename);

    }

    @Test
    public void testFileCommitDataSize(){
        int i = fcd.get().size();
        assertTrue(fcd.get().size() == 374);
    }

    @Test
    public void testFirstFileCommit(){
        fc = fcd.get().get(0);
        assertEquals(fc.getCommit(), "c813e25565be05205d861429392e93cc0f369599");
        assertEquals(fc.getFilename(), "DrawableOutput.txt");
        assertEquals(fc.getAdditions(), 385);
        assertEquals(fc.getDeletions(), 1);
        assertEquals(fc.getCommitWork(), 386);
    }

    @Test
    public void testThirdFileCommit(){
        //c813e25565be05205d861429392e93cc0f369599,UserCommits.txt,32,0
        fc = fcd.get().get(2);
        assertEquals(fc.getCommit(), "c813e25565be05205d861429392e93cc0f369599");
        assertEquals(fc.getFilename(), "UserCommits.txt");
        assertEquals(fc.getAdditions(), 32);
        assertEquals(fc.getDeletions(), 0);
        assertEquals(fc.getCommitWork(), 32);
    }

    @Test
    public void testFiftiethFileCommit(){
        //a95d7f0a867c58b925fad061842fff239d973215,src/pollock/cleaner/ContributorCleanerStrategyImpl.java,54,0
        fc = fcd.get().get(49);
        String s =fc.getCommit();
        String f = fc.getFilename();
        int i = fc.getAdditions();
        int d = fc.getDeletions();
        assertEquals(fc.getCommit(), "670cce4b9b354808c0b47354f6a2a92e8cf08662");
        assertEquals(fc.getFilename(), "run.sh");
        assertEquals(fc.getAdditions(), 14);
        assertEquals(fc.getDeletions(), 13);
        assertEquals(fc.getCommitWork(), 27);
    }

    @Test
    public void testLastFileCommit(){
        //a95d7f0a867c58b925fad061842fff239d973215,src/pollock/cleaner/ContributorCleanerStrategyImpl.java,54,0
        fc = fcd.get().get(373);
        assertEquals(fc.getCommit(), "a95d7f0a867c58b925fad061842fff239d973215");
        assertEquals(fc.getFilename(), "src/pollock/cleaner/ContributorCleanerStrategyImpl.java");
        assertEquals(fc.getAdditions(), 54);
        assertEquals(fc.getDeletions(), 0);
        assertEquals(fc.getCommitWork(), 54);
    }

}
