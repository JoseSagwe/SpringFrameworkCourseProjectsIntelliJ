import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        ListOfNumbersFunctional(List.of(12,15,67,62,54,98));

    }

    private static  void print(int number){
        System.out.println(number);
    }

    private static void ListOfNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(FP01Functional::print);
    }
}
