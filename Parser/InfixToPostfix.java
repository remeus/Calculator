import java.util.Stack;



public class InfixToPostfix {
	
	/**
	 *	
	 *	Function infixToPostfix(String, AbstractExpressionCommandFactory, Stack<Command>) : void
	 *
	 *	Parses character tokens in input
	 *	Creates appropriate Command objects from AbstractExpressinCommandFactory Class
	 *	Converts input expression to Postfix type Command Stack for easier calculation
	 *	
	 */
	
	public void infixToPostfix (final String infix, 
			AbstractExpressionCommandFactory factory, 
			Stack<Command> postfix) {
		
		Command cmd = null;
		Stack<Command> temp = new Stack<Command>();
		char[] charArray = infix.toCharArray();
		char token;
		
		for (int i = 0; i < charArray.length; i++) {
			
			token = charArray[i];
			
			
			if(token == '(') {
				cmd = factory.createOpenParenthesesCommand();
				temp.push(cmd);
			}
			
			
			else if(token == ')') {
				while(temp.peek().content() != '(') {
					postfix.push(temp.pop());
				}
				temp.pop();
			}
			
			
			else if(token == '+') {
				cmd = factory.createAddCommand();
				if(!temp.isEmpty()) {
					if(temp.peek().precedence() >= cmd.precedence()) {
						postfix.push(temp.pop());
					}
				}
				temp.push(cmd);
			}
			
			
			else if(token == '-'){
				cmd = factory.createSubtractCommand();
				if(!temp.isEmpty()) {
					if(temp.peek().precedence() >= cmd.precedence()){
						postfix.push(temp.pop());
					}
				}
				temp.push(cmd);
			}
			
			
			else if(token == '*') {
				cmd = factory.createMultiplyCommand();
				if(!temp.isEmpty()){
					if(temp.peek().precedence() >= cmd.precedence()){
						postfix.push(temp.pop());
					}
				}
				temp.push(cmd);
			}
			
			
			else if(token == '/'){
				cmd = factory.createDivideCommand();
				if(!temp.isEmpty()){
					if(temp.peek().precedence() >= cmd.precedence()){
						postfix.push(temp.pop());
					}
				}
				temp.push(cmd);				
			}
			
			
			else if(token == '%'){
				cmd = factory.createModulusCommand();
				if(!temp.isEmpty()){
					if(temp.peek().precedence() >= cmd.precedence()){
						postfix.push(temp.pop());
					}
				}
				temp.push(cmd);	
			}
			
			
			else if(Character.isDigit(token)){
				
				int val = token - '0';
				int j;
				
				/*
					Code to handle multiple-character numbers (eg. 14, 2884)
					Checks if subsequent tokens are also digits
					if digits then adds them properly to the number held in val
					if non-digit, then breaks out
				*/
				for(j = i+1; j < charArray.length; j++){
					char tok = charArray[j];
					if(Character.isDigit(tok)){
						val = val*10 + (tok-'0');
					}
					else {
						cmd = factory.createNumberCommand(val);
						i = j-1;
						break;
					}
				}
				
				// Handles special case when number is at the end of charArray
				if(j== charArray.length){
					i = j-1;
					cmd = factory.createNumberCommand(val);
				}	
				postfix.push(cmd);
			}
			
			
			else {
				System.out.println("Invalid Entry");
			}
			
		}//end for loop
		
		
		for(Command c : temp){
			postfix.push(c);
		}
	}

}














