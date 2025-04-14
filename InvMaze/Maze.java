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
	Player Jeff = new Player();
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
	dantesPizza(maze);
	maze[Jeff.getrPos()][Jeff.getcPos()].setBorder(false);
	maze[Jeff.getrPos()][Jeff.getcPos()].setHasPlayer(true);
	
	System.out.println("ur lost enter WASD to move");
	//welcomes the player I know it says tic-tac-toe but it's funny
	System.out.println("Welcome to tic-tac-toe");
	//prints the board
	printArr(maze);
	//loop for the game
	while (check(maze, Jeff))
	{
		//I know the if statement isn't necessary, but it's funnier
		if(check(maze, Jeff))
		{
				if (check(maze, Jeff))
				{
					playerOne(Jeff);
					printArr(maze);
				}
			}
		}
	}
/**
 * It reads the input,  then moves the player
 */
public static void playerOne(Player Jeff)
{
	if(check(maze, Jeff))
	{
		System.out.println("Player 1:");
		String input = gameReader.nextLine();
		int length = input.length();
		if (length > 1  || length < 1)
		{
			System.out.println("Invalid: Try Again");
			playerOne(Jeff);
		}
		else
		{
			placer(input, true, Jeff);
		}
	}
	
}

/**
 * moves the player in the direction they type, bonks and reveals if it's appropriate
 * 2D array
 * @param cords
 * @param player
 */
public static void placer(String cords, boolean player, Player Jeff)
{
	//don't ask
	String cord1 = cords;
	//sets cords to lower case
	cord1 = cord1.toLowerCase();
	//reads the input, reveals path and bonks if it's a wall, moves the player to that GameTile if not, yeah that's the rest of the code 
	if (cord1.equalsIgnoreCase("w"))
		{
		if (maze[Jeff.getrPos() - 1][Jeff.getcPos()].isBorder || maze[Jeff.getrPos() - 1][Jeff.getcPos()].isWall)
		{
			//bonk reveals the wall
			System.out.println("BONK");
			if(maze[Jeff.getrPos() - 1][Jeff.getcPos()].isRevealed == false)
			{
				maze[Jeff.getrPos() - 1][Jeff.getcPos()].setRevealed(true);			
			}
		}
		else
		{
			Jeff.reposition(Jeff, maze, -1, 0);
		}
		}
	else if (cord1.equalsIgnoreCase("a"))
		{
		if (maze[Jeff.getrPos()][Jeff.getcPos() - 1].isBorder || maze[Jeff.getrPos()][Jeff.getcPos() - 1].isWall)
		{
			System.out.println("BONK");
			if(maze[Jeff.getrPos()][Jeff.getcPos() - 1].isRevealed == false)
			{
				maze[Jeff.getrPos()][Jeff.getcPos() - 1].setRevealed(true);			
			}
		}
		else
		{
			Jeff.reposition(Jeff, maze, 0, -1);
		}
		}
	else if (cord1.equalsIgnoreCase("s"))
		{
		if (maze[Jeff.getrPos() + 1][Jeff.getcPos()].isBorder || maze[Jeff.getrPos() + 1][Jeff.getcPos()].isWall)
		{
			System.out.println("BONK");
			if(maze[Jeff.getrPos() + 1][Jeff.getcPos() ].isRevealed == false)
			{
				maze[Jeff.getrPos() + 1][Jeff.getcPos() ].setRevealed(true);			
			}
		}
		else
		{
			Jeff.reposition(Jeff, maze, 1, 0);
		}
		}
	else if (cord1.equalsIgnoreCase("d"))
	{
		if (maze[Jeff.getrPos()][Jeff.getcPos() + 1].isBorder || maze[Jeff.getrPos()][Jeff.getcPos() + 1].isWall)
		{
			System.out.println("BONK");
			if(maze[Jeff.getrPos()][Jeff.getcPos() + 1].isRevealed == false)
			{
				maze[Jeff.getrPos()][Jeff.getcPos() + 1].setRevealed(true);			
			}
		}
		else
		{
			Jeff.reposition(Jeff, maze, 0, 1);
		}
	}
	}
	
	

/**
 * prints the 2D array row major order, prints specific stuff to represent the gametiles
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
				System.out.print(" X ");
			}
			//
			else if (board2[i][k].isHasPlayer())
			{
				System.out.print(" 8 ");
			}
			else if(board2[i][k].isRevealed() && board2[i][k].isWall())
			{
				System.out.print(" W ");
			}
			else if(board2[i][k].isRevealed())
			{
				System.out.print(" H ");
			}
			else
			{
				System.out.print(" J ");
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
public static void dantesPizza(GameTile[][] maze)
{
	for (int i = 0; i < maze.length; i++)
	{
		for (int k = 0; k < maze[i].length; k++)
		{
			maze[i][k].setWall(true);
		}
	}
	for (int i = 0; i < maze.length; i++)
	{
		for (int k = 0; k < maze[i].length; k++)
		{
			if(Math.random() >= 0.46)
			maze[i][k].setWall(false);
		}
	}
	maze[maze.length - 1][maze[0].length - 1].setPoint(true);
	maze[maze.length - 1][maze[0].length - 1].setWall(false);
	if(!comboBreak(0, 0, new ArrayList<int[]>()))
	{
		dantesPizza(maze);
	}
}

public static boolean comboBreak(int r, int c, ArrayList<int[]> jefferson)
{
	boolean yippeee = false;
	jefferson.add(new int[] {r,c});
	//left
	if(r == maze.length - 1 && c == maze[0].length -1)
	{
		return true;
	}
	if(c > 0 && !maze[r][c - 1].isWall && !imcooking(r,c - 1,jefferson) && !yippeee)
	{
		yippeee = comboBreak(r, c - 1, jefferson);
	}
	//right
	if(c < maze[r].length - 1 && !maze[r][c + 1].isWall && !imcooking(r, c + 1,jefferson) && !yippeee)
	{
		yippeee = comboBreak(r, c + 1, jefferson);
	}
	//up
	if(r > 0 && !maze[r - 1][c].isWall && !imcooking(r - 1, c,jefferson) && !yippeee)
	{
		yippeee = comboBreak(r - 1, c, jefferson);
	}
	//down
	if(r < maze.length - 1 && !maze[r + 1][c].isWall && !imcooking(r + 1, c,jefferson)&& !yippeee)
	{
		yippeee = comboBreak(r + 1, c, jefferson);
	}
	
	return yippeee;
}

public static boolean imcooking(int y, int x, ArrayList<int[]> jefferson)
{
	boolean flipper = false;
	for (int i = 0; i < jefferson.size(); i++)
	{
		for(int k = 0; k < jefferson.get(i).length; k++)
		{
			int[] jack = jefferson.get(i);
			if(jack[0] == y && jack[1] == x)
			{
				flipper = true;
			}
		}
	}
	return flipper;
}
}
