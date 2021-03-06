package src.pollock.cleaner;

import src.pollock.data.FileCommit;
import src.pollock.data.FileCommitData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jelenafurundzic on 2014-11-05.
 */

public class FileCommitCleanerV1 implements FileCommitCleanerStrategy {

    public FileCommitCleanerV1() {
    }

    @Override
    public FileCommitData cleanCommits(String filename) {
        FileCommitData result = new FileCommitData();
        BufferedReader reader = null;
        try {
		System.out.println("FCCV1 cleaning ...");
            FileReader fileReader = new FileReader(filename);
            reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                 //System.out.println(line);
                String[] values = line.split(",");
                if (values.length >= 4) {
                    String commit = values[0];
                    String fname = values[1];
                    int additions = Integer.parseInt(values[2]);
                    int deletions = Integer.parseInt(values[3]);

                    FileCommit fc = new FileCommit(fname, commit, additions, deletions);
                    result.add(fc);
                }
            }
        } catch (Exception x) {
            System.err.format("Exception: %s%n", x);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.format("Exception: %s%n", e);
                }
            }
        }

        return result;
    }
}
