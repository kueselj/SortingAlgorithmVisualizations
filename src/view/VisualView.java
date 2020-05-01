package view;

import javax.swing.*;
import java.awt.*;

/**
 * A visual representation of a sorting algorithm.
 */
public class VisualView extends JFrame implements IView {


  DrawPanel drawPanel;

  /**
   * Basic constructor for an abstract view.
   */
  public VisualView() {
    this.drawPanel = new DrawPanel();
    this.drawPanel.setSize(new Dimension(800, 600));
    this.drawPanel.setPreferredSize(new Dimension(800, 600));
    this.add(this.drawPanel);
    //FRAME OPERATIONS
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();

  }

  @Override
  public void makeVisible() {
    this.setVisible(true);
  }

  @Override
  public void setIntegers(Integer[] integers) {
    this.drawPanel.setIntegersToDraw(integers);
  }


}
