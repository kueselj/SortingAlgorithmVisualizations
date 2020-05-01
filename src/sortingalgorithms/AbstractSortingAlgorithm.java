package sortingalgorithms;

/**
 * Abstract class for a sorting algorithm.
 */
public abstract class AbstractSortingAlgorithm implements ISortingAlgorithm {

  Integer[] integersToSort;

  /**
   * Basic constructor for all sorting algorithms that takes in a list of integers to sort.
   * @param integersToSort the integers to sort.
   */
  public AbstractSortingAlgorithm(Integer[] integersToSort) {
    this.integersToSort = integersToSort;
  }

  @Override
  public abstract Integer[] nextStep();
}
