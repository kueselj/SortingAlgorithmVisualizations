package main;

import controller.Controller;
import model.BasicArrayModel;
import model.IArrayModel;
import sortingalgorithms.InsertionSort;
import view.IView;
import view.VisualView;

public final class Main {

  /* A utility function to print array of size n*/
  static void printArray(Integer arr[])
  {
    int n = arr.length;
    for (int i=0; i<n; ++i)
      System.out.print(arr[i] + " ");

    System.out.println();
  }

  public static void main(String[] args) {
    IArrayModel model = new BasicArrayModel(100);

    InsertionSort inSort = new InsertionSort(model.getArray());
    InsertionSort inSort2 = new InsertionSort(model.getArray());

    //printArray(inSort.sort(model.getArray()));
    //System.out.println("~~~~~~~~~~~~~~~~");


    //printArray(model.getArray());
    //for (int i = 0; i < 150; i++) {
      //printArray(inSort2.nextStep());
    //}

    Integer[] integers = new Integer[5];
    integers[0] = 1;
    integers[1] = 2;
    integers[2] = 3;
    integers[3] = 4;
    integers[4] = 5;

    IView view = new VisualView();

    Controller controller = new Controller(model, view);
    //printArray(model.getArray());
  }
}
