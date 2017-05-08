package com.java.fileops;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Peggy Fisher
 */ 
public class CustomerNames {

    /**
     * @param args the command line arguments
     * @throws FileNotFoundException 
     */
	
	public static void main(String[] args) throws FileNotFoundException
	{
		writeToFile();
	}
	
    public static void writeToFile() throws FileNotFoundException 
    {
        Scanner in = new Scanner(System.in);
        File output = new File("customers.txt");
        String name;
        System.out.println("Enter the first customer name: ");
        name = in.nextLine();
        PrintWriter out = new PrintWriter(output);
        try{
        
        while (name.equalsIgnoreCase("done")==false)
        {
            out.println(name);
            System.out.println("Enter the next name or \"done\" to exit.");
            name = in.nextLine();            
        }
        out.close();
        }catch(Exception e)
        {
            System.out.println("Error encountered " + e.toString());
        }
    } 
}