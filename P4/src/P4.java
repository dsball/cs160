//P4 Assignment
//Author: Daniel Ball
//Date:   Sep 20, 2013
//Class:  CS160
//Email:  dsball@rams.colostate.edu

//Imports
import java.util.Scanner;

//P4 Class
public class P4 {
	
	//Main
	public static void main(String[] args) {
		
		// Check program arguments
        if (args.length != 2)
        {
            System.out.println("usage: java P4 numberRows numberCols");
            System.exit(-1);
        }
        
        // Store maze size
        int numberRows = Integer.parseInt(args[0]);
        int numberCols = Integer.parseInt(args[1]);

        // Print maze size
        System.err.println("Number of rows: " + numberRows);
        System.err.println("Number of columns: " + numberCols);
        
        // Initial position
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Starting row: ");
        int currentRow = keyboard.nextInt();
        System.out.print("Starting column: ");
        int currentCol = keyboard.nextInt();
        keyboard.close();

        // Create maze
        Maze maze = new Maze(numberRows, numberCols, currentRow, currentCol);   	
        
        //initialize to edge
        boolean onEdge = (currentRow == 0 || currentRow == numberRows-1 || currentCol == 0 || currentCol == numberCols-1);
        while(!onEdge)
        {
        	currentRow--;
        	maze.moveTo(currentRow, currentCol);
        	onEdge = (currentRow == 0);
        }
        int endCol = currentCol;
        int endRow = currentRow;
        
        //Run in a terrified circle, Yubaba is coming!
        do
        {
        	if(currentRow == 0 && currentCol > 0)
        	{
        		currentCol--;
        	}
        	else if(currentCol == 0 && currentRow < numberRows -1)
        	{
        		currentRow++;
        	}
        	else if(currentRow == numberRows -1 && currentCol < numberCols -1)
        	{
        		currentCol++;
        	}
        	else if(currentCol == numberCols-1 && currentRow > 0)
        	{
        		currentRow--;
        	}
        	maze.moveTo(currentRow, currentCol);
        }
        while((currentCol != endCol) || (currentRow != endRow)); 
	}
}


