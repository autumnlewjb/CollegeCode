class totalFirstPositiveInteger{
  static int x;
  public static void main(String[] args){
    int total = 0;
    for (x=0; x<20; x++){
      total += x;
    }
    System.out.println(total);
  }
}