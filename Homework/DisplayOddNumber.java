class DisplayOddNumber{
  static int x;
  public static void main(String[] args){
    for (x=1; x<40 ; x++){
      if (x%2 != 0){
        System.out.print(x + " ");
      }
    }
  }
}