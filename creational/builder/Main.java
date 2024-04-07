package creational.builder;

import creational.builder.builder.Meal;
import creational.builder.drink.Pepsi;
import creational.builder.main.Cheeseburger;
import creational.builder.main.Chicken;
import creational.builder.side.IceCream;

public class Main {

  public static void main(String[] args) {
    Meal garethMeal = new Meal();
    Meal vienMeal = new Meal();

    garethMeal.addDrink(new Pepsi()).addMain(new Chicken());
    vienMeal.addMain(new Cheeseburger()).addSide(new IceCream());

    System.out.println(garethMeal);
    System.out.println(vienMeal);

  }

}

