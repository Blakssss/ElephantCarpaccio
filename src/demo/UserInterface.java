package demo;

import java.util.Locale;
import java.util.Objects;

public class UserInterface {

  DiscountList discountList = new DiscountList();
  StateTaxList stateTaxList = new StateTaxList();
  Input input = new Input();
  int finalPrice = 0;
  int discountedPrice = 0;
  String stateCode;
  double taxedPrices = 0;

  public void Ordering() {
    System.out.println("How many items do you wanna order?");
    int amountOfOrders = input.getIntInput();

    for (int i = 0; i < amountOfOrders; i++) {
      System.out.println("What's the price of your item?");
      int pricePerItem = input.getIntInput();
      finalPrice = finalPrice + pricePerItem;
    }
    System.out.println("The total price of your order is: " + finalPrice);
    System.out.println("");

    System.out.println("What's your state code?");
    stateCode = input.getStringInput().toUpperCase(Locale.ROOT);

  }

  public void discountedPrice() {
    if (finalPrice <= discountList.getDiscountList().get(0).OrderValue) {
      discountedPrice = finalPrice * discountList.getDiscountList().get(0).DiscountRate / 100;
      finalPrice = finalPrice - discountedPrice;
    } else if (finalPrice > discountList.getDiscountList().get(0).OrderValue && finalPrice <= discountList.getDiscountList().get(1).OrderValue) {
      discountedPrice = finalPrice * discountList.getDiscountList().get(1).DiscountRate / 100;
      finalPrice = finalPrice - discountedPrice;
    } else if (finalPrice > discountList.getDiscountList().get(1).OrderValue && finalPrice <= discountList.getDiscountList().get(2).OrderValue) {
      discountedPrice = finalPrice * discountList.getDiscountList().get(2).DiscountRate / 100;
      finalPrice = finalPrice - discountedPrice;
    } else if (finalPrice > discountList.getDiscountList().get(2).OrderValue && finalPrice <= discountList.getDiscountList().get(3).OrderValue) {
      discountedPrice = finalPrice * discountList.getDiscountList().get(3).DiscountRate / 100;
      finalPrice = finalPrice - discountedPrice;
    } else if (finalPrice > discountList.getDiscountList().get(3).OrderValue && finalPrice <= discountList.getDiscountList().get(4).OrderValue) {
      discountedPrice = finalPrice * discountList.getDiscountList().get(4).DiscountRate / 100;
      finalPrice = finalPrice - discountedPrice;
    }
    System.out.println("The total price of your order after the discount rate is: " + finalPrice);

  }
    public void taxedPrice() {
      if (Objects.equals(stateCode, stateTaxList.getStateTax().get(0).state)) {
        taxedPrices = finalPrice * stateTaxList.getStateTax().get(0).TaxRate / 100;
        taxedPrices = taxedPrices + finalPrice;
      }
      if (Objects.equals(stateCode, stateTaxList.getStateTax().get(1).state)) {
        taxedPrices = finalPrice * stateTaxList.getStateTax().get(1).TaxRate / 100;
        taxedPrices = taxedPrices + finalPrice;
      }
      if (Objects.equals(stateCode, stateTaxList.getStateTax().get(2).state)) {
        taxedPrices = finalPrice * stateTaxList.getStateTax().get(2).TaxRate / 100;
        taxedPrices = taxedPrices + finalPrice;
      }
      if (Objects.equals(stateCode, stateTaxList.getStateTax().get(3).state)) {
        taxedPrices = finalPrice * stateTaxList.getStateTax().get(3).TaxRate / 100;
        taxedPrices = taxedPrices + finalPrice;
      }
      if (Objects.equals(stateCode, stateTaxList.getStateTax().get(4).state)) {
        taxedPrices = finalPrice * stateTaxList.getStateTax().get(4).TaxRate / 100;
        taxedPrices = taxedPrices + finalPrice;
      }
      System.out.println("Your total price after state taxes is: " + (int) taxedPrices);
    }
  }

