import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {

//        ListOfNumbersStructured(List.of(12,15,67,62,54,98));
        EvenListOfNumbersStructured(List.of(23,152,674,62,44,98));

    }
    private static void ListOfNumbersStructured(List<Integer> numbers) {
        for(int number:numbers){
            System.out.println(number);
        }
    }

    private static void EvenListOfNumbersStructured(List<Integer> numbers) {
        for(int number:numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
