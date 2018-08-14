package Chapters.chapter4.StackApplet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

import javax.swing.JApplet;

public class StackApplet extends JApplet {
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		this.setSize(800,800);
		String message = "Jimbo Aztec";
		Font fontOne = new Font("Serif", Font.PLAIN, 12  );
		Font fontTwo = new Font("SansSerif", Font.BOLD, 24);
		Font fontThree = new Font("Monospaced", Font.ITALIC, 48);
		Font fontFour = new Font("Dialog", Font.BOLD + Font.ITALIC, 96);
		
		FontRenderContext context = g2.getFontRenderContext();
		
		Rectangle2D boundsOne = fontOne.getStringBounds(message, context);
		
		double strAscentOne = -boundsOne.getY( );
		double strHeightOne = boundsOne.getHeight( );
		double strWidthOne = boundsOne.getWidth( );
		double strStartOne = (getWidth() - strWidthOne) / 2;
		double yTopOne = (getHeight() - strHeightOne) / 2;
		double yBaseOne = (yTopOne + strAscentOne);
		g2.setFont(fontOne);
		g2.setColor(Color.black);
		g2.drawString(message, (float) strStartOne, (float) yBaseOne - 250);
		
		Rectangle2D boundsTwo = fontTwo.getStringBounds(message, context);
		
		double strAscentTwo = -boundsTwo.getY( );
		double strHeightTwo = boundsTwo.getHeight( );
		double strWidthTwo = boundsTwo.getWidth( );
		double strStartTwo = (getWidth() - strWidthTwo) / 2;
		double yTopTwo = (getHeight() - strHeightTwo) / 2;
		double yBaseTwo = (yTopTwo + strAscentTwo);
		g2.setFont(fontTwo);
		g2.setColor(Color.blue);
		g2.drawString(message, (float) strStartTwo, (float) yBaseTwo - 150);

		Rectangle2D boundsThree = fontThree.getStringBounds(message, context);
		
		double strAscentThree = -boundsThree.getY( );
		double strHeightThree = boundsThree.getHeight( );
		double strWidthThree = boundsThree.getWidth( );
		double strStartThree = (getWidth() - strWidthThree) / 2;
		double yTopThree = (getHeight() - strHeightThree) / 2;
		double yBaseThree = (yTopThree + strAscentThree);
		g2.setFont(fontThree);
		g2.setColor(Color.red);
		g2.drawString(message, (float) strStartThree, (float) yBaseThree);
		
		Rectangle2D boundsFour = fontFour.getStringBounds(message, context);
		
		double strAscentFour = -boundsFour.getY( );
		double strHeightFour = boundsFour.getHeight( );
		double strWidthFour = boundsFour.getWidth( );
		double strStartFour = (getWidth() - strWidthFour) / 2;
		double yTopFour = (getHeight() - strHeightFour) / 2;
		double yBaseFour = (yTopThree + strAscentFour);
		g2.setFont(fontFour);
		g2.setColor(Color.green);
		g2.drawString(message, (float) strStartFour, (float) yBaseFour + 200);

	}
}
