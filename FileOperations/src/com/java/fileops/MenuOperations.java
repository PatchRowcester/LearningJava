package com.java.fileops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuOperations
{
	public static BufferedReader readMenu() throws FileNotFoundException
	{
		BufferedReader br = new BufferedReader(new FileReader("menu.txt"));
		return br;
	}
	
	public static void writeMenu(BufferedReader br) throws IOException
	{
		Scanner input = new Scanner(System.in);
		File file = new File("prices.txt");
		PrintWriter pw = new PrintWriter(file);
		String line = br.readLine();
		int price;
		
		while(line != null)
		{
			System.out.println("Enter the price for " + line);
			price = input.nextInt();
			pw.println(line + "\t" + Integer.toString(price));
			line = br.readLine();
		}
		
		pw.close();
		input.close();
	}
}
