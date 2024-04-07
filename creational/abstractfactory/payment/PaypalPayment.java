package creational.abstractfactory.payment;

import creational.abstractfactory.interfaces.OnlinePayment;

public class PaypalPayment extends OnlinePayment {
  
  @Override
  public void payOnline() {
    System.out.println("PaypalPayment: paying");
  }
  
}
