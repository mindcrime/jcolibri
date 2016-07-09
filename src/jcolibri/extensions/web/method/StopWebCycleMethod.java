package jcolibri.extensions.web.method;

import jcolibri.cbrcore.CBRContext;
import jcolibri.cbrcore.exception.ExecutionException;
import jcolibri.extensions.web.bridge.Synchronizer;

/**
 * Method that solves the CBR cycle task by decomposition.
 * 
 * @author Juan Jos� Bello
 */
public class StopWebCycleMethod extends jcolibri.cbrcore.CBRMethod {
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see jcolibri.cbrcore.CBRMethod#execute(jcolibri.cbrcore.CBRContext)
	 */
	public CBRContext execute(CBRContext context) throws ExecutionException {
        Synchronizer.endCurrentWebSession();
		return context;
	}

}
