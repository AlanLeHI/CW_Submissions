import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * This method does a tic tac toe. It goes through a loop passing control back to player
 * one and two and checks if it has three in a row. If it does, it declares the player
 * the winner. If the board is full and there's no winner, there's a tie.
 * 
 */
public class Maze {
	//makes a scanner to take inputs to put tics on the board
	static Scanner gameReader = new Scanner (System.in);
	//Makes the board to play on
	static GameTile[][] maze = new GameTile[7][7];
	//while this is true, the game keeps going. It turns false when a player wins
	static boolean gameState = true;
	//flipper determines if player 1 goes twice
	/**
	 * I love strings
	 * Daniel made the funniest maze generator I've seen
	 */
	/** Goku 2L
	 *                                                        @                                                    
                                             @=@                                                    
                                            @-=#                                                    
                                          @%---#@                                                   
                                         @=:---=#%+                                                 
                                         :%:----##*@ %%+                                            
                                        -*+-----+##%#=#-                                            
                                       #:%:---+--#*#:-=#=                                           
                                     =@+#**---#--##---=-+@@-                                        
                                    @=%:#*=-=-#=-##=----:=--@                                       
                                    #=-+=*=-+-=--#**---*-**+#                                       
                             @%#@+++#==#-%*=**-+-**+--=#-*=-=                                       
                           @%%%%++++#==*--%##:----#=--=#**-=-   @                                   
                  @    @:.@%%%@+%:++#=%*=-##:-+=-:#==++#*--=+-+-                                    
               =.:::::-=-@@@@@+++%::%=%#+=-#------#*+###---:+-:                                     
             @:#:::...==-@@@@*++++#=:#*%#*=#+-=----*-----+*--*@                                     
             %+*%%@%%.++=@@@%+++++##==%#+%###=-+--#***--=*=+#@                                      
             @@@#####%+++@@%%%##+++@####=*#%%%+#=-+*%#*##*=+@                                       
             @@@@...::-@*%@%%%%#+++@%%%%##+====#%*---=*+=#@+%                                       
             @@+--+:-::-:-%%%@%%*##%#:+%##=*==*####---##*:@+++=@                                    
             @*=+=:::+:*::*%%%%%%+@%++:%#%==++::::##==-#==++*++=-@                                  
             @++:++=:::+*: @%#%%%@@%+:::=%#-:+:::=:#*=*%%-*++++++=-@                                
              +=#+::=++     @#%%#@@%*::::.+=+:+==---**=%++++++++++++=                               
              @*#:%*=@      @#%%*@@@@+:::::++++::::**@%++++++++++@%%%@@                             
                 @@          #%%#@@@@@*+::::@+::**=-@+#++++++++@%%%%%%#@                            
                             @+%%@@@@@@@++*::::::=%@++++++++++@%%%%%%%%#%@                          
                             @@@%#@@@@@@@%@%***%@@@#####++++%@%%%%%%%%=:@                           
                              #@*%#@@@@@@@@@@@@@@@%%%%###%#@@@%%%%%%::::@                           
                              ##@%%%@@@@@@@@@@@@@%%%%%%%%%%@@@%%%%%::::=::-                         
                              @*%%#%%%@@@@@@@@%%%%%%%%%%%%@@@@@@@+::::-:::::@                       
                                @%%%%%*@%#%%%%%%%%%%%%%%%%%@@@@@++*#*+*::::::                       
                               @@@@%%%@%%%%%%%%%%%%%%%%@%%@@@@@*++::::::-:::::                      
                              @@@@@@@@@@@%%%%%%%%%%@@        @@@+++::::::-:::::=                    
                             %%#%@@@@@@@%%##%@@%#%##@            ++++:::::-::::::=:#                
                        @@%#%##++###@@@@%@%###%%%##%# @@          @*+++:::::+:::::::+:              
                      @++#+++++++*+++++#*+*@%%%%%%@%##------=@       #++++%#+=:::::::*:@            
                 %@+++++++++++++++++++%++++*@%%%%%####----==---=-%        %**++:::::::+::           
              @++++++++++++++++++++++*#++++******#%%##+++++++++---=        #**++::..:::=::@         
            @=++*++++++++++++++++++++%##++##*******%%##*++++++++--+-@       @***+=:..:::+-#@        
          @=++++++++++++++++++++++++*#@%%@#***#****%%%%##++++++++=++=-*      @+*%*+-::::#%###@      
      @#=%=+++++++++++++++#*++++++++%%@%%%***@****%%%%%%%#++++++++=++=--        @*%*++@%###%#%      
     @==#+++++++++++++++++++###*++++%%%%@**%@*****%%%%%%%%#*+++++++=*+==@          @%@@##%#-:::%    
    @==#+++++++++++++++++**+++%%%%%%%%@%%%%%%****#%%%%%%%%%##++++++-##+=%             @@@-:::::::@  
  @%==*++++++++++++***+++++##%%%@@%%@@%%%@*********%@%%%%%%%%##+++++##++-             @@+:::::::::@ 
 %%#+*+++++++++++++++++++++#@@@%#**#@   @***********%%%%%%%%%%%%%%#%%#*+#              *+::::-:::-:@
#%%%%*++++++++++++++++++%%#***@@           @%*******%*%%%%%%%%%%%%%%@*%*@              +++:::=+::+-@
@%#%%%+++++++++++++++%%%*%@                    @#*%*#*%%%%@%%%%%**%@%@%%@              **++:=::==:  
 @%%%%%+++++++++++#+*%@                            @*@%%@%%%@%%%%%@%@%%%               @*+++:+=:@   
  **%%%%%++++++*++#%%@                             @%*@%%@%%%%%@@%%%%%%                 @+*+**+@    
  @**%%%%%%%%%%%%%%%@                               @%%*#%%%%%%%%#@%%@@                    @        
   @**%%%%%%%%%%%%@                                  @@@@@#*%%%%%%%%@                               
     %***#%%%%@%@@                                    @@@@@@@@@@@@                                  
        @@%%%@@                                        @@@@@@@@@%@                                  
                                                         @@@%%%%%@                                                                                                           
	 */
	
	/**
	 * Starts the game, creates the maze,  and loops the thingy until you win. W code
	 */
public static void start()
{
	for(int i  = 0; i < maze.length; i++)
	{
		for (int k = 0;  k  <  maze[i].length;k++)
		{
			maze[i][k] = new GameTile();
		}
	}
	Player plyr = new Player();
	/**
	maze[0][0].setBorder(true);
	maze[0][1].setBorder(true);
	maze[0][2].setBorder(true);
	maze[0][3].setBorder(true);
	maze[0][4].setBorder(true);
	maze[0][5].setBorder(true);
	maze[0][6].setBorder(true);
	maze[1][0].setBorder(true);
	maze[2][0].setBorder(true);
	maze[3][0].setBorder(true);
	maze[4][0].setBorder(true);
	maze[5][0].setBorder(true);
	maze[6][0].setBorder(true);
	maze[6][1].setBorder(true);
	maze[6][2].setBorder(true);
	maze[6][3].setBorder(true);
	maze[6][4].setBorder(true);
	maze[6][5].setBorder(true);
	maze[6][6].setBorder(true);
	maze[1][6].setBorder(true);
	maze[2][6].setBorder(true);
	maze[3][6].setBorder(true);
	maze[4][6].setBorder(true);
	maze[5][6].setBorder(true);
	maze[2][1].setWall(true);
	maze[3][1].setWall(true);
	maze[4][1].setWall(true);
	maze[5][1].setWall(true);
	maze[5][2].setWall(true);
	maze[5][3].setWall(true);
	maze[5][4].setWall(true);
	maze[5][5].setWall(true);
	maze[1][3].setWall(true);	
	maze[2][3].setWall(true);	
	maze[3][3].setWall(true);
	maze[1][4].setWall(true);	
	maze[2][4].setWall(true);	
	maze[3][4].setWall(true);
	maze[1][5].setPoint(true);
	*/
	mazeCre(maze);
	maze[plyr.getrPos()][plyr.getcPos()].setBorder(false);
	maze[plyr.getrPos()][plyr.getcPos()].setHasPlayer(true);
	
	System.out.println("ur lost enter WASD to move");
	//welcomes the player I know it says tic-tac-toe but it's funny
	System.out.println("Welcome to tic-tac-toe");
	//prints the board
	printArr(maze);
	//loop for the game
	while (check(maze, plyr))
	{
		//I know the if statement isn't necessary, but it's funnier
		if(check(maze, plyr))
		{
				if (check(maze, plyr))
				{
					playerOne(plyr);
					printArr(maze);
				}
			}
		}
	}
/**
 * It reads the input,  then moves the player
 */
public static void playerOne(Player plyr)
{
	//if the maze isn't solved go do this
	if(check(maze, plyr))
	{
		//reads input and makes sure it's 1 char
		System.out.println("Player 1:");
		String input = gameReader.nextLine();
		int length = input.length();
		if (length > 1  || length < 1)
		{
			//ask again if it doesn't work
			System.out.println("Invalid: Try Again");
			playerOne(plyr);
		}
		//if it does, does a move
		else
		{
			placer(input, true, plyr);
		}
	}
	
}

/**
 * moves the player in the direction they type, bonks and reveals if it's appropriate
 * 2D array
 * @param cords
 * @param player
 */
public static void placer(String cords, boolean player, Player plyr)
{
	//don't ask
	String cord1 = cords;
	//sets cords to lower case
	cord1 = cord1.toLowerCase();
	//reads the input, reveals path and bonks if it's a wall, moves the player to that GameTile if not, yeah that's the rest of the code 
	if (cord1.equalsIgnoreCase("w"))
		{
		if(plyr.getrPos() == 0)
		{
			System.out.println("BONK");
		}
		else if (maze[plyr.getrPos() - 1][plyr.getcPos()].isBorder || maze[plyr.getrPos() - 1][plyr.getcPos()].isWall)
		{
			//bonk reveals the wall
			System.out.println("BONK");
			//if it's  a wall, it reveals it
			if(maze[plyr.getrPos() - 1][plyr.getcPos()].isRevealed == false)
			{
				maze[plyr.getrPos() - 1][plyr.getcPos()].setRevealed(true);			
			}
		}
		//else moves them
		else
		{
			plyr.reposition(plyr, maze, -1, 0);
		}
		}
	else if (cord1.equalsIgnoreCase("a"))
		{
		if (plyr.getcPos() == 0)
		{
			System.out.println("BONK");
		}
		else if (maze[plyr.getrPos()][plyr.getcPos() - 1].isBorder || maze[plyr.getrPos()][plyr.getcPos() - 1].isWall)
		{
			System.out.println("BONK");
			if(maze[plyr.getrPos()][plyr.getcPos() - 1].isRevealed == false)
			{
				maze[plyr.getrPos()][plyr.getcPos() - 1].setRevealed(true);			
			}
		}
		else
		{
			plyr.reposition(plyr, maze, 0, -1);
		}
		}
	else if (cord1.equalsIgnoreCase("s"))
		{
		if (plyr.getrPos() == maze.length - 1)
		{
			System.out.println("BONK");
		}
		else if (maze[plyr.getrPos() + 1][plyr.getcPos()].isBorder || maze[plyr.getrPos() + 1][plyr.getcPos()].isWall)
		{
			System.out.println("BONK");
			if(maze[plyr.getrPos() + 1][plyr.getcPos() ].isRevealed == false)
			{
				maze[plyr.getrPos() + 1][plyr.getcPos() ].setRevealed(true);			
			}
		}
		else
		{
			plyr.reposition(plyr, maze, 1, 0);
		}
		}
	else if (cord1.equalsIgnoreCase("d"))
	{
		if(plyr.getcPos() == maze[plyr.getrPos()].length - 1)
		{
			System.out.println("BONK");
		}
		else if (maze[plyr.getrPos()][plyr.getcPos() + 1].isBorder || maze[plyr.getrPos()][plyr.getcPos() + 1].isWall)
		{
			System.out.println("BONK");
			if(maze[plyr.getrPos()][plyr.getcPos() + 1].isRevealed == false)
			{
				maze[plyr.getrPos()][plyr.getcPos() + 1].setRevealed(true);			
			}
		}
		else
		{
			plyr.reposition(plyr, maze, 0, 1);
		}
	}
	}
	
	

/**
 * prints the 2D array row major order, prints specific stuff to represent the gametiles
 * I'm gonna be honest, I made the toString method after so I'm too lazy to remake it
 * @param board
 */
public static void printArr(GameTile[][] board2)
{
	//pritns out each element in the row, going down 1 row at a time
	for (int  i = 0; i < board2.length; i++)
	{
		//goes through the row to print
		for(int k = 0; k<board2[i].length; k++)
		{
			//if border X
			if (board2[i][k].isBorder())
			{
				System.out.print(board2[i][k].toString());
			}
			//if player
			else if (board2[i][k].isHasPlayer())
			{
				System.out.print(board2[i][k].toString());
			}
			//if revealed wall
			else if(board2[i][k].isRevealed() && board2[i][k].isWall())
			{
				System.out.print(board2[i][k].toString());
			}
			//if revealed path
			else if(board2[i][k].isRevealed())
			{
				System.out.print(board2[i][k].toString());
			}
			//hidden stuff
			else
			{
				System.out.print(board2[i][k].toString());
			}
		}
		//rows on next line
		System.out.println();
	}
	System.out.println();
}


public static boolean check(GameTile[][] board, Player guy)
{
	int x = -1;
	int y = -1;
	for(int i = 0; i < board.length; i++)
	{
		for(int k = 0; k < board[i].length; k++)
		{
			if(board[i][k].isPoint)
			{
				x = i;
				y = k;
			}
		}
	}
	//win screen with five big booms
	if(guy.getrPos() == x && guy.getcPos() == y)
	{
		System.out.println("YOU GET FIVE BIG BOOMS");
		for(int i = 0; i < 5; i++)
		{
			try 
			{
				TimeUnit.MILLISECONDS.sleep(1500);
				System.out.println("BOOM");
			}
			catch(InterruptedException msg)
			{
				System.err.println("");
			}
		}
		return false;
	}
	else 
	{
		return true;
	}
	
}

/**
 * W naming. it vomits on the board to create a randomized maze. Then uses I'm cooking to check if the maze is solveable
 * @param maze
 */
public static void mazeCre(GameTile[][] maze)
{
	//makes it all walls
	for (int i = 0; i < maze.length; i++)
	{
		for (int k = 0; k < maze[i].length; k++)
		{
			maze[i][k].setWall(true);
		}
	}
	//randomly deletes walls
	for (int i = 0; i < maze.length; i++)
	{
		for (int k = 0; k < maze[i].length; k++)
		{
			if(Math.random() >= 0.68)
			maze[i][k].setWall(false);
		}
	}
	//sets the point to the bottom right corner
	maze[maze.length - 1][maze[0].length - 1].setPoint(true);
	maze[maze.length - 1][maze[0].length - 1].setWall(false);
	//as long as there is an unsolveable maze it keeps running. If the maze is solveable, makes it false so it doesn't run
	if(!pathfind(0, 0, new ArrayList<int[]>()))
	{
		mazeCre(maze);
	}
}

public static boolean pathfind(int r, int c, ArrayList<int[]> list)
{
	//creates boolean to keep the loop running
	boolean path = false;
	//first adds starting cords then new cords.
	list.add(new int[] {r,c});
	if(r == maze.length - 1 && c == maze[0].length -1)
	{
		return true;
	}
	//goes through every direction to check if it's possible, then goes through the path. If there's a path already taken
	//it is added to the created arraylist
	//left
	if(c > 0 && !maze[r][c - 1].isWall && !listMaker(r,c - 1,list) && !path)
	{
		//goes through the path
		path = pathfind(r, c - 1, list);
	}
	//right
	if(c < maze[r].length - 1 && !maze[r][c + 1].isWall && !listMaker(r, c + 1,list) && !path)
	{
		path = pathfind(r, c + 1, list);
	}
	//up
	if(r > 0 && !maze[r - 1][c].isWall && !listMaker(r - 1, c,list) && !path)
	{
		path = pathfind(r - 1, c, list);
	}
	//down
	if(r < maze.length - 1 && !maze[r + 1][c].isWall && !listMaker(r + 1, c,list)&& !path)
	{
		path = pathfind(r + 1, c, list);
	}
	return path;
}
/**
 * checks if the path is already inside the arraylist passed
 * @param y
 * @param x
 * @param list
 * @return
 */
public static boolean listMaker(int y, int x, ArrayList<int[]> list)
{
	//the check
	boolean flipper = false;
	//looks through the entire arraylist
	for (int i = 0; i < list.size(); i++)
	{
		for(int k = 0; k < list.get(i).length; k++)
		{
			//if it exists, returns true
			int[] theList = list.get(i);
			if(theList[0] == y && theList[1] == x)
			{
				flipper = true;
			}
		}
	}
	return flipper;
}
}
