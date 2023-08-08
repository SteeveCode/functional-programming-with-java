import java.util.List;

//Problem 1: Traditional Approach Print each element from a List on its own line

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumberInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    }
    private static void print(int number){
        System.out.println(number);
    }
    private static void printAllNumberInListFunctional(List<Integer> numbers){
//      What to do?
        numbers.stream()
                .forEach(FP01Functional::print); // Method Reference = className + :: + static methodName

//      How to loop the numbers and what to do?
//        for(int number:numbers){
//            System.out.println(number);
//        }
    }
}
