class Cab extends Car {
  private String plate;
  private int availTime;

  public Cab(String plate, int availTime) {
    this.plate = plate;
    this.availTime = availTime;
  }
  
  public int getWaitTime() {
    return this.availTime;
  }

  public boolean canProvide(Service service) {
    if (service instanceof CabService) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    String filler = "";
    if (availTime > 1) {
      filler = "s";
    }
    return String.format("Cab %s (%d min%s away)", plate, availTime, filler);
  }
}
