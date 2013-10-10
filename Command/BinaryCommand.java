import java.util.Stack;


public abstract class BinaryCommand extends Command{

	@Override
	public boolean execute (Stack<Integer> stack){
		
		Integer n1 = stack.pop();
		Integer n2 = stack.pop();
		Integer result = this.evaluate(n2, n1); //Calls evaluate() of appropriate subclass
		stack.push(result);
		
		return true;
	}
	
	public abstract int precedence();
	public abstract char content();
	
	//BinaryCommand adds its evaluate() function to be implemented by subclasses
	public abstract Integer evaluate(Integer n1, Integer n2);

}
