package f2.spw;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public abstract class Sprite {
	int x;
	int y;
	int width;
	int height;
	
	public Sprite(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	abstract public void draw(Graphics2D g);
	
	public Double getRectangle() {
		return new Rectangle2D.Double(x, y, width, height);
		//return new Rectangle2D.Double(x+(width*0.125), y+(height*0.125), width*0.75, height*0.75);
	}
}
