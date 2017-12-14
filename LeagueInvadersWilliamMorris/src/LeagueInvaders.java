import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.Timer;

public class LeagueInvaders {
<<<<<<< HEAD
	
	JFrame gameFrame;
	final int WIDTH = 500;
	final int HEIGHT = 800;
	GamePanel gamePanel;
	
=======

	JFrame frame;
	final int width = 500;
	final int height = 800;
	GamePanel gamepanel=new GamePanel();

	LeagueInvaders() {
		frame = new JFrame();
		frame.setSize(width, height);
		frame.setTitle("LeagueInvaders");frame.addKeyListener(gamepanel);
	}

>>>>>>> origin/master
	public static void main(String[] args) {
		new LeagueInvaders();
	}
	
	public LeagueInvaders() {
		gameFrame = new JFrame();
		gamePanel = new GamePanel();
		
		setup();
	}
	
	public void setup() {
		gameFrame.add(gamePanel);
		gameFrame.addKeyListener(gamePanel);
		gameFrame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        gameFrame.pack();

<<<<<<< HEAD
		
		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(gameFrame.EXIT_ON_CLOSE);
		gamePanel.startGame();
=======
	void setup() {
		frame.add(gamepanel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		gamepanel.startGame();

>>>>>>> origin/master
	}
	
}
