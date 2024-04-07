package creational.abstractfactory.interfaces;

public abstract class TraditionalPayment implements PaymentGateway {

  public void pay() {
    payTraditional();
  }

  public abstract void payTraditional();
}
