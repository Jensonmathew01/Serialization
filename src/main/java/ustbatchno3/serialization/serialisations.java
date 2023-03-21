package ustbatchno3.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serialisations {

	public static void main(String[] args) {
		try {
			serial s=new serial(255,"james");
			FileOutputStream fout=new FileOutputStream("C:\\g.ser");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s); 
			  out.flush();    
			  //closing the stream    
			  out.close();    
			  System.out.println("success");
			  }catch(Exception e){System.out.println(e);}    
			 }    
			
}