package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel {

  Integer[] integersToDraw;

  /**
   * Basic Constructor for the Animation Panel.
   */
  public DrawPanel() {
    super();
    this.setBackground(Color.WHITE);
    Integer[] temp = new Integer[1];
    temp[0] = 20;
    this.integersToDraw = temp;
  }

  /**
   * Sets the integers to draw.
   * @param integers the integers to draw.
   */
  public void setIntegersToDraw(Integer[] integers) {
    this.integersToDraw = integers;
    this.repaint();
  }



  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(Color.BLACK);
    for (int i = 0; i < this.integersToDraw.length; i++) {
      if (integersToDraw[i] % 3 == 0) {
        g2d.setColor(Color.RED);
      }
      else {
        g2d.setColor(Color.BLACK);
      }
      g2d.fillOval(i * (800 / integersToDraw.length),
              600 - integersToDraw[i] * (600 / integersToDraw.length),
              10,
              10);
    }
  }
}
