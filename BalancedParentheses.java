package cis112_week04.lab;

/**
 * Check whether an expression has balanced parentheses.
 * 
 * @author bingol
 */
public class BalancedParentheses {

	static StackChar stack = null;

	public BalancedParentheses(int size) {
		stack = new StackChar(size);
	}

	/**
	 * Returns {@code true} if the expression has balanced parentheses;
	 * {@code false} otherwise.
	 * 
	 * @param expression
	 * @return
	 */
	public boolean isBalanced(String expression) {
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
			// TODO your code should be between below and above marks.
			
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			
			if(ch == ')') 
			
			{	
				for(int j = 0; j<expression.length(); j++) {
					char chv1 = expression.charAt(j);
					if(chv1 == '(') {
						stack.pop();
						break;
					}	
				}
			}
			
			if(ch == '}') 
				
			{	
				for(int j = 0; j<expression.length(); j++) {
					char chv1 = expression.charAt(j);
					if(chv1 == '{') {
						stack.pop();
						break;
					}	
				}
			}
			
			if(ch == ']') 
				
			{	
				for(int j = 0; j<expression.length(); j++) {
					char chv1 = expression.charAt(j);
					if(chv1 == '[') {
						stack.pop();
						break;
					}	
				}
			}
			

			// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
		}
		if (stack.empty()) {
			return true;
		} else {
			return false;
		}
	}
}
