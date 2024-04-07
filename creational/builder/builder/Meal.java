package creational.builder.builder;

import creational.builder.drink.Drink;
import creational.builder.main.Mains;
import creational.builder.side.Sides;

public class Meal {
  private Mains main;
  private Sides side;
  private Drink drink;

  public Meal () {

  }

  public Meal(Mains mains, Sides sides, Drink drinks) {
    this.main = mains;
    this.side = sides;
    this.drink = drinks;
  }

  public Meal addMain(Mains mains) {
    this.main = mains;
    return this;
  }

  public Meal addSide(Sides sides) {
    this.side = sides;
    return this;
  }

  public Meal addDrink(Drink drinks) {
    this.drink = drinks;
    return this;
  }

  public String toString() {
    return "Meal [main=" + main + ", side=" + side + ", drink=" + drink + "]";
  }

}
