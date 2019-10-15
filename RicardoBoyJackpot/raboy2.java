import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.Base64;

public class raboy{
	
	public static void main(String[] args) throws IOException{
		
		Scanner ScanMe = new Scanner(new File("Crypt.me"));
		byte[] ByteMe = Base64.getDecoder().decode(ScanMe.next());
		
		System.out.println(new String(ByteMe));
	
		
	}
	
}