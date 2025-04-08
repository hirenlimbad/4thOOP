

import java.io.*;
import java.util.Scanner;

public class FileInputOutput{

	public static void main(String args[]){
		
		try{
			File file = new File("hello.txt");
			Scanner filesc = new Scanner(file);
			while(filesc.hasNextLine()){
				System.out.println(filesc.nextLine());
			}
			filesc.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	
	}
	
}