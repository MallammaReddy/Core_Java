
interface Factory{
	public void display();
}

class Fact1 implements Factory{
	public Fact1() {
		
	}
	public void display() {
		System.out.println("Fact1");
	}
}

class Fact2 implements Factory{
	public Fact2() {
		
	}
	public void display() {
		System.out.println("Fact2");
	}
}

class FactoryPatt{
	Factory fact;
	public FactoryPatt(Factory fact) {
		this.fact=fact;
		
	}
	void getPattern(Factory type) {
		if(type instanceof Fact1) {
			Fact1 new_name = (Fact1) type;
			 new_name.display();
			
		} else if(type instanceof Fact2) {
			Fact2 new_name = (Fact2) type;
			 new_name.display();
			
		} 
			
		}
		
	}
	


public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryPatt FactoryPatt=new FactoryPatt(new Fact1());
		FactoryPatt.getPattern(new Fact2());
	}

}
