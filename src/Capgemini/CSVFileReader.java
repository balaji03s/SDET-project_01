package Capgemini;

import java.io.File;
import java.util.Scanner;

public class CSVFileReader {

	public static void main(String[] args) {
		
		File file=new File(System.getProperty("user.dir")+"\\Data\\example.csv");
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(",");
		
		while(sc.hasNext())
		{
			System.out.println(sc.next()+"\t");
		}
		sc.close();
		
		
	}

}
