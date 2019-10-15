import java.util.ArrayList;
import java.util.Scanner;
import java.util.Base64;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.Writer;


public class raboy{
	public static void main(String[] args) throws IOException{
	 
	 ArrayList<String> morethanwords = new ArrayList<String>();
	 Scanner scanME = new Scanner(System.in);
	 Boolean ImDone = false;
	 
	 while(!ImDone){
	 	String Inward = scanME.next();
	 	if(!Inward.equals(":q")){
	 		byte[] ByteYou = Base64.getEncoder().encode((Inward + "\n").getBytes());
	 		morethanwords.add(new String(ByteYou));
	 	} 
	 	else{
	 		ImDone = true;
	 	}
} 
	System.out.println("Write here");
	
	
	FileWriter ff = new FileWriter("Crypt.me");
	for(String j: morethanwords){
		ff.write(j);
	}
	ff.close();

}	
}