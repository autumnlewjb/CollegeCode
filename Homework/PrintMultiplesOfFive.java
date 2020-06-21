class PrintMultiplesOfFive{
  static int x;
  public static void main(String[] args){
    int rec = 0;
    int n = 0;
    while (rec < 40 && n >= 0){
      rec = 5 * n;
      n++;
      System.out.print(rec + " ");
    }
  }
}