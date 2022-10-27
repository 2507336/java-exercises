public class Truck extends Vehicle {

  private int cargo;
  private boolean isTransformed;

  public Truck(String make, String model, Engine engine, int cargo) {
    super(make, model, engine);
    this.cargo = cargo;
  }

  public int getCargo() {
    return cargo;
  }

  public boolean isTransformed() {
    return isTransformed;
  }

  public void transform() {
    if (isTransformed) {
      isTransformed = false;
      System.out.println(getMake() + " " + getModel() + " verwandelt sich in einen Lastwagen zurueck");
    } else {
      isTransformed = true;
      System.out.println(getMake() + " " + getModel() + " verwandelt sich in einen Autobot");
    }
  }

  public void print() {
    System.out.println(getMake() + " " + getModel() + " (" + getEngine().getDescription() + ", " + cargo + "t)");
  }
}
