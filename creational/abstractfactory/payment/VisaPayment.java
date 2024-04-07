package creational.abstractfactory.payment;

import creational.abstractfactory.interfaces.TraditionalPayment;

public class VisaPayment extends TraditionalPayment {

  @Override
  public void payTraditional() {
    System.out.println("VisaPayment: paying");
  }

}
