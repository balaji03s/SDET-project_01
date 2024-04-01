package Capgemini;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFilewriter {

	public static void main(String[] args) throws IOException {
		
		String csvFileName=System.getProperty("user.dir")+"\\Data\\example.csv";
		FileWriter writer=new FileWriter(csvFileName);
		
		writer.append("Name,age,Email \n");
		writer.append("Balaji,32,balajioging@gmail.com");
		writer.append("Uma,28,uma@gmail,com");
		
		writer.close();
		
		System.out.println(csvFileName);
		
	}

}
