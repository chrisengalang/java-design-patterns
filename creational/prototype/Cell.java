package creational.prototype;

public class Cell implements Cloneable {

  private String content;

  public Cell () {

  }

  public Cell(Cell cell) {
    this.content = cell.content;
  }


  public String toString() {
    return content;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Cell clone() {
    return new Cell(this);
  }

}
