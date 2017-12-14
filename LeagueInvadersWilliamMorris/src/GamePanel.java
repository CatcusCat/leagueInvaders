import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;
<<<<<<< HEAD

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer t;
GameObject gameObject;

public GamePanel() {
	t = new Timer(1000/60, this);
	gameObject = new GameObject(10, 10, 100, 100);
}

public void startGame() {
	t.start();
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
}

@Override
public void paintComponent(Graphics g){
	
	}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("typed");
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("pressed");
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("released");
}
=======
public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	GameObject gameobject;
	GamePanel() {
      timer=new Timer(1000/60, this);
      gameobject=new GameObject(10,10,100,100);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	     repaint();
	     gameobject.update();
	}
	void startGame() {
		
		timer.start();
	}
	 @Override
	 public void paintComponent(Graphics g){
		       gameobject.draw(g);
	         }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hii");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hiii");
	}

>>>>>>> origin/master
}
