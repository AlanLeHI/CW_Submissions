import java.util.Scanner;

public class Tic {
	static public int stageNum;
	static Scanner gameReader = new Scanner (System.in);
	static String[][] board = new String[3][3];
	static boolean gameState = true;
  /**
	 * I love strings
	 */
 	/**
  * Sol 263k
	 *                             @ddk         $                                                           
                           Boddddddd    dpwwmwmm           k!ix                                      
                            @dddddaddd ddpbwmmh#        ;;;;!!!!!h                                   
                          dddddddMMMMM$hdddpwwwwwB      ;;;{i!!pxr                                   
                        dddddd@       @bWdbpdokpp@      !>!1x~nxxdb:  :::::                          
                      @dddd       @XJJJCJCww*__WM     #'d!rinii)Xnav:j,,:,tt:                        
                     $ddd@      MhbbhJCJQCJJaJJJIJ,:<:,,,,:o_di0vnwh:,c,,:tX:t:h                     
                     ddd       pbbbwJJJJJJJdJJJJIYdd0t:,,,thadni_vah:,`,::,,,,,,:n#                  
                    bdd       Zobb]JJJJJJJZJOJJJMdm)II:,:tZZZZ+>iiZoI^`,,,,,,,,,,,:a                 
                   @dd@      @b$BJBhhJJJJJmZZCJbdbmJwY/*;;o>_ZZiiiZZt,,(,,,,,,,`ttaw*a               
                   add       #QJZJZkodJmZZZdBZJJ#MWCJJJJC:;_)XZmiZoot:d,::,,haoakh|(1W @MMMk@@    @M#
                   dd$      Qwxnaaaaaa*QhMM@ZZmmwZJJJJJJJ]{dkmmmmbmtxx:,:ja**ooXt|){`1p              
                   dd       ZZZZBbaaaaaaaaCkdvv#zzXZZZdJCbaozZbmmmkm;:::fo*wzzzzvX{''^I{             
                   dd      cZZZZZ@aaaaaaCvb$acozzzzzZOB$B(zX #wwwwwmImpnk$zzzzzzzxn###jfffff$        
                   Md       aZOnwZMwwwMwawBfXZhXzzzzzpkkbaB$*B$$oa]JJJJkk        vBo                 
                    d@       @M###kmmdahmmJ|  $fZzJOW  bbb1MMZBJJpmZJphW@  WM  vvv(zhh               
                    *d      p#k@W#dd}*YY+<<_ff          $BppppppbppppppBh 0}}kopv0dB                 
                     d      @b##bb[Od*_dY+I*fft         pppppppooaoppppa$ ]o{{O{Xc@                  
                      #   $XXZJBWdbJC#/M[1mb$MM        kdddddpao#ZdpppaWb{{{{{#                      
                       hXXX}_ZJJJJJ>p;!YkJJp$WMB     @$ddbdoo*o$$pdpha"'')MMk{B                      
                   oJJZ####McZCJJCa;;;M*Mdbbb#@W    $obdaoooO$11rki{{{kB    WB                       
              @CCCCJX#***###Bmr;#dddddv$WJ##1#v    $dddoow   Wb'{{1Mb*d                              
          mQQQCx#booooaohBwfkwxMddd*lIovjJ##vvvb   bboo$aaYJ){{1Bd*dMo                               
     @00000WW$$*zCooM*zzzzzz0cjII#phdm  /vvvYvvvk    $*k^{{)M   @bhbb@                               
 OQOOOWB$@$zzzzzzzzzzzzzz0B*0(lII[lJI     $cccccc$ Bh/{{)Wohoa   @ka*o                               
OZ$B@@M####zzJzzzzzzz$WOOOB  |vaIIlI#B     /zzzzml111/B  #o@**h@  ****@                              
 ZWW*oMMMM#XXX##kBdZZZ@     /IlIlllY $     Jbkl111#      $@khhh@  kko**                              
 aOa:o#WMM#z$BmmwB        "lllfzll    )  ooW]x)BY$       @h*h*Wb @kkkB*@                             
  a*#WMM$dwwd           ,llllllxM     bdQ]WBYYYYYo     Whhhahp   *kkk**                              
   p$ppp@             W!!p!!!!!(      WMMOYYYYJJJJ    @B*@hhk     kkk*@                              
                      c!!!!!!!!         $OCCCQCC0C     Obp@       dv*h                               
                     W(!!!!!!!M          xQQQkQQQQ*               hv**k                              
                     Jii>iiiiCtffffftW$W$B0000k0000              h*MahM@                             
                    nC(iiiii!         $$$0OOOOOOOOOZ            m@aohaad                             
                   BBdQ/<>>>~            CZZZdkammmmb@@           ahh$@                              
                   OZB}<<<<f              ZZZZmoMobWZZZZ         hwmmp@                              
                   @|MJJJZZ$               #MMMaMM*mZaMM         ahhMWd                              
                    zcvYYJO                                                                          
                    mbZQQw#                                                                          
                    Wbbbbb@                                                                          
	 */
	
	/**
	 * Starts the game, replaces all the slots inside the arrays with the Japanese Ro character and prints the board, 
	 * it also creates a loop that switches priority to the players until there's a winner
	 */
public static void start()
{
	//replaces all stuff in the board with ro
	for (int i = 0; i < board.length; i++)
	{
		for(int k = 0; k < board[i].length; k++)
		{
			if(board[i][k] == null)
			{
				board[i][k] = "ロ";
			}
		}
	}
	//welcomes the player
	System.out.println("Welcome to tic-tac-toe");
	//prints the board
	printArr(board);
	//loop for the games
	while (gameState)
	{
		//player one, checks if they in, player 2, check for win, loop
		playerOne();
		printArr(board);
		check(board, true);
		playerTwo();
		printArr(board);
		check(board, 0);
	}
}
/**
 * gives control to player one, it takes the input and sends it to the placer method, if the input is too short or too long
 * it reprompts the user by recalling the method
 */
public static void playerOne()
{
	if(gameState)
	{
		System.out.println("Player 1:");
		String input = gameReader.nextLine();
		int length = input.length();
		if (length > 2 || length < 2)
		{
			System.out.println("Invalid: Try Again");
			playerOne();
		}
		else
		{
			placer(input, true);
		}
	}
	
}

/**
 * Places the X using coordinates from player 1 by splitting the String into two parts and placing it into the 
 * 2D array
 * @param cords
 * @param player
 */
public static void placer(String cords, boolean player)
{
	int x = 0;
	int y = 0;
	//checks to see if both coordinates are valid
	boolean check1 = false;
	boolean check2 = false;
	//splits string
	String cord1 = cords.substring(0,1);
	String cord2 = cords.substring(1);
	//sets cords to lower case
	cord1 = cord1.toLowerCase();
	cord2 = cord2.toLowerCase();
	//if they type in a letter, gives it the appropriate coordinate EX: a = 0, b = 1 and sets flag to true so it can continue
	if (cord1.equalsIgnoreCase("a"))
		{
			x = 0;
			check1 = true;
		}
	else if (cord1.equalsIgnoreCase("b"))
		{
			x = 1;
			check1 = true;
		}
	else if (cord1.equalsIgnoreCase("c"))
		{
			x = 2;
			check1  = true;
		}
	//if it failed, reprompts player
	else
		{
			System.out.println("Invalid: Try Again");
			playerOne();
		}
	// if it passed the first check continue
	if (check1)
		{
		//reads number and gives appropriate coordinate and sets second flag to true
		if (cord2.equalsIgnoreCase("1"))
			{
				y = 0;
				check2 = true;
			}
			else if (cord2.equalsIgnoreCase("2"))
			{
				y = 1;
				check2 = true;
			}
			else if (cord2.equalsIgnoreCase("3"))
			{
				y = 2;
				check2 = true;
			}
		//if it failed this flag, reprompts player
			else
			{
				System.out.println("Invalid: Try Again");
				playerOne();
			}
			System.out.println(x + " " + y);
			//if everything is valid and space is empty, place an X
			if((check1)&& (check2) && (board[x][y] == "ロ"))
			{
				board[x][y] = "X";
			}
			//if everything is valid and space is taken, reprompt player
			else if (board[x][y] == "0" || board[x][y]  == "X")
			{
				printArr(board);
				System.out.println("Space is taken, try again");
				playerOne();
			}
		}
	//check if there's three in a row
		check(board, true);
	}
	
	
/**
 * Places the 0 using coordinates from player 1 by splitting the String into two parts and placing it into the 
 * 2D array
 * @param cords
 * @param player
 */
public static void placer(String cords, int player)
{
	//cords
	int x = 0;
	int y = 0;
	//checks to see if everything went through
	boolean check1 = false;
	boolean check2 = false;
	//splits it into 2 string
	String cord1 = cords.substring(0,1);
	String cord2 = cords.substring(1);
	//makes it lowercase
	cord1 = cord1.toLowerCase();
	cord2 = cord2.toLowerCase();
	//gives coordinate matching the character and sets check to true
	if (cord1.equalsIgnoreCase("a"))
		{
			x = 0;
			check1 = true;
		}
	else if (cord1.equalsIgnoreCase("b"))
		{
			x = 1;
			check1 = true;
		}
	else if (cord1.equalsIgnoreCase("c"))
		{
			x = 2;
			check1  = true;
		}
	else
		{
			System.out.println("Invalid: Try Again");
			playerTwo();
		}
	//if check goes through, checks the other string
	if (check1)
		{
		//gives coordinate matching the coordinate
		if (cord2.equalsIgnoreCase("1"))
			{
				y = 0;
				check2 = true;
			}
		else if (cord2.equalsIgnoreCase("2"))
			{
				y = 1;
				check2 = true;
			}
		else if (cord2.equalsIgnoreCase("3"))
			{
				y = 2;
				check2 = true;
			}
		//if invalid reprompts the user
		else
		{
			System.out.println("Invalid: Try Again");
			playerTwo();
		}
		System.out.println(x + " " + y);
		
		//sets coordinate if everything is valid and there's an empty space
		if ((check1) && (check2) && (board[x][y] == "ロ"))
		{
			board[x][y] = "0";
		}
		//if everything is valid but the space's taken, reprompts user
		else if (board[x][y] == "X" || board[x][y]  == "0")
		{
			printArr(board);
			System.out.println("Space is taken, try again");
			playerTwo();
		}
		}
	//checks if the board has a win
		check(board, 0);
}
	
/**
 * gives control to player two, it takes the input and sends it to the placer method, if the input is too short or too long
 */
public static void playerTwo()
{
	if (gameState)
	{
		System.out.println("Player 2:");
		String input = gameReader.nextLine();
		if (input.length() < 2 && input.length() > 2)
		{
			System.out.println("Invalid: Try Again");
			playerTwo();
		}
		//places it if the input is valid
		placer(input, 1);
	}
	
}
/**
 * prints the 2D array row major order
 * @param board
 */
public static void printArr(String[][] board2)
{
	//pritns out each element in the row, going down 1 row at a time
	for (int  i = 0; i < board2.length; i++)
	{
		//goes through the row to print
		for(int k = 0; k<board2[i].length; k++)
		{
			System.out.print(board2[i][k]);
			//comma for spacing
			System.out.print(", ");
		}
		//rows on next line
		System.out.println();
	}
	System.out.println();
}
public static void check(String[][] board, boolean player)
{
	//checks the amount of squares occupied 
	int count = 0;
	//goes through the 2D array checking for spaces
	for (int i = 0; i < board.length; i++)
	{
		for(int k = 0; k < board[i].length; k++)
		{
			//if it isn't "empty" it adds one to the counter
			if(board[i][k] != "ロ")
			{
				count++;
			}
		}
	}
	//checks if there's a 3 in a row, ends game by setting gameState, the requirement for the while loop to continue, to false
	for (int i = 0; i < board.length; i++) 
	{
		if (board[i][0] == "X" && board[i][1] == "X" && board[i][2] == "X")
		{
			System.out.println("Player 1 wins");
			gameState = false;
		}
	}
	//checks for 3 in a row vertically
	for (int i = 0; i < board.length; i++)
	{
		if (board[0][i] == "X" && board[1][i] == "X" && board[2][i] == "X")
		{
			System.out.println("Player 1 wins");
			gameState = false;
		}
	}
	//across 3 in a rows
	if (board[0][0] == "X" && board[1][1] == "X" && board[2][2] == "X")
	{
		System.out.println("Player 1 wins");
		gameState = false;
	}
	else if (board[0][2] == "X" && board[1][1] == "X" && board[0][2] == "X")
	{
		System.out.println("Player 1 wins");
		gameState = false;
	}
	//if board is full
	else if(count == 9)
	{
		System.out.println("Board is full,  tie");
		gameState = false;
	}
}
/**
 * checks if the board has a winning set
 * @param board
 * @param player
 */
public static void check(String[][] board, int player)
{
	//space counter
	int count = 0;
	//counts amount of occupied spaces
	for (int i = 0; i < board.length; i++)
	{
		for(int k = 0; k < board[i].length; k++)
		{
			if(board[i][k] != "ロ")
			{
				count++;
			}
		}
	}
	//checks for 3 in a row horizontally
	for (int i = 0; i < board.length; i++) 
	{
		if (board[i][0] == "0" && board[i][1] == "0" && board[i][2] == "0")
		{
			System.out.println("Player 2 wins");
			gameState = false;
		}
	}
	//checks for 3 in a row vertically
	for (int i = 0; i < board.length; i++)
	{
		if (board[0][i] == "0" && board[1][i] == "0" && board[2][i] == "0")
		{
			System.out.println("Player 2 wins");
			gameState = false;
		}
	}
	//checks for 3 in a row across
	if (board[0][0] == "0" && board[1][1] == "0" && board[2][2] == "0")
	{
		System.out.println("Player 2 wins");
		gameState = false;
	}
	//checks for 
	else if (board[0][2] == "0" && board[1][1] == "0" && board[0][2] == "0")
	{
		System.out.println("Player 2 wins");
		gameState = false;
	}
	//if the board is full, ties and ends game
	else if(count == 9)
	{
		System.out.println("Board is full,  tie");
		gameState = false;
	}
}
}
