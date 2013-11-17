// P6 Assignment
// Author: Daniel Ball
// Date:  11/16/2013
// Class:  CS160
// Email:  dsball@rams.colostate.edu

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class P6 
{
	static String pieTitle = "Pie Chart";
	static int pieElements;
	static String[] pieLabels;
	static double[] pieData;
	
	static String barTitle = "Bar Chart";
	static int barElements;
	static double[] barData1;
	static double[] barData2;
	
	static String lineTitle = "Line Graph";
	static int lineElements;
	static double[] lineData1;
	static double[] lineData2;
	static double[] lineData3;
	
	public static void main(String[] args) 
	{
		readFile(args[0]);
	}
	
	private static void readFile(String inputFile) 
	{
		try
		{
			Scanner iStream = new Scanner(new File(inputFile));
			if(iStream.hasNextLine())
			{
				fillPie(iStream);
				fillBar(iStream);
				fillLine(iStream);
			}
			else
			{
				System.out.println("ERROR: INPUT FILE IS EMPTY!");
				
			}
			iStream.close();
		}
		catch(IOException e)
		{
			System.out.println("ERROR: COULD NOT READ INPUT FILE");
		}
	} 
	
	public static void fillPie(Scanner pieStream)
	{
		if(pieStream.hasNextInt())
		{
			pieElements = pieStream.nextInt();
			pieLabels = new String[pieElements];
			pieData = new double[pieElements];
		}
		else
		{
			System.out.println("ERROR: CHECK FILE FORMATTING");
			return;
		}
		for(int i = 0 ; i<pieElements ; i++)
		{
			if(pieStream.hasNext())
			{
				pieLabels[i] = pieStream.next();
			}
			else
			{
				System.out.println("ERROR: CHECK FILE FORMAT");
				return;
			}
		}
		for(int i = 0 ; i<pieElements ; i++)
		{
			if(pieStream.hasNextDouble())
			{
				pieData[i] = pieStream.nextDouble();
			}
			else
			{
				System.out.println("ERROR: CHECK FILE FORMAT");
				return;
			}
		}
	}
	
	public static void fillBar(Scanner barStream)
	{
		if(barStream.hasNextInt())
		{
			barElements = barStream.nextInt();
			barData1 = new double[barElements];
			barData2 = new double[barElements];
		}
		else
		{
			System.out.println("ERROR: CHECK FILE FORMATTING");
			return;
		}
		for(int j = 0 ; j < 2 ; j++)
		{
			for(int i = 0 ; i<barElements ; i++)
			{
				if(barStream.hasNextDouble())
				{
					if(j == 0)
					{
						barData1[i] = barStream.nextDouble();
					}
					else
					{
						barData2[i] = barStream.nextDouble();
					}
				}
				else
				{
					System.out.println("ERROR: CHECK FILE FORMAT");
					return;
				}
			}
		}
				
	}
	
	public static void fillLine(Scanner lineStream)
	{
		if(lineStream.hasNextInt())
		{
			lineElements = lineStream.nextInt();
			lineData1 = new double[lineElements];
			lineData2 = new double[lineElements];
			lineData3 = new double[lineElements];
		}
		else
		{
			System.out.println("ERROR: CHECK FILE FORMATTING");
			return;
		}
		for(int j = 0 ; j <3 ; j++)
		{
			for(int i = 0 ; i<lineElements ; i++)
			{
				if(lineStream.hasNextDouble())
				{
					if(j == 0)
					{
						lineData1[i] = lineStream.nextDouble();
					}
					else if(j == 1)
					{
						lineData2[i] = lineStream.nextDouble();
					}
					else
					{
						lineData3[i] = lineStream.nextDouble();
					}
				}
				else
				{
					System.out.println("ERROR: CHECK FILE FORMAT");
					return;
				}
			}
		}
	}
	
	private static void displayCharts() 
	{
		
	} 
}


