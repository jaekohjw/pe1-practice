/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0000000X
 */

public class Customer extends Human{

  public Customer(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Customer: " + super.toString();
  }

}
