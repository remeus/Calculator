import java.util.Stack;

//Update to initial design - adding OpenParenthesesCommand Class to handle '(' and ')' commands
public class OpenParenthesesCommand extends Command{

	@Override
	public boolean execute(Stack<Integer> stack) {
		return true;
	}

	@Override
	public char content() {
		return '(';
	}

	@Override
	public int precedence() {
		return 0;
	}
	

}
