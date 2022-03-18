

public class SCP2 {

	
	public static void main(String[] args) {
		/*
		Any java object is stored in a memory called heap
		[
			[] Student objet
			[] Employee object
			
			[ [JBK]  ] SCP ( String constant pool )
			
			s1(1000) ==>[JBK] String class object at memory address 1000 
			s2(2000) ==>[JBK] String class object at memory address 2000
			
		 ]  Heap memory area
		 
		 
		 
		 
		 */
		
		
		String s1 =new String("JBK");
		String s2=new String("JBK");
		
		System.out.println(s1==s2); // == compare address
		System.out.println(s1.equals(s2));//equals() will compare content of object
		
	}
}

