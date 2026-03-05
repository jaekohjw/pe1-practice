class PrivateCar extends Car {
  private String plate;
  private int availTime;

  public PrivateCar(String plate, int availTime) {
    this.plate = plate;
    this.availTime = availTime;
  }

  public int getWaitTime() {
    return this.availTime;
  }

  public boolean canProvide(Service service) {
    if (service instanceof PrivateCarService) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    String filler = "";
    if (this.availTime > 1) {
      filler = "s";
    }
    return String.format("PrivateCar %s (%d min%s away)", plate, availTime, filler);
  }
}
