import java.util.Scanner;

public class MultipleIf{
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    System.out.print("Enter water used in cubic feet: ");
    double usedWater = input.nextDouble();
    double total = 0;
    if (usedWater <= 1000){
      total += 15 * usedWater;
    }else{
      total += 15 * 1000 + ;
      System.out.println(total);
      if(usedWater > 2000){
        total += 0.0175 * 2000;
        System.out.println(total);
      }
      if (usedWater > 3000){
        total += 70 * (usedWater - 3000);
        System.out.println(total);
      }
    }
    System.out.println(total);
  }
}
