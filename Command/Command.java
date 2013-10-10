import java.util.Stack;


public abstract class Command {
	
	/**
	 *  The subclasses of Command class are given operator precedence according to following table:
	 *  
	 *  The table is based on the Java Operator Precedence table provided at:
	 *  http://www.cis.upenn.edu/~palsetia/java/precedenceTable.html
	 *  
	 *  Elements with higher precedence will be given priority in calculation
	 *  
	 *  ________________________
	 * 	PRECEDENCE TABLE
	 * 
	 * 	ELEMENT		PRECEDENCE
	 * 
	 * 	( )			3
	 * 	* % /		2
	 * 	+ -			1
	 * 	NUM			0
	 * 	________________________
	 * 
	 */
	
	public abstract boolean execute (Stack <Integer> stack);
	public abstract char content();
	public abstract int precedence();
}

