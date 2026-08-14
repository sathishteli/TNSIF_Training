package org.tnsif.acc.c2tc.exceptionhandking;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IoExceptionDemo {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader ("C:\\Users\\Admin\\OneDrive\\Desktop\\Java Fullstack\\demo1.txt"));
			String data="";
			while((data=br.readLine())!=null)
			{
				System.out.println(data);
			}
			br.close();
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
