package creational.abstractfactory.interfaces;

public abstract class OnlinePayment implements PaymentGateway {

  public void pay() {
    payOnline();
  }

  public abstract void payOnline();
  
}
