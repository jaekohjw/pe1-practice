class Booking implements Comparable<Booking> {
  private Car car;
  private Service service;
  private Request req;
  private int fare;
  private int waitTime;

  public Booking(Car car, Service service, Request req) throws IllegalArgumentException {
    if (!(car.canProvide(service))) {
      throw new IllegalArgumentException(
          String.format("%s does not provide the %s service.", car, service));
    } else {
      this.car = car;
      this.service = service;
      this.req = req;
      this.fare = service.computeFare(req);
      this.waitTime = car.getWaitTime();
    }
  }

  @Override
  public int compareTo(Booking that) {
    if (this.fare != that.fare) {
      return this.fare - that.fare;
    } else {
      if (this.waitTime != that.waitTime) {
        return this.waitTime - that.waitTime;
      } else {
        return this.hashCode() - that.hashCode();
      }
    }
  }
}
