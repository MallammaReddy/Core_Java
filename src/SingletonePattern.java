import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingletonePattern1 implements Serializable{
	private static SingletonePattern1 sing=new SingletonePattern1();
	
	 private SingletonePattern1() {
		
	}
	
	public static SingletonePattern1 getInstance() {
		if(sing==null) {
			synchronized (sing) {
				if(sing==null) {
					
					sing=new SingletonePattern1();
				}
				
			}
			
		}
		return sing;
	}
	
	
	// implement readResolve method 
    protected Object readResolve() 
    { 
        return sing; 
    } 
    
    @Override
    protected Object clone() throws CloneNotSupportedException  
    { 
      return super.clone(); 
    } 
}

public class SingletonePattern {
	

	public static void main(String[] args) throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		SingletonePattern1 singletonePattern1= SingletonePattern1.getInstance();
		System.out.println(SingletonePattern1.getInstance());
		//System.out.println(singletonePattern1.clone());
		//System.out.println(singletonePattern1.readResolve());
		   System.out.println("hello");
		SingletonePattern1 instance1 = SingletonePattern1.getInstance();
		  
		ObjectOutput out 
        = new ObjectOutputStream(new FileOutputStream("file.text")); 
	
    out.writeObject(instance1); 
	 System.out.println("hello");
    out.close(); 
    System.out.println("hello");
    // deserailize from file to object 
    ObjectInput in  
        = new ObjectInputStream(new FileInputStream("file.text")); 
      
    SingletonePattern1 instance2 = (SingletonePattern1) in.readObject(); 
    in.close(); 

    System.out.println("instance1 hashCode:- "
                                         + instance1.hashCode()); 
    System.out.println("instance2 hashCode:- " 
                                         + instance2.hashCode()); 

	}

}
