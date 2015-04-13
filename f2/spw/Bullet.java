package f2.spw;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Bullet extends Sprite{
	
	private int step = 15;
	public static final int Bullet_TO_DIE = 30;
	private boolean alive = true;
	private Image b_r;
	
	public Bullet(int x,int y){
		super(x, y, 4, 30);
	}
	@Override
	public void draw(Graphics2D g){
		try{
			b_r = ImageIO.read(new File("D:\\b_r.gif"));
		}catch(IOException e){
			e.printStackTrace();
		}
		g.drawImage(b_r, x, y, width, height, null);
	
	}
	public void proceed(){
		y -= step;
		if(y < Bullet_TO_DIE){
			alive = false;
		}

	}
	public boolean isAlive(){
		return alive;
	}

	public void getHit(){
		alive = false;
	}
}
