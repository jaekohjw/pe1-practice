/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0000000X
 */

public class Dumbbell extends Equipment{
  
  private final double weight;
  private int repairCount;

  public Dumbbell(double weight) {
    this.weight = weight;
    this.repairCount = 0;
  }

  public double getWeight() {
    return this.weight;
  }

  public void repair() {
    this.repairCount++;
  }

  public int getRepairCount() {
    return this.repairCount;
  }

  @Override
  public String toString() {
    return "Dumbbell: " + this.weight + " kg";
  }
 
}
    
