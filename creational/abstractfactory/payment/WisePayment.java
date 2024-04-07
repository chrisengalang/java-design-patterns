package creational.abstractfactory.payment;

import creational.abstractfactory.interfaces.OnlinePayment;

public class WisePayment extends OnlinePayment {
  
  @Override
  public void payOnline() {
    System.out.println("WisePayment: paying");
  }
  
}
