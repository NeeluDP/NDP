
import java.util.Arrays;

public class SubstringExample {
	
	public static void main(String[] args) {
		
		String s = "javabykiran";
		
		String sub=s.substring(4, 7);
		
		System.out.println(sub);
		
		int index1=s.indexOf('v');
		System.out.println(index1);
		

		int index2=s.lastIndexOf('v');
		System.out.println(index2);
		
	
		String s1 = "jbk";
		char[] d = s1.toCharArray();
		System.out.println(Arrays.toString(d));
		
		
		String s2="abc.doc";
		
		System.out.println(s2.endsWith(".txt"));
		
		
		String s3="abca.doc";
		
		System.out.println(s3.startsWith("ab"));
		
		
		System.out.println(s3.contains("do"));
		
		s3.equalsIgnoreCase("ABC.doc");
		
		System.out.println(s3.indexOf('c'));;
		System.out.println(s3.lastIndexOf('c'));;
		System.out.println(s3.lastIndexOf('a'));;
		
		String s4="JAVA";
		System.out.println(s4.toLowerCase());
		
		String s5="java";
		System.out.println(s4.toUpperCase());
		
		
		String s6=" ab c ";
		System.out.println(s6.trim());
		
		byte[] bytes=s6.getBytes();
		
		
		
		
		
	}

}

