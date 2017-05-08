package com.java.fileops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RunMenuOperations
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = MenuOperations.readMenu();
		MenuOperations.writeMenu(br);
	}

}
