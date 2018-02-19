/* CALCULATOR POSTFIX
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * CARLOS CHEW - 17507
 * OTTO TRUJILLO - 17189
*/


public class CalculatorStack implements Calculator{

	StackVector<Integer> stack = new StackVector<Integer>();
	


	public String calculate(String operacion) {
		String[] splitOperacion = operacion.split(" ");
		for( String charOperacion : splitOperacion) {
			try {
				stack.push(Integer.parseInt(charOperacion));
		}catch(Exception e){
				if(charOperacion.equals("+")) {
					Integer resul = this.stack.pop();
					resul += this.stack.pop();
					this.stack.push(resul);
		}else if(charOperacion.equals("-")) {
					Integer resul = this.stack.pop();
					resul -= this.stack.pop();
					this.stack.push(resul);
		}else if(charOperacion.equals("*")) {
					Integer resul = this.stack.pop();
					resul *= this.stack.pop();
					this.stack.push(resul);
		}else if(charOperacion.equals("/")) {
					try{
						Integer resul = this.stack.pop();
						resul /= this.stack.pop();
						this.stack.push(resul);
		}catch(ArithmeticException er){
						return("Error: "+ er.getMessage());
					}
		}else{
					return "WRONG CHARACTER";
				}
			}
		
		}
			
		return this.stack.peek().toString();
	}
	
}