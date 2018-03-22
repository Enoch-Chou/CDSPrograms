package Chapters.chapter4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class StackApplet extends JApplet{
	public StackApplet() {
		message = JOptionPane.showInputDialog("Enter in a name to stack:");
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		Font word1 = new Font("serif", Font.BOLD, 20);
		Font word2 = new Font("SansSerif", Font.ITALIC, 30);
		Font word3 = new Font("Monospaced", Font.PLAIN, 40);
		Font word4 = new Font("Dialog", Font.BOLD | Font.ITALIC, 50);
		
		FontRenderContext context = g2.getFontRenderContext();
		
		Rectangle2D bounds1 = word1.getStringBounds(message, context);
		
		double strAscent = -bounds1.getY();
		double strHeight = bounds1.getHeight();
		double strWidth = bounds1.getWidth();
		double x = (getWidth() - strWidth)/2;
		double yTop = (getHeight() - strHeight)/2;
		double yBase = yTop + strAscent;
		g2.setFont(word1);
		g2.setColor(Color.black);
		g2.drawString(message, (float)x, (float)yBase - 140);
		
		Rectangle2D bounds2 = word2.getStringBounds(message, context);
		
		double strAscent2 = -bounds2.getY();
		double strHeight2 = bounds2.getHeight();
		double strWidth2 = bounds2.getWidth();
		double x2 = (getWidth() - strWidth2)/2;
		double yTop2 = (getHeight() - strHeight2)/2;
		double yBase2 = yTop2 + strAscent2;
		g2.setFont(word2);
		g2.setColor(Color.blue);
		g2.drawString(message, (float)x2, (float)yBase2 - 70);
		
		Rectangle2D bounds3 = word3.getStringBounds(message, context);
		
		double strAscent3 = -bounds3.getY();
		double strHeight3 = -bounds3.getHeight();
		double strWidth3 = bounds3.getWidth();
		double x3 = (getWidth() - strWidth3)/2;
		double yTop3 = (getHeight() - strHeight3)/2;
		double yBase3 = yTop3 + strAscent3;
		g2.setFont(word3);
		g2.setColor(Color.cyan);
		g2.drawString(message, (float)x3, (float)yBase3 - 20);
		
		Rectangle2D bounds4 = word4.getStringBounds(message, context);
		
		double strAscent4 = -bounds4.getY();
		double strHeight4 = -bounds4.getHeight();
		double strWidth4 = bounds4.getWidth();
		double x4 = (getWidth() - strWidth4)/2;
		double yTop4 = (getHeight() - strHeight4)/2;
		double yBase4 = yTop4 + strAscent4;
		g2.setFont(word4);
		g2.setColor(Color.gray);
		g2.drawString(message, (float)x4, (float)yBase4 + 70);
		
		Rectangle box = new Rectangle(1,1, getWidth()-4, getHeight()-4);
		g2.setColor(Color.darkGray);
		g2.draw(box);
	}
	private String message;
}
