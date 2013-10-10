

public class AddCommand extends BinaryCommand {

	@Override
	public Integer evaluate(Integer n1, Integer n2) {
		return n1 + n2;
	}

	@Override
	public int precedence() {
		return 1;
	}

	@Override
	public char content() {
		return '+';
	}
}