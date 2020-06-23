package practice.week11;

public class Practical1{
    public static void main(String[] args){
        final String searchChar = "a";
        String sentence = "Kolej Matrikulasi Pulau Pinang";
        String[] arr = sentence.split(searchChar);
        
        System.out.println("Frequency of " + searchChar + " = " + (arr.length-1));
    }

}