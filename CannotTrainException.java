/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0000000
 */

public class CannotTrainException extends Exception {

  public CannotTrainException() {
    super("CannotTrainException: Cannot Train!");
  }

  @Override public String toString() {
    return "CannotTrainException: Cannot Train!";
  }
}
