
public class SCP {


	
	public static void main(String[] args) {
		/*
		Any java object is stored in a memory called heap
		[
			[] Student objet
			[] Employee object
			
			[ s1(1000),s2(1000) ==>("JBK") String object at memory address 1000  [java] ] String constant pool

			s3==>[java] String class object
			
		 ]  Heap memory area
		 
		 
		 In String constant pool , duplicates are not created . string object is stored in string constant pool when we create string object using "". 
		 
		 */
		
		
		String s1 ="JBK";
		String s2="JBK";
		
		String s3 = new String("java");  // 2 string objects are created one in heap and one in SCP
		
		System.out.println(s3.intern()); // it will give corresponding string object from SCP
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}
}


