public class Methods{
    public void displayMessage(){
            System.out.print("Hello, World!");
    }
    public void printStatus(int a, int b){
        if(a<b)
            System.out.print(a + " is minimum.");
        else
            System.out.print(b + "is minimum.");
    }
    public int findArea(int l, int w){
        return l*w;
    }
    public boolean isDivisible(int x, int y){
        if(x % y == 0)
            return true;
        else
            return false;
    }
}