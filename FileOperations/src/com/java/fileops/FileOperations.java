package com.java.fileops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations
{
	public static void main(String[] args) throws IOException
	{
//		This file should be in the same folder as .classpath file, 
//		which is the root of the project folder on the file system
		File inputFile = new File("readme.txt");
		System.out.println(inputFile.getAbsolutePath());
		
		BufferedReader br = new BufferedReader(new FileReader(inputFile));
		ArrayList<String> fileContents = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		
		while(line != null)
		{
			fileContents.add(line);
			fileContents.add(System.lineSeparator());
			sb.append(line);
			sb.append(System.lineSeparator());
			line = br.readLine();
		}
		
		System.out.println("Output as a string builder: ");
		System.out.println(sb.toString());
		System.out.println("Output as a array list to string: ");
		System.out.println(fileContents.toString());
		
		System.out.println("Iterating through the array list elements: ");
		for(int i = 0; i < fileContents.size(); i++)
		{
			System.out.printf(fileContents.get(i));
		}
		
		writeContentsToFile();
		
		br.close();
	}
	
	public static void writeContentsToFile() throws FileNotFoundException
	{
//		This file should be in the same folder as .classpath file, 
//		which is the root of the project folder on the file system
		Scanner in = new Scanner(System.in);
        File fileName = new File("names.txt");
        String name;
        System.out.println("Enter the first customer name: ");
        name = in.nextLine();
        PrintWriter pw = new PrintWriter(fileName);
        try
        {
		    while (!name.equalsIgnoreCase("done"))
		    {
		        pw.println(name);
		        System.out.println("Enter the next name or \"done\" to exit.");
		        name = in.nextLine();            
		    }
		    
		    pw.close();
        }
        catch(Exception e)
        {
            System.out.println("Error encountered " + e.toString());
        }
	}
}