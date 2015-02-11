import java.awt.*;
import javax.swing.*;

public class GamePaint extends JPanel{

	BallProperties ball= new BallProperties();
	
	public void paint(Graphics g){
		//super.paint(g) cleans the screen
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//draw ball from BallProperties
		ball.paint(g2d);
	}
}
