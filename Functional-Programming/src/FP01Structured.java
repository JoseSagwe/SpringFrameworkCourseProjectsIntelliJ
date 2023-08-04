import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {

        ListOfNumbersStructured(List.of(12,15,67,62,54,98));

    }

    private static void ListOfNumbersStructured(List<Integer> numbers) {
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
