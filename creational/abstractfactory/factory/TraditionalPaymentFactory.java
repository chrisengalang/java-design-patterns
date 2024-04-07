package creational.abstractfactory.factory;

import creational.abstractfactory.interfaces.PaymentGateway;
import creational.abstractfactory.interfaces.TraditionalPayment;
import creational.abstractfactory.payment.MastercardPayment;
import creational.abstractfactory.payment.VisaPayment;

public class TraditionalPaymentFactory implements PaymentFactory {

  @Override
  public PaymentGateway getPayment(String type) {
    if ("mastercard".equalsIgnoreCase(type)) {
      return new MastercardPayment();
    } else if ("visa".equalsIgnoreCase(type)) {
      return new VisaPayment();
    }
    return null;
  }

}
