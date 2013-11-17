//## Asignment
//Author: Daniel Ball
//Date:   Nov 4, 2013
//Class:  CS160
//Email:  dsball@rams.colostate.edu

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class P5 {
	static String[] lineArray = new String[100];
	static int numberLines = 0;
	static int numberWords = 0;
	static int numberChars = 0;
	static int numberUpper = 0;
	static int numberLower = 0;
	static int numberDigits = 0;
	static int numberSpaces = 0;
	static int numberTabs = 0;
	static int numberSpecial = 0;
	

	
	static private void readFile(String inputFile)
	{
		try
		{
			Scanner iStream = new Scanner(new File(inputFile));
			while(iStream.hasNextLine() && numberLines<100)
			{
				lineArray[numberLines] = iStream.nextLine();
				numberLines++;
			}	
			if(iStream.hasNext())
			{
				System.out.println("ERROR: FILE TOO LARGE TO ANALYZE");
				iStream.close();
				return;
			}
			iStream.close();
		}
		catch(IOException e)
		{
			System.out.println("ERROR: UNABLE TO READ INPUT FILE");
		}
	}
	
	static private void gatherStatistics(String[] lineArray)
	{
		String token = "";
		
		for(int j=0 ; j < numberLines ; j++)
		{
			StringTokenizer st = new StringTokenizer(lineArray[j], " \t", true);
			
			while(st.hasMoreTokens())
			{
				token = st.nextToken();
				boolean isWord = true;
				for(int i = 0; i<token.length(); i++)
				{	
					numberChars++;
					if(Character.isUpperCase(token.charAt(i)))
					{ 
						numberUpper++;
					}
					else if(Character.isLowerCase(token.charAt(i)))
					{
						numberLower++;
					}
					else if( Character.isDigit(token.charAt(i)))
					{
						
						numberDigits++; isWord = false;
					}
					else if(token.equals(" "))
					{
						
						numberSpaces++; isWord = false;
					}
					else if(token.equals("\t"))
					{
						numberTabs++; isWord = false;
					}
					else
					{
						numberSpecial++;
					}
				}
				if(isWord){numberWords++;}
			}
		}
	}
	
	static private void writeFile(String outputFile)
	{
		PrintWriter oStream = null;
		try 
		{
			oStream = new PrintWriter(new File(outputFile));
			oStream.println("Number of Lines: " + numberLines);
			oStream.println("Number of Words: " + numberWords);
			oStream.println("Number of Characters: " + numberChars);
			oStream.println("Number of Uppercase: " + numberUpper);
			oStream.println("Number of Lowercase: " + numberLower);
			oStream.println("Number of Digits: " + numberDigits);
			oStream.println("Number of Spaces: " + numberSpaces);
			oStream.println("Number of Tabs: " + numberTabs);
			oStream.println("Number of Special: " + numberSpecial);
			
		} 
		catch (IOException e) 
		{
			System.out.println("ERROR: UNABLE TO WRITE OUTPUT");
		}
		if(oStream != null)
		{
			oStream.close();
		}
	}
	

	
	public static void main(String[] args) 
	{
		readFile(args[0]);
		gatherStatistics(lineArray);
		writeFile(args[1]);
	}
	
}
