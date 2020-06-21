package practice.week10;

public class Practical1{
    public static void main(String[] args){
        int[] arrayNum = {10,20,25,63,96,57};
        int i;
        final int searchKey = 96;
        
        for(i=0;i<arrayNum.length;i++){
            if(arrayNum[i] == searchKey){
                System.out.println(searchKey + " is present at index " + i + " and location " + (i+1));
            }
        }
    }
}