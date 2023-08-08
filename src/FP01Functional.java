import java.util.List;
import java.util.function.Predicate;

//Problem 1: Functional Approach Print each element from a List on its own line
//Problem 1: Functional Approach Print even numbers from a List on its own line
public class FP01Functional {
    public static void main(String[] args) {
//      printAllNumberInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
        printEvenNumberInListFunctional(List.of(12,9,13,4,6,2,4,12,15));

    }
    private static void printAllNumberInListFunctional(List<Integer> numbers){
//      What to do?
        numbers.stream()
                .forEach(System.out::println); // Method Reference = className + :: + static methodName
    }
    private static void printEvenNumberInListFunctional(List<Integer> numbers){
//      What to do?
        numbers.stream()
                .filter(FP01Functional::isEven) //  Filter - Only allow even numbers
                .forEach(System.out::println); // Method Reference = className + :: + static methodName
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
