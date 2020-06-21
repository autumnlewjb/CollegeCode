class DisplayEvenNumber{
  static int x;
  public static void main(String[] args){
    for (x=2; x<=40; x++){
      if (x % 2 == 0){
        System.out.print(x + " ");
      }
    }
  }
}