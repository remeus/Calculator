import java.util.Stack;


public class NumberCommand extends Command {
	
	private Integer n;
	
	public NumberCommand(int num) {
		n = num;
	}

	@Override
	public boolean execute(Stack<Integer> stack) {
		stack.push(n);
		return true;
	}

	@Override
	public char content() {
		return '0';
	}

	@Override
	public int precedence() {
		return 0;
	}
}
