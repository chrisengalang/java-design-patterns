package creational.abstractfactory;

import creational.abstractfactory.factory.AbstractPaymentFactory;
import creational.abstractfactory.factory.PaymentFactory;
import creational.abstractfactory.interfaces.PaymentGateway;

public class Main {

  public static void main(String[] args) {

    PaymentFactory traditionalFactory = AbstractPaymentFactory.getPaymentGateway("traditional");

    PaymentGateway visaPayment = traditionalFactory.getPayment("visa");
    PaymentGateway mastercardPayment = traditionalFactory.getPayment("mastercard");

    visaPayment.pay();
    mastercardPayment.pay();

    PaymentFactory onlineFactory = AbstractPaymentFactory.getPaymentGateway("online");

    PaymentGateway paypalPayment = onlineFactory.getPayment("paypal");
    PaymentGateway wisePayment = onlineFactory.getPayment("wise");

    paypalPayment.pay();
    wisePayment.pay();

  }

}