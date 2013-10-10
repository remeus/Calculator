

public abstract class AbstractExpressionCommandFactory {

	abstract NumberCommand createNumberCommand (int num);
	abstract AddCommand createAddCommand ();
	abstract SubtractCommand createSubtractCommand();
	abstract MultiplyCommand createMultiplyCommand();
	abstract DivideCommand createDivideCommand();
	abstract ModulusCommand createModulusCommand();
	abstract OpenParenthesesCommand createOpenParenthesesCommand();
	
}
