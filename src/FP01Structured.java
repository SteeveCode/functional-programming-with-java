import java.util.List;

//Problem 1: Traditional Approach Print each element from a List on its own line

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumberInListStructured(List.of(12,9,13,4,6,2,4,12,15));
    }
    private static void printAllNumberInListStructured(List<Integer> numbers){
//        How to loop the numbers?

        for(int number:numbers){
            System.out.println(number);
        }
    }
}
