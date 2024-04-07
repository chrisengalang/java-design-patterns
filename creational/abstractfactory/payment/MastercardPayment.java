package creational.abstractfactory.payment;

import creational.abstractfactory.interfaces.TraditionalPayment;

public class MastercardPayment extends TraditionalPayment  {
  
  @Override
  public void payTraditional() {
    System.out.println("MastercardPayment: paying");
  }
  
}
