/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0000000X
 */

public class Treadmill extends Equipment {

  private double speed;

  public Treadmill(){
    this.speed = 0;
  }

  public void setSpeed(double newSpeed) {
    this.speed = newSpeed;
  }

  public double getSpeed() {
    return this.speed;
  }

  public void repair() {
    this.speed = 0;
  }

  @Override
  public String toString() {
    return "Treadmill: " + this.speed + " km/h";
  }
}
