import java.awt.Graphics;

public class GameObject {
<<<<<<< HEAD

	int x;
    int y;
    int width;
    int height;

	public GameObject(int x, int y, int width, int height) {
		
		
	}
	
	public void update() {
		
	}
	
	public void draw(Graphics g) {
		g.fillRect(10, 10, 100, 100);
	}
	
=======
	 int x;
     int y;
     int width;
     int height;
GameObject(int x,int y,int width,int height){
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
}
void update() {
x+=5;
y+=5;
}
void draw(Graphics g) {
	g.fillRect(x, y, width, height); 
}
>>>>>>> origin/master
}
