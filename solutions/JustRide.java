class JustRide implements CabService, PrivateCarService {
  private int rate = 22;

  public int computeFare(Request req) {
    int fare = 0;
    if (req.isSurcharge()) {
      fare += 500;
    }
    fare += req.getDist() * this.rate;
    return fare;
  }

  @Override
  public String toString() {
    return "JustRide";
  }
}
