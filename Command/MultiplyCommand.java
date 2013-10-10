public class MultiplyCommand extends BinaryCommand{
	
	@Override
	public Integer evaluate(Integer n1, Integer n2) {
		return (n1*n2);
	}

	@Override
	public int precedence() {
		return 2;
	}

	@Override
	public char content() {
		return '*';
	}
}
