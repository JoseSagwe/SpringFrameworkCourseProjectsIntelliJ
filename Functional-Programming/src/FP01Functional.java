import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

//        ListOfNumbersFunctional(List.of(122,159,687,672,540,988));
        EvenNumbersFunctional(List.of(122,159,687,672,541,988));

    }


//    private static  void print(int number){
//        System.out.println(number);
//    }

//    private static boolean isEven(int number){
//        return number%2 == 0;
//    }
    private static void ListOfNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
//              .forEach(FP01Functional::print);
                .forEach(System.out::println);   //Method Reference
    }

    

                    //Filter - Only allow Even Numbers
//    private static void EvenNumbersFunctional(List<Integer> numbers) {
//        numbers.stream()
//                .filter(FP01Functional::isEven)
//                .forEach(System.out::println);   //Method Reference
//    }


                //LAMBDA EXPRESSION
    private static void EvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 0)
                .forEach(System.out::println);   //Method Reference
    }
}
