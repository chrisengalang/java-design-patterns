package creational.singleton;

public class Main {

  public static void main(String[] args) {

    DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();

    System.out.println(databaseConnection == databaseConnection2);
    System.out.println(databaseConnection);
    System.out.println(databaseConnection2);
  }
}
