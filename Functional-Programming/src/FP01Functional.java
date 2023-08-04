import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        ListOfNumbersFunctional(List.of(122,156,687,672,540,988));

    }

//    private static  void print(int number){
//        System.out.println(number);
//    }

    private static void ListOfNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
//              .forEach(FP01Functional::print);
                .forEach(System.out::println);
    }

    private static void EvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
//
                .forEach(System.out::println);
    }

}
