package view;

/**
 * Abstract class representing an abstract implementation of an IView.
 */
public abstract class AbstractView implements IView {

  Integer[] integers;

  /**
   * Basic constructor for an abstract view.
   * @param integers the initial integers to use.
   */
  public AbstractView(Integer[] integers) {
    this.integers = integers;
  }

  @Override
  public void setIntegers(Integer[] integers) {
    this.integers = integers;
  }
}
