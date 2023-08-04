import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        ListOfNumbers(List.of(12,15,67,62,54,98));

    }

    private static void ListOfNumbers(List<Integer> numbers) {
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
