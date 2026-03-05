/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0000000X
 */

public class Gym {

  private int capacity;
  private int current;

  public Gym(int capacity) {
    this.capacity = capacity;
    this.current = 0;
  }

  public void enter(Human human) {
    if (this.capacity - this.current > 0) {
      System.out.println(human + " can enter");
      this.current++;
    } else {
      System.out.println(human + " cannot enter");
    }
  }

  public String toString() {
    return "Gym Capacity: " + this.current + "/" + this.capacity;
  }

}


