package demo;

import java.util.ArrayList;

public class StateTaxList {
  private ArrayList<StateTax> stateTax = new ArrayList<>();

  StateTaxList(){
    stateTax.add(new StateTax("UT", 6.85));
    stateTax.add(new StateTax("NV", 8));
    stateTax.add(new StateTax("TX", 6.25));
    stateTax.add(new StateTax("AL", 4));
    stateTax.add(new StateTax("CA", 8.25));
  }

  public ArrayList<StateTax> getStateTax() {
    return stateTax;
  }
}
