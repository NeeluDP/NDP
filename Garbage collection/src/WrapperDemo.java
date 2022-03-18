
import java.lang.Integer;

/* 
  wrapper classes wraps primitive value inside their objects
  Collection accepts only objects and not primitives
 
 *  */
public class WrapperDemo {

	public static void main(String[] args) {
		
		int a=10;
		Integer i = new Integer(a); // [10] Integer class object
	
		float b=20.5f;
		Float k = new Float(a); // [20.5] Float class object
	
	}
}
/* final class can't have child class 
 * 
 * all wrapper classes and string class , system class are final
 * */


//	class D extends String
//	{
//	
//	}

