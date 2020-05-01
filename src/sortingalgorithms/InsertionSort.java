package sortingalgorithms;

public class InsertionSort extends AbstractSortingAlgorithm {


  private int arrayLength;
  private int i;
  private int j;
  private int key;
  boolean inWhileLoop;


  /**
   * Basic constructor for all sorting algorithms that takes in a list of integers to sort.
   *
   * @param integersToSort the integers to sort.
   */
  public InsertionSort(Integer[] integersToSort) {
    super(integersToSort);
    this.arrayLength = integersToSort.length;
    this.i = 1;
    this.j = this.i - 1;
    this.inWhileLoop = false;

  }

  @Override
  public Integer[] nextStep() {

    if (this.i < this.arrayLength) {



      if (!this.inWhileLoop) {
        this.key = this.integersToSort[this.i];
        this.j = this.i - 1;
      }

      if (this.j >= 0 && this.integersToSort[j] > this.key) {
        this.inWhileLoop = true;
        this.integersToSort[this.j + 1] = this.integersToSort[this.j];
        this.j--;
        return this.integersToSort.clone();
      }

      this.inWhileLoop = false;
      this.integersToSort[this.j + 1] = this.key;
      this.i++;
      return this.integersToSort;
    }

    else {
      return this.integersToSort;
    }
  }


  /*Function to sort array using insertion sort*/
  public Integer[] sort(Integer arr[]) {
    int n = arr.length;
    for (int i=1; i<n; ++i) {
      int key = arr[i];
      int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
      while (j>=0 && arr[j] > key) {
        arr[j+1] = arr[j];
        printArray(arr);
        j = j-1;
      }
      arr[j+1] = key;
      printArray(arr);
    }
    return arr.clone();
  }


  /* A utility function to print array of size n*/
  static void printArray(Integer arr[])
  {
    int n = arr.length;
    for (int i=0; i<n; ++i)
      System.out.print(arr[i] + " ");

    System.out.println();
  }
}
