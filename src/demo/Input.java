package demo;

import java.util.Scanner;

public class Input {
  private Scanner stringInput = new Scanner(System.in);
  private Scanner intInput = new Scanner(System.in);

  public int getIntInput() {
    try{
      return intInput.nextInt();
    } catch (Exception e){
      System.out.println("Invalid input");
      intInput.nextLine();
      return getIntInput();
    }
  }

  public String getStringInput() {
    return stringInput.nextLine();
  }
}
