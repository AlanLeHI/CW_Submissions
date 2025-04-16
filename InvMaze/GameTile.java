
public class GameTile {
boolean hasPlayer;
boolean isRevealed;
boolean isWall;
boolean isBorder;
boolean isPoint;
/**
 * does maze stuff, sets how the maze works and makes sure everything is in check
 * @return
 */

//sees if it's the winning point
public boolean isPoint() {
	return isPoint;
}

//seets if its the winning point
public void setPoint(boolean isPoint) {
	this.isPoint = isPoint;
}

//gameplayer constructor, creates the tile
public GameTile()
{
	hasPlayer = false;
	isRevealed = false;
	isWall = false;
	isBorder = false;
	isPoint = false;
}

//says if its a border
public boolean isBorder() {
	return isBorder;
}

//sets to border
public void setBorder(boolean isBorder) {
	this.isBorder = isBorder;
}

//sees if has player
public boolean isHasPlayer() {
	return hasPlayer;
}

//sets the player point
public void setHasPlayer(boolean hasPlayer) {
	this.hasPlayer = hasPlayer;
}

//sees if its revealed
public boolean isRevealed() {
	return isRevealed;
}

//sets it to be or unrevealed
public void setRevealed(boolean isRevealed) {
	this.isRevealed = isRevealed;
}

//checks if wall
public boolean isWall() {
	return isWall;
}

//sets if wall or not wall
public void setWall(boolean isWall) {
	this.isWall = isWall;
}

//returns string depending on tile stats
public static String toString(GameTile board2)
{
	if (board2.isBorder())
	{
		return(" X ");
	}
	//if player
	else if (board2.isHasPlayer())
	{
		return(" 8 ");
	}
	//if revealed wall
	else if(board2.isRevealed() && board2.isWall())
	{
		return(" W ");
	}
	//if revealed path
	else if(board2.isRevealed())
	{
		return(" H ");
	}
	//hidden stuff
	else
	{
		return(" J ");
	}
}
}
