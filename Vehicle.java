public class Vehicle {

  private String make;
  private String model;
  private double speedInKmh;
  private Engine engine;
  private static int numberOfVehicles;

  public Vehicle(String make, String model, Engine engine) {
    this.make = make;
    this.model = model;
    Vehicle.numberOfVehicles++;
    this.engine = engine;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public double getSpeedInKmh() {
    return speedInKmh;
  }

  public Engine getEngine() {
    return engine;
  }

  public static int getNumberOfVehicles() {
    return Vehicle.numberOfVehicles;
  }

  public void accelerate(int valueInKmh) {
    speedInKmh += valueInKmh;
    System.out.println(toString() + " beschleunigt auf " + speedInKmh + "km/h");
  }

  public void brake(int valueInKmh) {
    speedInKmh -= valueInKmh;
    System.out.println(toString() + " bremst auf " + speedInKmh + "km/h ab");
  }

  public String toString() {
    return make + " " + model;
  }

}
