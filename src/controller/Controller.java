package controller;

import model.IArrayModel;
import sortingalgorithms.ISortingAlgorithm;
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
    this.tick = 0;

  }
}
