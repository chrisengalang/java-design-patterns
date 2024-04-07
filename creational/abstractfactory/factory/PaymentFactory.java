package creational.abstractfactory.factory;

import creational.abstractfactory.interfaces.PaymentGateway;

public interface PaymentFactory {
  PaymentGateway getPayment(String type);
}
