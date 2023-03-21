package ustbatchno3.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class deserialisation {

	public static void main(String[] args) {
		 try{  
			  //Creating stream to read the object  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\g.ser"));  
			  serial s=(serial)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println(s.getId()+" "+s.getName());  
			  //closing the stream  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}
			 }  
         }


