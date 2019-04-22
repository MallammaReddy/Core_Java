
interface Strategy{
	public float calculation(float num1,float num2);
}
 
class Addition implements Strategy{
	public float calculation(float num1,float num2) {
		return num1+num2;
	}
	
	
}

class Substraction implements Strategy{
	public float calculation(float num1,float num2) {
		return num1-num2;
	}
	
	
}

class Context{
	 private Strategy strategy;
	 public Context(Strategy strategy) {
		 this.strategy=strategy;
	 }
	 
	 public float excuteStrategy(float num1,float num2) {
		 return strategy.calculation(num1,num2);
		 
	 }
	
}


public class Startegy_Pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context cont=new Context(new Addition());
		System.out.println(cont.excuteStrategy(2, 1));

	}

}
