package creational.abstractfactory.factory;

import creational.abstractfactory.interfaces.PaymentGateway;
import creational.abstractfactory.payment.PaypalPayment;
import creational.abstractfactory.payment.WisePayment;

public class OnlinePaymentFactory implements PaymentFactory {
  @Override
  public PaymentGateway getPayment(String type) {
    if ("paypal".equalsIgnoreCase(type)) {
      return new PaypalPayment();
    } else if ("wise".equalsIgnoreCase(type)) {
      return new WisePayment();
    }
    return null;
  }
}
