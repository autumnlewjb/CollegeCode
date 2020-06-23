class CalculateTotalEvenNumber{
  public static void main(String[] args){
    int total = 0;
    int x;
    
    for(x=2; x<=100 ; x++){
      if (x % 2 == 0){
        total += x;
      }else{
        break;
      }
    }
    
    System.out.println(total);
  }
}

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

class DisplayOddNumber{
  static int x;
  
  public static void main(String[] args){
    for (x=1; x<40 ; x++){
      if (x%2 != 0){
        System.out.print(x + " ");
      }else{
        break;
      }
    }
  }
}

class PrintMultiplesOfFive{
  static int x;
  
  public static void main(String[] args){
    int rec = 0;
    int n = 0;
    while (rec < 40 && n >= 0){
      rec = 5 * n;
      n++;
    }
    System.out.print(rec + " ");
  }
}

class Average{
  static int x;
  
  public static void main(String[] args){
    int total = 0;
    int n = 0;
    x = 1;
    while (x<=20){
      if (n%2 == 0){
        total +=n;
        n++;
        x++;
      }
      double average = total/x;
    }
  }
}
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
