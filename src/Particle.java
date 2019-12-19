import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Particle {
	
	private static final int avgSpeed = 5;			// average speed in pixels/frame
	private static final int avgSize = 30;			// average size in pixels
	private static final int avgLife = 50;			// average life in milliseconds
	
	private int x;
	private int y;
	private int vx;
	private int vy;
	private int size;
	private int life;
	private Color color;	
	private String name;
	
	public Particle(String name, int x, int y, Color color)
	{
		// TODO: your constructor code goes here
		// assign starting position (x,y) and color of the particle
		
		
		
		
		// TODO: use Math.random() to initialize random values for size, life, and velocity of the particle
		// the average size, life, and velocity over all particles must be avgSize, avgLife, and avgSpeed, respectively

		
		
		
	}
	
	// Update particle's position and life
	// Return true if the particle is dead (life == 0)
	public boolean update()
	{ 
		// increment particle's position by velocity 
		x += vx;
		y += vy;
		
		// TODO:
		// check for collision and bounce off the wall
		
		
		// TODO:
		// update particle's remaining life
		
		
		// TODO: 
		// check if life is negative (particle is dead). if so, return true	


		return false;
	}
	
	// Draw particle on the screen
	public void render(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g.create();
		
		g2d.setColor(color);
		g2d.fillOval(x-(size/2), y-(size/2), size, size);

		// TODO: display particle's info next to the particle object
			
		
		g2d.dispose();
	}
	
	
	public String toString()
	{
		return "Particle " + name + " at (" + x + ", " + y + ")";
	}

}

/* 2017 revision */
