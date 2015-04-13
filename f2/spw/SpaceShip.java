package f2.spw;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image; //
import java.io.File;//
import java.io.IOException;//
import javax.imageio.ImageIO;//

public class SpaceShip extends Sprite{

	int step = 8;
	private Image b1;
	//private String img = "D:\\spaceship.gif" ;
	
	public SpaceShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics2D g) {
		//g.setColor(Color.GREEN);
		//g.fillRect(x, y, width, height);
		try{
			b1 = ImageIO.read(new File("D:\\spaceship.gif"));
		} catch(IOException e){
			e.printStackTrace();
		}
		g.drawImage(b1, x, y, width, height, null);
	}

	public void move_x(int direction){
		x += (step * direction);
		if(x < 0)
			x = 0;
		if(x > 400 - width)
			x = 400 - width;
	}
	public void move_y(int direction){
		y -= (step * direction);
		if(y < 0)
			y = 0;
		if(y > 600 - width)
			y = 600 - width;
	}

}
