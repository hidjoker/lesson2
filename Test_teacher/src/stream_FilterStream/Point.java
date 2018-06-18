package stream_FilterStream;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Point implements Serializable {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return "Point ("+x+","+y+")";
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
