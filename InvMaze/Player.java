
public class Player {
private int rPos;
private int cPos;


public Player()
{
	rPos = 0;
	cPos = 0;
}


public int getrPos() {
	return rPos;
}


public void setrPos(int rPos) {
	this.rPos = rPos;
}


public int getcPos() {
	return cPos;
}


public void setcPos(int cPos) {
	this.cPos = cPos;
}
public void reposition(Player guy, GameTile[][] maze, int rPos, int cPos)
{
	maze[guy.getrPos()][guy.getcPos()].setHasPlayer(false);
	maze[guy.getrPos()][guy.getcPos()].setRevealed(true);
	guy.setrPos(guy.getrPos() + rPos);
	guy.setcPos(guy.getcPos() + cPos);
	maze[guy.getrPos()][guy.getcPos()].setHasPlayer(true);
	
}
}
