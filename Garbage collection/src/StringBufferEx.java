
public class StringBufferEx {
	



	/* Total 15 constructors are present in a string class 
	 * new String() creates empty String object
	 * StringBuffer is mutable / changeable
	 * append() , getBytes()
	 * String and StringBuffer are not related .
	 * 
	 * */
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello");  // [HJavalo] StringBuffer object
        sb.replace(1,3,"Java"); //HJavalo
        System.out.println(sb); 
        
        StringBuffer sb1=new StringBuffer("Hello"); 
		sb1.setCharAt(1, 'd');
        System.out.println(sb1);
        
        StringBuffer sb2=new StringBuffer("Hello"); 
		sb2.deleteCharAt(0);
		
        System.out.println(sb2);
        
        
        StringBuffer sb3=new StringBuffer("Hello"); // sb3==>[HelloWorld append()] StringBuffer class object 
		sb3.append("World");
        System.out.println(sb3);
        
        String s="java"; // String object content do not change
        s.replace('a', 'b');// all occurance of character a is replaced with b
        System.out.println(s);
        
        // A-65 B-66 ...  a-97 b-98..  0-48 , 1-49 , 2-50
        
        int ascii[] = {65, 66, 67, 68}; 
        String s1 = new String(ascii, 1, 2);
        System.out.println(s1);

        char ch; 
        ch = "hello".charAt(1); 
        System.out.println(ch);
        
        String s3 = "Hello World"; 
        String s4 = s3.substring(0 , 4);
       System.out.println(s4);
      
       String s8=new String(); // s8==>[] Empty String class object
       System.out.println(s8.length());
       
     /* String objects are constants means we can not change it's contents
      * Hence they are called immutable/unchangeable
      * 
      *  */
       
       String s5="JBK"; // s5==>[jbk concat()] String class object
       s5.concat("java");//  [jbkjava] String class object
       
       System.out.println(s5);//toString() is called automatically

       
       String s6="JBK"; // s6==>[jbk concat()] String class object
       System.out.println(s6);
       
       s6=s6.concat("java");//s6==>  [jbkjava] String class object
       
       System.out.println(s6);//toString() is called automatically

       
       
	}
}










	


