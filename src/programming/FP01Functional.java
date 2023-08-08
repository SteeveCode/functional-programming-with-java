package programming;

import java.util.List;
import java.util.function.Predicate;

//Problem 1: Functional Approach Print each element from a List on its own line
//Problem 2: Functional Approach Print even numbers from a List on its own line using Lambda expression
public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printAllNumberInListFunctional(numbers);
//      printEvenNumberInListFunctional(List.of(12,9,13,4,6,2,4,12,15));

    }
    private static void printAllNumberInListFunctional(List<Integer> numbers){
//      What to do?
        numbers.stream()
                .forEach(System.out::println); // Method Reference = className + :: + static methodName
    }
    private static void printEvenNumberInListFunctional(List<Integer> numbers){
//      What to do?
        numbers.stream()
                .filter(number -> number % 2 == 0) // Lambda Expression
                .forEach(System.out::println); // Method Reference = className + :: + static methodName
    }

}
