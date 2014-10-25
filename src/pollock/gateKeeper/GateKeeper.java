package src.pollock.gateKeeper;

import src.pollock.cleaner.*;
import src.pollock.synth.*;

public class GateKeeper{
	private static GateKeeper gateKeeper = null;
	
	public static enum ContributorCleanerImp {
		STUB, V1
	}
	private static ContributorCleanerImp ContributorCleanerSelection;

	protected GateKeeper(){
		setContributorCleaner(ContributorCleanerImp.STUB);
		//to prevent instatiation from a global reference
	}

	public static GateKeeper getGateKeeper(){
		if(gateKeeper == null){
			gateKeeper = new GateKeeper();
		}
		return gateKeeper;
	}

	//ContributorCleanerSelection getter and setter
	public static ContributorCleanerImp getContributorCleaner(){
		return ContributorCleanerSelection;
	}
	
	public static void setContributorCleaner(ContributorCleanerImp imp){
		ContributorCleanerSelection = imp;
	}
}

