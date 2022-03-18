import java.io.IOException;

public class Anny {



	public static void main(String[] args)throws IOException {
		
		
		Anny a=new Anny();
		
		a=null;          //garbage collector calls finalize()when it destroy object
		
		String s=new String();
		s=null;                 //----//---
		
		
		System.gc();
		
		Runtime.getRuntime().gc();//  we are requesting garbage collector to remove useless object from memory
		
		Runtime.getRuntime().exec("C:/Program Files/Google/Chrome/Application/chrome.exe");
		Runtime.getRuntime().exec("C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");
		
		Runtime.getRuntime().exec("notepad");		
	}
	
	//finalize()method of object which is destroy is called automatically
	
	public void finalize(){
		
		System.out.println(("Object is distroyed from memory"));
		
		

	}

}
