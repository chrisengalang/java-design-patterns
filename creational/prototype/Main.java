package creational.prototype;

public class Main {
  
  public static void main(String[] args) {
    Cell cell1 = new Cell();
    cell1.setContent("Some Table Header");

    Cell cell2 = cell1.clone();

    System.out.println(cell1);
    System.out.println(cell2);

  }

}
