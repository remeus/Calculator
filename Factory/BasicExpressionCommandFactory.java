

public class BasicExpressionCommandFactory extends AbstractExpressionCommandFactory {

	NumberCommand createNumberCommand(int num) {
		return new NumberCommand(num);
	}

	AddCommand createAddCommand() {
		return new AddCommand();
	}

	SubtractCommand createSubtractCommand() {
		return new SubtractCommand();
	}

	MultiplyCommand createMultiplyCommand() {
		return new MultiplyCommand();
	}

	DivideCommand createDivideCommand() {
		return new DivideCommand();
	}

	ModulusCommand createModulusCommand() {
		return new ModulusCommand();
	}

	@Override
	OpenParenthesesCommand createOpenParenthesesCommand() {
		return new OpenParenthesesCommand();
	}
}
