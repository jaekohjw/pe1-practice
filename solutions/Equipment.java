/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0000000X
 */

abstract public class Equipment { 

  private boolean inUse = false;

  public void setInUse(boolean a) { 
    this.inUse = a;
  }

  public boolean isInUse() {
    return this.inUse;
  }

  public abstract void repair();
}
