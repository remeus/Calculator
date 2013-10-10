import java.util.Stack;


public class Client {
	
	int result;
	
	public Client() {
		result = 0;
	}
	
	public int expressionResult(String infix){
		AbstractExpressionCommandFactory factory = new BasicExpressionCommandFactory();
		Stack<Command> postfix = new Stack<Command>();
		InfixToPostfix object = new InfixToPostfix();
		object.infixToPostfix(infix, factory, postfix);
		EvaluatePostfix evaluate = new EvaluatePostfix();
		result = (int)evaluate.evaluatePostfix(postfix);
		
		return result;
	}
	
	public static void main(String[] args) {
		String infix = "1*2*3*4*26/(4+22)";
		Client c = new Client();
		int result = c.expressionResult(infix);
		System.out.println("The result is : " + result);
	}

}
