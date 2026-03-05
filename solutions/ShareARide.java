class ShareARide implements PrivateCarService {
  private int rate = 50;

  public int computeFare(Request req) {
    int fare = 0;
    if (req.isSurcharge()) {
      fare += 500;
    }
    fare += req.getDist() * this.rate;
    return fare / req.getPassengers();
  }

  @Override
  public String toString() {
    return "ShareARide";
  }
}
