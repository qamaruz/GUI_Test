import javax.swing.*;

public class Game 
{	
	
	public static void main(String[] args) throws InterruptedException
	{
		JFrame frame = new JFrame("Game Testing");
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create JPanel using constructor at GamePaint.java
		GamePaint gamePaint=new GamePaint();
		frame.add(gamePaint);
		
		while (true)
		{
			gamePaint.ball.moveBall(frame.getHeight(),frame.getWidth());
			gamePaint.repaint();
			Thread.sleep(10);
		}
	}
}
