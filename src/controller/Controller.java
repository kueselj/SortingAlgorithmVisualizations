package controller;

import model.IArrayModel;
import sortingalgorithms.ISortingAlgorithm;
import sortingalgorithms.InsertionSort;
import view.IView;

import javax.swing.*;

public class Controller {

  private final IArrayModel model;
  private final IView view;

  private Timer timer;
  private int tick;
  private double speed;

  private ISortingAlgorithm sortingAlgorithm;

  public Controller(IArrayModel model, IView view) {
    this.model = model;
    this.view = view;
    view.setIntegers(model.getArray());
    this.tick = 0;
    this.sortingAlgorithm = new InsertionSort(model.getArray());
    this.timer = new Timer(5, e -> this.getNextIteration());
    view.makeVisible();
    this.timer.start();
  }

  /**
   * Gives the view the next iteration of the sorting algorithm.
   */
  public void getNextIteration() {
    this.view.setIntegers(this.sortingAlgorithm.nextStep());
  }
}
