package class05_06pm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//import java.io.*;

public class FileHandlingExample {

	
	/*
	 *   file :- collection of record...
	 *   
	 *   fileHandling :- (1)write (2)read
	 *   
	 *   write :- FileWriter(class) | BuffereWriter(class)
	 *   
	 *   read :- FileReader(class) | BuffereRead(class)
	 * 
	 * 
	 * */
	
	public static void main(String args[]) throws IOException {
		
		//to making a file..
		File f = new File("g://Manik.txt");//file path with fileName...
		
		//making object of fileWriter...
	//	FileWriter fw = new FileWriter(f);
		
//		fw.write("Deepak is a smart boy.");
//		fw.write("\n");
//		fw.write("Manik is a intelijent boy.");
//		
//		fw.close();
	
//		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("name : himanshu");
//		bw.newLine();
//		bw.write("address : BholaRam");
//		bw.newLine();
//		bw.write("email : abc@gmail.com");
//		bw.newLine();
//		bw.write("dob : 01/01/01");
//		
//		bw.close();
//		fw.close();
		
		//resume ... name/address/email/mob/dob
		//===============================================
		
		//read...
		
//		FileReader fr = new FileReader(f);
//		
//		BufferedReader br = new BufferedReader(fr);
//		
//		String s = "";
//		String s1 = "";
//		
//		while((s1=br.readLine())!=null) {
//			s = s + s1 + "\n";// name : himanshi address : bhola
//		   
//		}
//		System.out.println(s);
		
		
		
	}
	
}
