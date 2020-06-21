class CalculateOddNumber{
  public static void main(String[] args){
    int total = 0;
    int x;
    for(x=1; x<100 ; x++){
      if (x % 2 != 0){
        total += x;
      }
    }
    System.out.println(total);
  }
}