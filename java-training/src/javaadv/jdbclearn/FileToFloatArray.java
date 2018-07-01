package javaadv.jdbclearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileToFloatArray {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(new File("E:\\ALL_GIT_REPO\\CoreJava-Training\\java-training\\src\\javaadv\\jdbclearn\\vertices.txt"));
		FileReader tr = new FileReader(new File("E:\\ALL_GIT_REPO\\CoreJava-Training\\java-training\\src\\javaadv\\jdbclearn\\texture.txt"));
		
		
		
		float vertices[] = new float[12780];
		float texture[] = new float[8520];
		BufferedReader br = new BufferedReader(fr);
		String line;
		int i = 0;
		while((line=br.readLine())!=null)
		{
			vertices[i]=(float)new Float(line);
			i=i+1;
		}
			
		br = new BufferedReader(tr);
		
		i = 0;
		
		while((line=br.readLine())!=null)
		{
			texture[i]=(float)new Float(line);
			i=i+1;
		}
		
		for(float f:texture)
			System.out.println(f);
		
	}

}
