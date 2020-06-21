public class Average{
  static int total;
  static int n;
  public static void main(String[] args){
    int x = 1;
    while (x<=20){
      
      if (n % 2 == 0){
        total = total + n;
        x++;
      }
     n++;
    }
    int average = total/x;
    System.out.println(average);
    //System.out.println(total);
  }
}