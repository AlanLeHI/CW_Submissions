
public class Player {
private int rPos;
private int cPos;

/**
 * has all the player stats
 */

/**
 * Player constructor, holds their stats
 */
public Player()
{
	rPos = 0;
	cPos = 0;
}


/**
 * returns row position
 * @return
 */
public int getrPos() {
	return rPos;
}

/**
 * sets row position
 * @param rPos
 */
public void setrPos(int rPos) {
	this.rPos = rPos;
}

/**
 * gets col position
 * @return
 */
public int getcPos() {
	return cPos;
}

/**
 * sets col position
 * @param cPos
 */
public void setcPos(int cPos) {
	this.cPos = cPos;
}

/**
 * moves the guy and reveals the path before
 * @param guy
 * @param maze
 * @param rPos
 * @param cPos
 */
public void reposition(Player guy, GameTile[][] maze, int rPos, int cPos)
{
	maze[guy.getrPos()][guy.getcPos()].setHasPlayer(false);
	maze[guy.getrPos()][guy.getcPos()].setRevealed(true);
	guy.setrPos(guy.getrPos() + rPos);
	guy.setcPos(guy.getcPos() + cPos);
	maze[guy.getrPos()][guy.getcPos()].setHasPlayer(true);
	
}
}
