import java.util.Scanner;

class MainApp{
    void displayMessage(){
            System.out.print("Hello, World!");
    }
    void printStatus(int a, int b){
        if(a<b)
            System.out.print(a + " is minimum.");
        else
            System.out.print(b + "is minimum.");
    }
    int findArea(int l, int w){
        return l*w;
    }
    boolean isDivisible(int x, int y){
        if(x % y == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        MainApp obj = new MainApp();
        obj.displayMessage();
        System.out.println();
        obj.printStatus(7,12);
        System.out.println();
        System.out.println(obj.findArea(6,2));
        System.out.println(obj.isDivisible(6,2));
    }
}