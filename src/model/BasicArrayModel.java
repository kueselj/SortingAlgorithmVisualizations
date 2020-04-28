package model;

import java.util.*;

/**
 * Represents the model which is an array.
 */
public class BasicArrayModel implements IArrayModel {

  private  Integer[] integers;

  /**
   * Basic constructor for an ArrayModel. Returns a randomly ordered array with integers from 1
   * to the specified integer.
   * @param numIntegers the size of the array.
   */
  public BasicArrayModel(int numIntegers) {
    List<Integer> temp = new ArrayList<Integer>();

    for (int i = 0; i < numIntegers; i ++) {
      temp.add(i + 1);
    }
    Collections.shuffle(temp);

    this.integers = temp.toArray(new Integer[temp.size()]);
  }


  @Override
  public void setArray(Integer[] array) {
    this.integers = array;
  }
}