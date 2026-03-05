/**
 * CS2030S PE1 Question 1
 * AY21/22 Semester 2
 *
 * @author A0000000X
 */

public class Trainer extends GymStaff{ 
    
  private boolean occupied;
  private Customer customer;
  private Equipment equipment;

  public Trainer(String name) {
    super(name);
    this.occupied = false;
  }
  
  @Override
  public String toString() {
    return "Trainer: " + super.toString();
  }

  public String getStatus() {
    if (this.occupied == true) {
      return this.toString() + " training " + customer.toString();
    } else {
      return this.toString() + " not training";
    }
  }

  public void startTraining(Customer customer, Equipment equipment) throws CannotTrainException{
    if (this.occupied == true | equipment.isInUse() == true) {
      throw new CannotTrainException();
    }
    equipment.setInUse(true);
    this.occupied = true;
    this.equipment = equipment;
    this.customer = customer;
  }

  public void stopTraining() {
    this.occupied = false;
    this.equipment.setInUse(false);
    this.customer = null;
  }
}
  



