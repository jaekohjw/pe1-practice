class TakeACab implements CabService {
  private int rate = 33;

  public int computeFare(Request req) {
    int fare = 200;
    fare += req.getDist() * this.rate;
    return fare;
  }

  @Override
  public String toString() {
    return "TakeACab";
  }
}
