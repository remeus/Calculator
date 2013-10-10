import java.util.ArrayList;
import java.util.Stack;

public class EvaluatePostfix {
	

	public Integer evaluatePostfix(Stack<Command> postfix) {
		Stack<Integer> result = new Stack<Integer>();
		ArrayList<Command> list = new ArrayList<Command>(postfix);
		
		for (Command cmd : list) {
			cmd.execute(result);
		}
		
		return result.pop();
	}
}
