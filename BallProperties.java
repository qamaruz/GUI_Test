import java.awt.Graphics2D;

public class BallProperties {
	int x = 0;
	int y = 0;
	int xm = 1;
	int ym = 1;

	public void moveBall(int height, int width){
		if (x + xm < 0)
			xm =1;
		if (x + xm > width - 30)
			xm =-1;
		if (y + ym < 0)
			ym =1;
		if (y + ym > height - 30)
			ym =-1;
		
		x = x + xm;
		y = y + ym;
	}
	
	public void paint(Graphics2D g){
		g.fillOval(x, y, 30, 30);
	}
	
}
