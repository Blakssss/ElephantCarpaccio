package demo;

import java.util.ArrayList;

public class DiscountList {
  private ArrayList<Discount> discountList = new ArrayList<>();


  DiscountList(){
    discountList.add(new Discount(1000, 3));
    discountList.add(new Discount(5000, 5));
    discountList.add(new Discount(7000, 7));
    discountList.add(new Discount(10000, 10));
    discountList.add(new Discount(50000, 15));
  }

  public ArrayList<Discount> getDiscountList() {
    return discountList;
  }
}
