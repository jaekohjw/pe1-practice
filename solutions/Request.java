class Request {
  private int dist;
  private int passengers;
  private int time;

  public Request(int dist, int passengers, int time) {
    this.dist = dist;
    this.passengers = passengers;
    this.time = time;
  }

  public boolean isSurcharge() {
    if (time >= 600 && time <= 900) {
      return true;
    } else {
      return false;
    }
  }

  public int getDist() {
    return this.dist;
  }

  public int getPassengers() {
    return this.passengers;
  }
}
