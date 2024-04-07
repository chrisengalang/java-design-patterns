package creational.abstractfactory.factory;

public class AbstractPaymentFactory {

  public static PaymentFactory getPaymentGateway(String type) {
    if ("online".equalsIgnoreCase(type)) {
      return new OnlinePaymentFactory();
    } else if ("traditional".equalsIgnoreCase(type)) {
      return new TraditionalPaymentFactory();
    }
    return null;
  }
}
