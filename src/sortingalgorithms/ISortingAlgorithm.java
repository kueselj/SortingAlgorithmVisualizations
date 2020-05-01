package sortingalgorithms;

/**
 * Interface representing a sorting algorithm.
 */
public interface ISortingAlgorithm {

  /**
   * Takes the next step in the algorithm and returns the given step.
   * @return the step to return. Should be same size.
   */
  Integer[] nextStep();
}
