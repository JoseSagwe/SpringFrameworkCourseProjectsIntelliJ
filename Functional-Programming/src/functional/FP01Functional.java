package functional;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(122,159,687,672,541,98);
//      ListOfNumbersFunctional(numbers);
//      EvenNumbersFunctional(numbers);
//      OddNumbersFunctional(numbers);
//        SquaresOfEvenNumbersFunctional(numbers);
        cubesOfOddNumbersFunctional(numbers);


    }

//    private static  void print(int number){
//        System.out.println(number);
//    }

//    private static boolean isEven(int number){
//        return number%2 == 0;
//    }
    private static void ListOfNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
//              .forEach(functional.FP01Functional::print);
                .forEach(System.out::println);   //Method Reference
    }

                    //Filter - Only allow Even Numbers
//    private static void EvenNumbersFunctional(List<Integer> numbers) {
//        numbers.stream()
//                .filter(functional.FP01Functional::isEven)
//                .forEach(System.out::println);   //Method Reference
//    }

                //LAMBDA EXPRESSION
    private static void EvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 0)
                .forEach(System.out::println);   //Method Reference
    }

    //MAPPING
    private static void SquaresOfEvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 0)
                //mapping
                .map(number -> number * number)  //square
                .forEach(System.out::println);   //Method Reference
    }

    private static void OddNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 1)  //Or != 1
                .forEach(System.out::println);   //Method Reference
    }

    //MAPPING
    private static void cubesOfOddNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 1)  //Or != 1
                //mapping
                .map(number -> number * number * number)  //cubes
                .forEach(System.out::println);   //Method Reference
    }
}
