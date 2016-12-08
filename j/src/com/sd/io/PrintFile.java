package com.sd.io;
import java.io.*;

public class PrintFile {
	public static void main(String args[]) {
		try {
			File f = new File("noname.txt");
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}	
	}
}