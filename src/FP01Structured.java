import java.util.List;

//Problem 1: Traditional Approach Print each element from a List on its own line
//Problem 1: Traditional Approach Print even numbers from a List on its own line

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//      printAllNumberInListStructured(numbers);
        printEvenNumberInListStructured(numbers);

    }
    private static void printAllNumberInListStructured(List<Integer> numbers){
//      How to loop the numbers and then what to do?
        for(int number:numbers){
            System.out.println(number);
        }
    }
    private static void printEvenNumberInListStructured(List<Integer> numbers){
        for(int number:numbers){
            if(number % 2 == 0)
                System.out.println(number);
        }
    }
}
