
public class GameTile {
boolean hasPlayer;
boolean isRevealed;
boolean isWall;
boolean isBorder;
boolean isPoint;

public boolean isPoint() {
	return isPoint;
}
public void setPoint(boolean isPoint) {
	this.isPoint = isPoint;
}
public GameTile()
{
	hasPlayer = false;
	isRevealed = false;
	isWall = false;
	isBorder = false;
	isPoint = false;
}
public boolean isBorder() {
	return isBorder;
}
public void setBorder(boolean isBorder) {
	this.isBorder = isBorder;
}
public boolean isHasPlayer() {
	return hasPlayer;
}
public void setHasPlayer(boolean hasPlayer) {
	this.hasPlayer = hasPlayer;
}
public boolean isRevealed() {
	return isRevealed;
}
public void setRevealed(boolean isRevealed) {
	this.isRevealed = isRevealed;
}
public boolean isWall() {
	return isWall;
}
public void setWall(boolean isWall) {
	this.isWall = isWall;
}
}
