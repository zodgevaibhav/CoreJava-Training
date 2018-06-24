package javacore.fileio.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ModelReader {

	public static void main(String[] args) throws IOException {
		String line="";
		File file = new File("C:\\Users\\vaibhavzodge\\Downloads\\po7q2ieuk3r4-Body_Mesh_Rigged\\Body_Mesh_Rigged.obj");
		java.io.FileReader fr = new java.io.FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		while((line=br.readLine())!=null)
		{
			if(line.substring(0,2).contains("v "))
			System.out.println(line);
		}
	}

}
