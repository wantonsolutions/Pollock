package src.pollock.cleaner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import src.pollock.data.ContributorCommit;
import src.pollock.data.ContributorCommitData;

public class ContributorCleanerStrategyImpl implements
		ContributorCleanerStrategy {

	public ContributorCleanerStrategyImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ContributorCommitData cleanCommits(String Filename) {
		ContributorCommitData result = new ContributorCommitData();
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(Filename));
			String line = null;
			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				String[] values = line.split("\t");
				if (values.length >= 2) {
					String name = values[0];
					String commit = values[1];
					// String date = values[2];
					// String fileName = values[3];

					ContributorCommit cc = new ContributorCommit(name, commit);
					result.add(cc);
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
