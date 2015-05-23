package javax.swing.overlay;

import java.awt.Color;
import java.awt.Graphics;

public class OvalMark implements OverlayMarking {
	boolean filled;
	Color color;
	int x, y, width, height;

	public OvalMark(boolean fill, Color c, int x, int y, int width, int height) {
		filled = fill;
		color = c;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void paintMarking(Graphics g) {
		g.setColor(color);
		if (filled)
			g.fillOval(x, y, width, height);
		else
			g.drawOval(x, y, width, height);
	}

}
